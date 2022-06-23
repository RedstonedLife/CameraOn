package com.bss.inc.cameraon.display.controllers;

import com.bss.inc.cameraon.MainClass;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

public class Scan implements Initializable {

    // # Close Window Button
    @FXML
    private void closeApp(ActionEvent event) {
        MainClass.getWindowManager().closeDialogs();}

    // # Minimize Window Button
    @FXML private void minimizeApp(ActionEvent event) {MainClass.getWindowManager().minimizeDialog("mainWindow");}

}
