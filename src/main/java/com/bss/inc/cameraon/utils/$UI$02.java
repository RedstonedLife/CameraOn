package com.bss.inc.cameraon.utils;

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

import java.util.ArrayList;
import java.util.List;

import static com.bss.inc.cameraon.utils.net.angryscan.state.state.ScanningState.RESTARTING;

public class $UI$02 implements StateTransitionListener, ScanningProgressCallback {
    private ScannerDispatcherThreadFactory scannerThreadFactory;
    private ScannerDispatcherThread scannerThread;
    private PingerRegistry pingerRegistry;

    private String mainWindowTitle;
    private ProgressBar progressBar;
    private StateMachine stateMachine;
    private Button button;
    private ScannerConfig scannerConfig;
    private String startIpAddress,endIpAddress;

    public $UI$02(ScannerDispatcherThreadFactory scannerThreadFactory, StateMachine stateMachine,
                  ProgressBar progressBar, PingerRegistry pingerRegistry, Button startStopButton, ScannerConfig scannerConfig) {
        this.scannerThreadFactory = scannerThreadFactory;
        this.progressBar = progressBar;
        this.pingerRegistry = pingerRegistry;
        this.button = startStopButton;
        this.scannerConfig = scannerConfig;
        this.stateMachine = stateMachine;

        // add listeners to all state changes
        stateMachine.addTransitionListener(this);
        ScanningState state = stateMachine.getState();
    }

    public void transitionTo(final ScanningState state, final StateMachine.Transition transition) {
        if(transition == StateMachine.Transition.INIT)
            return;
        // TODO: Enhance?
        switch(state) {
            case IDLE -> {
                button.setDisable(false);
                progressBar.setProgress(0.0d);
                break;
            }
            case STARTING -> {
                if(transition != StateMachine.Transition.CONTINUE) {
                    // Remove All Results
                }
                try {
                    scannerThread = scannerThreadFactory.createScannerThread(new RangeFeeder(startIpAddress, endIpAddress), $UI$02.this, createResultCallback(state));
                    stateMachine.startScanning();
                } catch (RuntimeException e) {
                    stateMachine.reset();
                    throw e;
                }
            }
            case RESTARTING -> {
                // restart the scanning - rescan
                try {
                    scannerThread = scannerThreadFactory.createScannerThread(new RangeFeeder(startIpAddress, endIpAddress), $UI$02.this, createResultsCallback(state));
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
        if (scannerConfig.displayResultType == DisplayResultType.ALIVE) {
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
}

class ResultTable implements StateTransitionListener {
    private List<ScanningResult> results = new ArrayList<ScanningResult>();
    private ScanningResultList scanningResults;

    public ResultTable() {

    }
}
