package com.bss.inc.cameraon.display.controllers;

import com.bss.inc.cameraon.MainClass;
import com.bss.inc.cameraon.constants.FrontendPaths;
import com.bss.inc.cameraon.utils.$UI$01;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import java.net.URL;
import java.util.ResourceBundle;

public class PreferenceDisplayB implements Initializable {
    @FXML private void closeApp(ActionEvent event) {$UI$01.u_06$1$1();}
    @FXML private Button btnClose,asSceneBtn,ibsSceneBtn,cbsSceneBtn,displaySceneBtn;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        asSceneBtn.setOnAction(e -> {MainClass.getWindowManager().changeDialogScene("preferencesDialog",MainClass.class.getResource(FrontendPaths.PREF_DISPLAY_AS_FXML));});
        ibsSceneBtn.setOnAction(e -> {MainClass.getWindowManager().changeDialogScene("preferencesDialog",MainClass.class.getResource(FrontendPaths.PREF_DISPLAY_IBS_FXML));});
        cbsSceneBtn.setOnAction(e -> {MainClass.getWindowManager().changeDialogScene("preferencesDialog",MainClass.class.getResource(FrontendPaths.PREF_DISPLAY_CBS_FXML));});
        displaySceneBtn.setOnAction(e -> {MainClass.getWindowManager().changeDialogScene("preferencesDialog",MainClass.class.getResource(FrontendPaths.PREF_DISPLAY_FXML));});
        initializeLanguage();
    }
}
