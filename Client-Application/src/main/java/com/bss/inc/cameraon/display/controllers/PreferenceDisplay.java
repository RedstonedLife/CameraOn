package com.bss.inc.cameraon.display.controllers;

import com.bss.inc.cameraon.MainClass;
import com.bss.inc.cameraon.constants.FrontendPaths;
import com.bss.inc.cameraon.utils.$UI$01;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ResourceBundle;

public class PreferenceDisplay implements Initializable {
    @FXML private Button asSceneBtn,okBtn,cancelBtn,btnClose;
    @FXML private Button displaySceneBtn;

    @FXML private TextField naTf,nsTf;
    @FXML private CheckBox askConfirmNewScanCHKb,showInfoDialogCHKb;
    @FXML private RadioButton allScannedHostsRb, aliveHostsRb, openPortHostsRb;

    /*@FXML private Text threadtxt,t1txt,t2txt,pingtxt,p1txt,p2txt,p3txt,p4txt,skiptxt,s1txt,timetxt,tt1txt,tt2txt,tt3txt,portstxt,ps1txt,ps2txt,ps3txt,ps4txt;*/

    /*private void initializeLanguage() {
        displaySceneBtn.setText(tl("preferences.btn.display.text"));
        threadtxt.setText(tl("preferences.threads.text"));
        t1txt.setText(tl("preferences.threads.t1"));
        t2txt.setText(tl("preferences.threads.t2"));
        pingtxt.setText(tl("preferences.pinging.text"));
        p1txt.setText(tl("preferences.pinging.p1"));
        p2txt.setText(tl("preferences.pinging.p2"));
        p3txt.setText(tl("preferences.pinging.p3"));
        p4txt.setText(tl("preferences.pinging.p4"));
        skiptxt.setText(tl("preferences.skipping.text"));
        s1txt.setText(tl("preferences.skipping.s1"));
        timetxt.setText(tl("preferences.timing.text"));
        tt1txt.setText(tl("preferences.timing.ti1"));
        tt2txt.setText(tl("preferences.timing.ti2"));
        tt3txt.setText(tl("preferences.timing.ti3"));
        portstxt.setText(tl("preferences.portselection.text"));
        ps1txt.setText(tl("preferences.portselection.ps1"));
        ps2txt.setText(tl("preferences.portselection.ps2"));
        ps3txt.setText(tl("preferences.portselection.ps3"));
        ps4txt.setText(tl("preferences.portselection.ps4"));
    }*/

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        asSceneBtn.setOnAction(e -> {MainClass.getWindowManager().changeDialogScene("preferencesDialog",MainClass.class.getResource(FrontendPaths.PREF_DISPLAY_AS_FXML));});
        displaySceneBtn.setOnAction(e -> {MainClass.getWindowManager().changeDialogScene("preferencesDialog",MainClass.class.getResource(FrontendPaths.PREF_DISPLAY_FXML));});
        btnClose.setOnAction(e->{$UI$01.u_06$1$1();});
        cancelBtn.setOnAction(e->{$UI$01.u_06$1$1();});
        okBtn.setOnAction(e->{try {$UI$01.u_08$1$5();$UI$01.u_09$1$3();} catch (FileNotFoundException ex) {throw new RuntimeException(ex);}
            $UI$01.u_06$1$1();});

        $UI$01.u_09$1$4(new TextField[]{naTf,nsTf}, new CheckBox[]{askConfirmNewScanCHKb, showInfoDialogCHKb}, new RadioButton[]{allScannedHostsRb, aliveHostsRb, openPortHostsRb});
        $UI$01.u_09$1$1();
        $UI$01.u_09$1$2();
        //initializeLanguage();
    }
}
