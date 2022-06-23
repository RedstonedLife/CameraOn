package com.bss.inc.cameraon.display.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class PreferenceDisplayB {
    @FXML
    private void closeApp(ActionEvent event) {instance.getWindowManager().closeDialog("preferencesDialog");}
}
