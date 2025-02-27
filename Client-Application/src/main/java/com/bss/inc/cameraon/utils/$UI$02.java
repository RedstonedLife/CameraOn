package com.bss.inc.cameraon.utils;

import com.bss.inc.cameraon.MainClass;
import com.bss.inc.cameraon.logging.ScanFileManager;
import com.bss.inc.cameraon.utils.net.angryscan.ScanningResult;
import com.bss.inc.cameraon.utils.net.angryscan.ScanningResultList;
import com.bss.inc.cameraon.utils.net.angryscan.config.ScannerConfig;
import com.bss.inc.cameraon.utils.net.angryscan.core.ScannerDispatcherThread;
import com.bss.inc.cameraon.utils.net.angryscan.core.ScannerDispatcherThreadFactory;
import com.bss.inc.cameraon.utils.net.angryscan.core.ScanningProgressCallback;
import com.bss.inc.cameraon.utils.net.angryscan.core.ScanningResultCallback;
import com.bss.inc.cameraon.utils.net.angryscan.enums.DisplayResultType;
import com.bss.inc.cameraon.utils.net.angryscan.feeders.RangeFeeder;
import com.bss.inc.cameraon.utils.net.angryscan.fetchers.Fetcher;
import com.bss.inc.cameraon.utils.net.angryscan.state.PingerRegistry;
import com.bss.inc.cameraon.utils.net.angryscan.state.state.ScanningState;
import com.bss.inc.cameraon.utils.net.angryscan.state.state.StateMachine;
import com.bss.inc.cameraon.utils.net.angryscan.state.state.StateTransitionListener;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextArea;
import javafx.scene.text.Text;

import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

import static com.bss.inc.cameraon.utils.net.angryscan.state.state.ScanningState.RESTARTING;

public class $UI$02 implements StateTransitionListener, ScanningProgressCallback {
    private ScannerDispatcherThreadFactory scannerThreadFactory;
    private ScannerDispatcherThread scannerThread;
    private PingerRegistry pingerRegistry;
    private ResultTable resultTable;

    private String mainWindowTitle;
    private ProgressBar Bar;
    private ProgressBar subBar;
    private Text barTitle,subBarTitle;
    private StateMachine stateMachine;
    private TextArea status;
    private Button button;
    private ScannerConfig scannerConfig;
    private String startIpAddress,endIpAddress;
    private List<ScanningResult> results = new ArrayList<>();
    private ScanFileManager sfm;

    public $UI$02(ScannerDispatcherThreadFactory scannerThreadFactory, StateMachine stateMachine,
                  PingerRegistry pingerRegistry, ScannerConfig scannerConfig) {
        this.scannerThreadFactory = scannerThreadFactory;
        this.pingerRegistry = pingerRegistry;
        this.scannerConfig = scannerConfig;
        this.resultTable = new ResultTable(MainClass.getScanningResults(),stateMachine);
        this.stateMachine = stateMachine;

        // add listeners to all state changes
        stateMachine.addTransitionListener(this);
        ScanningState state = stateMachine.getState();
        this.sfm = new ScanFileManager();
    }

    public void addBar(ProgressBar progressBar) {
        this.Bar = progressBar;
    }

    public void addBarTitle(Text text) {
        this.barTitle = text;
    }

    public void addSubBar(ProgressBar progressBar) {
        this.subBar = progressBar;
    }

    public void addSubBarTitle(Text text) {
        this.subBarTitle = text;
    }

    public void addButton(Button startStopButton) {
        this.button = startStopButton;
    }

    public void addTextArea(TextArea textArea) {
        this.status = textArea;
    }

    public void setStartIpAddress(String ip) {
        this.startIpAddress = ip;
    }

    public void setEndIpAddress(String ip) {
        this.endIpAddress = ip;
    }

