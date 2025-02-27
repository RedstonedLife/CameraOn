package com.bss.inc.cameraon.utils.net.angryscan.core;

import com.bss.inc.cameraon.MainClass;
import com.bss.inc.cameraon.utils.net.angryscan.Scanner;
import com.bss.inc.cameraon.utils.net.angryscan.ScanningResult;
import com.bss.inc.cameraon.utils.net.angryscan.ScanningResultList;
import com.bss.inc.cameraon.utils.net.angryscan.ScanningSubject;
import com.bss.inc.cameraon.utils.net.angryscan.config.ScannerConfig;
import com.bss.inc.cameraon.utils.net.angryscan.feeders.Feeder;
import com.bss.inc.cameraon.utils.net.angryscan.state.state.ScanningState;
import com.bss.inc.cameraon.utils.net.angryscan.state.state.StateMachine;
import com.bss.inc.cameraon.utils.net.angryscan.state.state.StateTransitionListener;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

import static com.bss.inc.cameraon.utils.net.angryscan.state.state.ScanningState.KILLING;
import static com.bss.inc.cameraon.utils.net.angryscan.state.state.ScanningState.SCANNING;
import static com.bss.inc.cameraon.utils.net.angryscan.utils.InetAddressUtils.isLikelyBroadcast;
import static java.util.concurrent.TimeUnit.MILLISECONDS;

public class ScannerDispatcherThread extends Thread implements ThreadFactory, StateTransitionListener {

    private static final long UI_UPDATE_INTERVAL_MS = 150;
    private ScannerConfig config;
    private Scanner scanner;
    private StateMachine stateMachine;
    private ScanningResultList scanningResultList;
    private Feeder feeder;

    private AtomicInteger numActiveThreads = new AtomicInteger();
    ThreadGroup threadGroup;
    ExecutorService threadPool;

    private ScanningProgressCallback progressCallback;
    private ScanningResultCallback resultsCallback;

    public ScannerDispatcherThread(Feeder feeder, Scanner scanner, StateMachine stateMachine, ScanningProgressCallback progressCallback, ScanningResultList scanningResults, ScannerConfig scannerConfig, ScanningResultCallback resultsCallback) {
        setName(getClass().getSimpleName());
        this.config = scannerConfig;
        this.stateMachine = stateMachine;
        this.progressCallback = progressCallback;
        this.resultsCallback = resultsCallback;

        this.threadGroup = new ThreadGroup(getName());
        this.threadPool = Executors.newFixedThreadPool(config.maxThreads, this);

        // this thread is daemon because we want JVM to terminate it
        // automatically if user closes the program (Main thread, that is)
        setDaemon(true);

        this.feeder = feeder;
        this.scanner = scanner;
        this.scanningResultList = scanningResults;
        try {
            this.scanningResultList.initNewScan(feeder);
            // initialize in the main thread in order to catch exceptions gracefully
            scanner.init(feeder);
        }
        catch (RuntimeException e) {
            stateMachine.reset();
            throw e;
        }
    }

    public void run() {
        try {
            // register this scan specific listener
            MainClass.getStateMachine().addTransitionListener(this);
            long lastNotifyTime = 0;

            try {
                ScanningSubject subject = null;
                while(feeder.hasNext() && stateMachine.inState(SCANNING)) {
                    // make a small delay between thread creation
                    Thread.sleep(config.threadDelay);

                    if ((numActiveThreads.intValue() < config.maxThreads)) {
                        subject = feeder.next();

                        if (config.skipBroadcastAddresses && isLikelyBroadcast(subject.getAddress(), subject.getIfAddress()))
                            continue;

                        ScanningResult result = scanningResultList.createResult(subject.getAddress());
                        resultsCallback.prepareForResults(result);

                        // scan each IP in parallel, in a separate thread
                        AddressScannerTask scanningTask = new AddressScannerTask(subject, result);
                        threadPool.execute(scanningTask);
                    }

                    // notify listeners of the progress we are doing (limiting the update rate)
                    long now = System.currentTimeMillis();
                    if (now - lastNotifyTime >= UI_UPDATE_INTERVAL_MS && subject != null) {
                        lastNotifyTime = now;
                        progressCallback.updateProgress(subject.getAddress(), numActiveThreads.intValue(), feeder.percentageComplete());
                    }
                }
            }
            catch (InterruptedException e) {
                // interrupt - end the loop
            }
            progressCallback.getStatus().setText("");
            // inform that no more addresses left
            stateMachine.stop();

            // request shutdown of the thread pool
            // this must be done here and not asynchronously by the state machine
            threadPool.shutdown();

            try {
                // now wait for all threads, which are still running
                while (!threadPool.awaitTermination(UI_UPDATE_INTERVAL_MS, MILLISECONDS)) {
                    progressCallback.updateProgress(null, numActiveThreads.intValue(), 1);
                }
            }
            catch (InterruptedException e) {
                // just end the loop
            }

            scanner.cleanup();

            // finally, the scanning is complete
            stateMachine.complete();
            progressCallback.getStatus().setText("");
            progressCallback.returnResults();
        }
        finally {
            // unregister specific listener
            stateMachine.removeTransitionListener(this);
        }
    }

    /**
     * Local stateMachine transition listener.
     * Currently used to kill all running threads if user says so.
     */
    public void transitionTo(ScanningState state, StateMachine.Transition transition) {
        if (state == KILLING) {
            // try to interrupt all threads if we get to killing state
            threadGroup.interrupt();
        }
    }

    /**
     * This will create threads for the pool
     */
    public Thread newThread(Runnable r) {
        // create IP threads in the specified group
        return new Thread(threadGroup, r) {
            // IP threads must be daemons, not preventing the JVM to terminate
            { setDaemon(true); }

            @Override
            public void interrupt() {
                scanner.interrupt(this);
                super.interrupt();
            }
        };
    }

    /**
     * This thread gets executed for each scanned IP address to do the actual
     * scanning.
     */
    class AddressScannerTask implements Runnable {
        private ScanningSubject subject;
        private ScanningResult result;

        AddressScannerTask(ScanningSubject subject, ScanningResult result) {
            this.subject = subject;
            this.result = result;
            numActiveThreads.incrementAndGet();
        }

        public void run() {
            // set current thread's name to ease debugging
            Thread.currentThread().setName(getClass().getSimpleName() + ": " + subject);

            try {
                scanner.scan(subject, result);
                resultsCallback.consumeResults(result);
            }
            finally {
                numActiveThreads.decrementAndGet();
            }
        }
    }
}
