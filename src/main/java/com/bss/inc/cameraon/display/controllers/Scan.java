package com.bss.inc.cameraon.display.controllers;

import com.bss.inc.cameraon.MainClass;
import com.bss.inc.cameraon.exceptions.HALT_AND_CATCH_FIRE;
import com.bss.inc.cameraon.utils.$UI$01;
import com.bss.inc.cameraon.utils.$UI$02;
import com.bss.inc.cameraon.utils.net.angryscan.Scanner;
import com.bss.inc.cameraon.utils.net.angryscan.ScanningResultList;
import com.bss.inc.cameraon.utils.net.angryscan.core.ScannerDispatcherThreadFactory;
import com.bss.inc.cameraon.utils.net.angryscan.state.state.ScanningState;
import com.bss.inc.cameraon.utils.net.angryscan.state.state.StateMachine;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.Map;
import java.util.ResourceBundle;

import static com.bss.inc.cameraon.i18n.I18n.tl;

public class Scan implements Initializable {

    @FXML private Button settingsSceneBtn,cctvSceneBtn,scanSceneBtn,applySceneBtn,prefBtn,scanBtn,HelpBtn,btnClose,btnMinimize;
    @FXML private ChoiceBox<String> scanAlgCb;
    @FXML private SplitPane cmainsplit;
    @FXML private Text taskslefttxt,backendtxt,scanningalgotxt,scanstatustxt,versiontxt,licensetxt,iprangeTxt,iprangetoTxt;
    @FXML private TextField iprangetoTf,iprangefromTf;
    @FXML private ProgressBar tasksLeftScan;
    private static $UI$02 UI02 = MainClass.getUi02();
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        $UI$01.u_05$1$1(scanAlgCb,0,new String[]{"AngryScan","IB-Scan","CB-Scan"});
        $UI$01.u_01$1$1(cmainsplit,new Button[]{settingsSceneBtn,cctvSceneBtn,applySceneBtn,scanSceneBtn,HelpBtn});
        $UI$01.u_04$1$1(prefBtn);
        $UI$01.u_10$1$1(btnClose);
        $UI$01.u_10$1$2(btnMinimize,"mainWindow");
        UI02.addBar(tasksLeftScan);
        UI02.addButton(scanBtn);
        scanBtn.setOnAction(e -> {
            UI02.setStartIpAddress(iprangefromTf.getText());
            UI02.setEndIpAddress(iprangetoTf.getText());
            switch (MainClass.getStateMachine().getState()) {
                case SCANNING -> {MainClass.getStateMachine().stop();break;}
                case STOPPING -> {break;}
                case KILLING -> {break;}
                case RESTARTING -> {break;}
                case STARTING -> {break;}
                case IDLE -> {MainClass.getStateMachine().startScanning();}
            }
        });
        //BNC.getStateMachine().addTransitionListener(this);
        // I18n
        $UI$01.u_02$1$1(Map.ofEntries(
                Map.entry(settingsSceneBtn, tl("settings.btn.text")),
                Map.entry(cctvSceneBtn, tl("settings.cctv.btn.text")),
                Map.entry(scanSceneBtn, tl("scan.btn.text")),
                Map.entry(applySceneBtn, tl("apply.btn.text")),
                Map.entry(prefBtn, tl("preferences.btn.text")),
                Map.entry(scanBtn, tl("scan.btn.text"))
        ));
        /*$UI$01.u_03$1$1(Map.ofEntries(
                Map.entry(taskslefttxt,tl("scan.text.left")),
                Map.entry(taskslefttxt,tl("scan.text.left")),
                Map.entry(backendtxt,tl("scan.text.default","")),
                Map.entry(scanningalgotxt,tl("scan.algorithm.text")),
                Map.entry(scanstatustxt,tl("scan.text.status")),
                Map.entry(versiontxt,tl("version.format",aa.VERSION_TEXT,aa.BUILD)),
                Map.entry(licensetxt,tl("license.format",aa.LICENSEE,aa.LICENSEKEY))
        ));*/
    }

}