    public void transitionTo(final ScanningState state, final StateMachine.Transition transition) {
        barTitle.setText("Tasks Left ?/4 (?) | Current State: " + state.toString());
        if(transition == StateMachine.Transition.INIT) {subBarTitle.setText("");return;}
        // TODO: Enhance?
        switch(state) {
            case IDLE -> {
                button.setDisable(false);
                break;
            }
            case STARTING -> {
                if(transition != StateMachine.Transition.CONTINUE) {
                    sfm.wipe();
                    resultTable.removeAll();
                }
                try {
                    scannerThread = scannerThreadFactory.createScannerThread(new RangeFeeder(startIpAddress, endIpAddress), this, createResultsCallback(state));
                    stateMachine.startScanning();
                } catch (RuntimeException e) {
                    stateMachine.reset();
                    throw e;
                }
            }
            case RESTARTING -> {
                // restart the scanning - rescan
                try {
                    scannerThread = scannerThreadFactory.createScannerThread(new RangeFeeder(startIpAddress, endIpAddress), this, createResultsCallback(state));
                    stateMachine.startScanning();
                } catch (RuntimeException e) {
                    stateMachine.reset();
                    throw e;
                }
                break;
            }
            case SCANNING -> {
                scannerThread.start();
                break;
            }
            case STOPPING -> {
                break;
            }
            case KILLING -> {
                break;
            }
        }
    }

    private ScanningResultCallback createResultsCallback(ScanningState state) {
        // rescanning must follow the same strategy of displaying all hosts (even the dead ones), because the results are already in the list
        if (scannerConfig.displayResultType == DisplayResultType.ALL || state == RESTARTING) {
            return new ScanningResultCallback() {
                public void prepareForResults(ScanningResult result) {
                    resultTable.addOrUpdateResultRow(result);
                }
                public void consumeResults(ScanningResult result) {
                    resultTable.addOrUpdateResultRow(result);results.add(result);
                }
            };
        }
        if (scannerConfig.displayResultType == DisplayResultType.ALIVE || scannerConfig.displayResultType == DisplayResultType.OPEN_PORTS_ONLY) {
            return new ScanningResultCallback() {
                public void prepareForResults(ScanningResult result) {
                }
                public void consumeResults(ScanningResult result) {
                    if (result.getType().ordinal() >= DisplayResultType.ALIVE.ordinal())
                    {resultTable.addOrUpdateResultRow(result);results.add(result);}
                }
            };
        }
        throw new UnsupportedOperationException(scannerConfig.displayResultType.toString());
    }

    @Override
    public void updateProgress(InetAddress currentAddress, int runningThreads, double percentageComplete) {
        if(currentAddress!=null) {
            barTitle.setText("Tasks Left 1/4 (Scanning) | Current Scanner State: " + stateMachine.getState().toString());
            subBarTitle.setText("Scanning ("+((currentAddress == null) ? "N/A" : currentAddress.getHostAddress().toString())+") | " + ("%.2f".formatted(percentageComplete*100)) + "%");
            if(status.getText().length() < 80000) {status.setText("");}
            status.appendText(
                "Trying " +
                        ((currentAddress == null) ? "N/A" : currentAddress.getHostAddress().toString()) +
                        " | Running Threads: " + String.valueOf(runningThreads) + " | Percent Complete: " +
                        ("%.2f".formatted(percentageComplete*100)) + "%\n");
            subBar.setProgress(percentageComplete);
            Bar.setProgress(.25d);
        }
        else {
            barTitle.setText("Tasks Left 2/4 (Stopping Threads) | Current Scanner State: " + stateMachine.getState().toString());
            subBarTitle.setText("Closing Threads ("+runningThreads+" Threads Left)");
            if(status.getText().length() < 80000) {status.setText("");}
            status.appendText("Closing Threads | Threads Left: " + runningThreads + "\n");
            Bar.setProgress(.5d);
        }

    }

