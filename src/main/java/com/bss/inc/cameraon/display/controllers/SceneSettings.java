package com.bss.inc.cameraon.display.controllers;

import com.bss.inc.cameraon.MainClass;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.SplitPane;
import javafx.scene.text.Text;

public class SceneSettings {
    @FXML private ChoiceBox<String> langCb;
    @FXML private SplitPane cmainsplit;
    @FXML private Button settingsSceneBtn,cctvSceneBtn,scanSceneBtn,applySceneBtn,HelpBtn;
    @FXML private Text languagetxt,versiontxt,licensetxt;
    @FXML private Button btnClose;
    @FXML private Button btnMinimize;

    private MainClass instance = new MainClass();
    // # Close Window Button
    @FXML private void closeApp(ActionEvent event) {MainClass.getWindowManager().closeDialogs();}
    // # Minimize Window Button
    @FXML private void minimizeApp(ActionEvent event) {MainClass.getWindowManager().minimizeDialog("mainWindow");}
}
