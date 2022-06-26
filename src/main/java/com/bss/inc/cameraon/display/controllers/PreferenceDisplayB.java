package com.bss.inc.cameraon.display.controllers;

import com.bss.inc.cameraon.MainClass;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class PreferenceDisplayB {
    @FXML private void closeApp(ActionEvent event) {MainClass.getWindowManager().getDialog("mainWindow").changeScene(MainClass.getWindowManager().getDialog("mainWindow").getCurrentScene());}

}