    @Override
    public void returnResults() {
        barTitle.setText("Tasks Left 3/4 (Parsing Results) | Current Scanner State: " + stateMachine.getState().toString());
        Bar.setProgress(0.75d);
        subBar.setProgress(0.0d);
        subBarTitle.setText("Parsing Results (0/"+(resultTable.getResults().size()-1)+") | 0.0% ");
        double perInc = Math.abs(1.0 / (resultTable.getResults().size()+1));
        for(int i=0; i<resultTable.getResults().size(); i++) {
            StringBuilder sb = new StringBuilder(1024);
            Iterator<?> iterator = resultTable.getResults().get(i).getValues().iterator();
            List<Fetcher> fetchers = resultTable.getScanningResults().getFetchers();
            for (int j = 0; iterator.hasNext(); j++) {
                String fetcherName = fetchers.get(j).getName();
                sb.append(fetcherName.toUpperCase(Locale.ENGLISH)).append("-");
                Object value = iterator.next();
                sb.append(value != null ? value : "");
                sb.append(":");
            }
            sb.append("TYPE-"+resultTable.getResults().get(i).getType().toString());
            sfm.append(sb.toString());
            if(status.getText().length() < 80000) {status.setText("");}
            status.appendText(sb.toString()+"\n");
            subBarTitle.setText("Parsing Results ("+i+"/"+(resultTable.getResults().size()-1)+") | "  + ("%.2f".formatted(subBar.getProgress()*100)) + "%");
            subBar.setProgress(subBar.getProgress()+perInc);
            try {
                TimeUnit.MILLISECONDS.sleep(20);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        copyResultsToCache();
    }


    public void copyResultsToCache() {
        barTitle.setText("Tasks Left 4/4 (Copying To Cache) | Current Scanner State: " + stateMachine.getState().toString());
        Bar.setProgress(1d);
        subBar.setProgress(0.0d);
        subBarTitle.setText("Parsing Results To Cache (0/"+(resultTable.getResults().size()-1)+") | 0.0%");
        double perInc = Math.abs(1.0 / (resultTable.getResults().size()+1));
        for(int i=0; i<resultTable.getResults().size(); i++) {
            subBarTitle.setText("Parsing Results To Cache ("+i+"/"+(resultTable.getResults().size()-1)+") | "  + ("%.2f".formatted(subBar.getProgress()*100)) + "%");
            results.add(resultTable.getResults().get(i));
            subBar.setProgress(subBar.getProgress()+perInc);
            try {
                TimeUnit.MILLISECONDS.sleep(20);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        subBar.setProgress(0d);
        subBarTitle.setText("Clearing Results (0/"+(resultTable.getResults().size()-1)+") | 0.0%");
        for(int i=resultTable.getResults().size() - 1; i >= 1; i--) {
            subBarTitle.setText("Clearing Results ("+i+"/"+(resultTable.getResults().size()-1)+") | " + ("%.2f".formatted(subBar.getProgress()*100)) + "%");
            subBar.setProgress(subBar.getProgress()+perInc);
            resultTable.getResults().remove(i);
            try {
                TimeUnit.MILLISECONDS.sleep(20);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        barTitle.setText("Scanning Status: DONE | Current Scanner State: " + stateMachine.getState().toString());
        subBarTitle.setText("");
        subBar.setProgress(0.0d);
    }

    @Override
    public TextArea getStatus() {return status;}
}

class ResultTable {
    private List<ScanningResult> results = new ArrayList<ScanningResult>();
    private ScanningResultList scanningResults;

    public ResultTable(ScanningResultList scanningResults, StateMachine stateMachine) {
        this.scanningResults = scanningResults;
    }

    /**
     * Adds the specified results holder to the table and registers it
     * in the ScanningResultList instance or just redraws the corresponding row
     * if the result is already present.
     * <p/>
     * Note: this method may be called from any thread.
     *
     * @param result
     */
    public void addOrUpdateResultRow(final ScanningResult result) {
        if (scanningResults.isRegistered(result)) {
            scanningResults.update(result);
        }
        if(results.contains(result)) {
            results.set(results.indexOf(result), result);
        } else {
            results.add(result);
        }
    }
    public void updateResult(int index, String fetcherId, Object newValue) {
        int fetcherIndex = scanningResults.getFetcherIndex(fetcherId);
        if (fetcherIndex >= 0) {
            scanningResults.getResult(index).setValue(fetcherIndex, newValue);
        }
    }

    public void remove(int[] indices) {
        scanningResults.remove(indices);
        // TODO: this is VERY slow if there are a lot of items (eg 300k), due to the Control.sort() that is called inside to sort the indices
    }

    public void removeAll() {
        // remove all items from the real storage first
        scanningResults.clear();
    }

    public ScanningResultList getScanningResults() {
        return scanningResults;
    }

    public List<ScanningResult> getResults() {
        return results;
    }
}
