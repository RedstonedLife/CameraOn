package com.bss.inc.cameraon.display.controllers;

import com.bss.inc.cameraon.MainClass;
import com.bss.inc.cameraon.constants.FrontendPaths;
import com.bss.inc.cameraon.utils.$UI$01;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

public class WelcomeController implements Initializable {
    @FXML private Text licensetxt,versiontxt,showTxt;
    @FXML private CheckBox showChkB;
    @FXML private Button HelpBtn,StartBtn,ActivateBtn,btnMinimize,btnClose;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        HelpBtn.setCancelButton(true);
        ActivateBtn.setOnAction(e -> MainClass.getWindowManager().changeDialogScene("licenseWindow", MainClass.class.getResource(FrontendPaths.LICENSE_KEY_FXML)));
        StartBtn.setOnAction(e -> MainClass.getWindowManager().changeDialogScene("mainWindow", MainClass.class.getResource(FrontendPaths.SETTINGS_FXML)));
        $UI$01.u_10$1$1(btnClose);
        $UI$01.u_10$1$2(btnMinimize,"welcomeWindow");
    }
}
