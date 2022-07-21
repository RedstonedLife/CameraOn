package com.bss.inc.cameraon.utils;

import com.bss.inc.cameraon.utils.net.angryscan.core.ScannerDispatcherThread;
import com.bss.inc.cameraon.utils.net.angryscan.core.ScannerDispatcherThreadFactory;
import com.bss.inc.cameraon.utils.net.angryscan.core.ScanningProgressCallback;
import com.bss.inc.cameraon.utils.net.angryscan.feeders.RangeFeeder;
import com.bss.inc.cameraon.utils.net.angryscan.state.PingerRegistry;
import com.bss.inc.cameraon.utils.net.angryscan.state.state.ScanningState;
import com.bss.inc.cameraon.utils.net.angryscan.state.state.StateMachine;
import com.bss.inc.cameraon.utils.net.angryscan.state.state.StateTransitionListener;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressBar;

public class $UI$02 implements StateTransitionListener, ScanningProgressCallback {
    private ScannerDispatcherThreadFactory scannerThreadFactory;
    private ScannerDispatcherThread scannerThread;
    private PingerRegistry pingerRegistry;

    private String mainWindowTitle;
    private ProgressBar progressBar;
    private StateMachine stateMachine;
    private Button button;
    private String startIpAddress,endIpAddress;

    public $UI$02(ScannerDispatcherThreadFactory scannerThreadFactory, StateMachine stateMachine,
                  ProgressBar progressBar, PingerRegistry pingerRegistry, Button startStopButton) {
        this.scannerThreadFactory = scannerThreadFactory;
        this.progressBar = progressBar;
        this.pingerRegistry = pingerRegistry;
        this.button = startStopButton;
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
                }
            }
        }
    }
}
