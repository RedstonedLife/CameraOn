package com.bss.inc.cameraon.display.controllers;

import com.bss.inc.cameraon.MainClass;
import com.bss.inc.cameraon.constants.FrontendPaths;
import com.bss.inc.cameraon.utils.$UI$01;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.awt.*;
import java.net.URL;
import java.util.ResourceBundle;

import static com.bss.inc.cameraon.i18n.I18n.tl;

public class PreferenceDisplayB implements Initializable {
    @FXML private void closeApp(ActionEvent event) {$UI$01.u_06$1$1();}
    @FXML private Button btnClose,asSceneBtn,displaySceneBtn;

    @FXML private TextField threadsDelayTf,threadsMaxTf,defaultPortTimeoutTf,minAdptdConTimeoutTf,pingProbesTf,pingTimeoutTf;
    @FXML private TextArea portToScanTa;
    @FXML private ChoiceBox<String> pingMethodCb;
    @FXML private Checkbox scanDeadHostsCHKb,skipUnassignedCHKb,adaptTimeoutToPingCHKb,forEachHostsCHKb;

    private void initializeLanguage() {
        displaySceneBtn.setText(tl("preferences.btn.display.text"));
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        $UI$01.u_08$1$2();
        asSceneBtn.setOnAction(e -> {MainClass.getWindowManager().changeDialogScene("preferencesDialog",MainClass.class.getResource(FrontendPaths.PREF_DISPLAY_AS_FXML));});
        displaySceneBtn.setOnAction(e -> {MainClass.getWindowManager().changeDialogScene("preferencesDialog",MainClass.class.getResource(FrontendPaths.PREF_DISPLAY_FXML));});
        initializeLanguage();
    }
}
