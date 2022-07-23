package com.bss.inc.cameraon.utils;

import com.bss.inc.cameraon.MainClass;
import com.bss.inc.cameraon.utils.net.angryscan.ScanningResult;
import com.bss.inc.cameraon.utils.net.angryscan.ScanningResultList;
import com.bss.inc.cameraon.utils.net.angryscan.config.ScannerConfig;
import com.bss.inc.cameraon.utils.net.angryscan.core.ScannerDispatcherThread;
import com.bss.inc.cameraon.utils.net.angryscan.core.ScannerDispatcherThreadFactory;
import com.bss.inc.cameraon.utils.net.angryscan.core.ScanningProgressCallback;
import com.bss.inc.cameraon.utils.net.angryscan.core.ScanningResultCallback;
import com.bss.inc.cameraon.utils.net.angryscan.enums.DisplayResultType;
import com.bss.inc.cameraon.utils.net.angryscan.feeders.RangeFeeder;
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
import java.util.List;

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
        if(transition == StateMachine.Transition.INIT)
            return;
        // TODO: Enhance?
        switch(state) {
            case IDLE -> {
                button.setDisable(false);
                break;
            }
            case STARTING -> {
                if(transition != StateMachine.Transition.CONTINUE) {
                    // Remove All Results
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
                button.setDisable(false);
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
                    resultTable.addOrUpdateResultRow(result);
                }
            };
        }
        if (scannerConfig.displayResultType == DisplayResultType.ALIVE || scannerConfig.displayResultType == DisplayResultType.OPEN_PORTS_ONLY) {
            return new ScanningResultCallback() {
                public void prepareForResults(ScanningResult result) {
                }
                public void consumeResults(ScanningResult result) {
                    if (result.getType().ordinal() >= DisplayResultType.ALIVE.ordinal())
                        resultTable.addOrUpdateResultRow(result);
                }
            };
        }
        throw new UnsupportedOperationException(scannerConfig.displayResultType.toString());
    }

    @Override
    public void updateProgress(InetAddress currentAddress, int runningThreads, double percentageComplete) {
        if(currentAddress!=null) {this.status.appendText(
                "Trying " +
                        ((currentAddress == null) ? "N/A" : currentAddress.getHostAddress().toString()) +
                        " | Running Threads: " + String.valueOf(runningThreads) + " | Percent Complete: " +
                        ("%.2f".formatted(percentageComplete*100)) + "%\n");}
        else {
            this.status.appendText("Closing threads\n");
        }
        Bar.setProgress(percentageComplete);
    }
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
}
