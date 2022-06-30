package com.redsoftware.ltd.bnc.utils.networking.angryscan.core;

import com.redsoftware.ltd.bnc.utils.networking.angryscan.Scanner;
import com.redsoftware.ltd.bnc.utils.networking.angryscan.ScanningResultList;
import com.redsoftware.ltd.bnc.utils.networking.angryscan.config.ScannerConfig;
import com.redsoftware.ltd.bnc.utils.networking.angryscan.feeders.Feeder;
import com.redsoftware.ltd.bnc.utils.networking.angryscan.net.state.StateMachine;

public class ScannerDispatcherThreadFactory {
    private ScanningResultList scanningResults;
    private Scanner scanner;
    private StateMachine stateMachine;
    private ScannerConfig scannerConfig;

    public ScannerDispatcherThreadFactory(ScanningResultList scanningResults, Scanner scanner, StateMachine stateMachine, ScannerConfig scannerConfig) {
        this.scanningResults = scanningResults;
        this.scanner = scanner;
        this.stateMachine = stateMachine;
        this.scannerConfig = scannerConfig;
    }

    public ScannerDispatcherThread createScannerThread(Feeder feeder, ScanningProgressCallback progressCallback, ScanningResultCallback resultsCallback) {
        return new ScannerDispatcherThread(feeder, scanner, stateMachine, progressCallback, scanningResults, scannerConfig, resultsCallback);
    }
}
