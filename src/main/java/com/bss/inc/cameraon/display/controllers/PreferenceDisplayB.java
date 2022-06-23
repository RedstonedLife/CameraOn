package com.bss.inc.cameraon.display.controllers;

import com.bss.inc.cameraon.MainClass;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class PreferenceDisplayB {
    private MainClass instance = new MainClass();
    @FXML
    private void closeApp(ActionEvent event) {instance.getWindowManager().closeDialog("preferencesDialog");}
}
