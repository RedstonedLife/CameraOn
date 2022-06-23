package com.bss.inc.cameraon.display.controllers;

import com.bss.inc.cameraon.MainClass;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.SplitPane;
import javafx.stage.Stage;
import javafx.scene.text.Text;
import java.net.URL;
import java.util.ResourceBundle;

public class Apply implements Initializable {

    @FXML private Button settingsSceneBtn,cctvSceneBtn,scanSceneBtn,applySceneBtn,HelpBtn;
    @FXML private SplitPane cmainsplit;
    @FXML private Text taskslefttxt,backendtxt,applystatustxt,versiontxt,licensetxt;

    // # Close Window Button
    @FXML private void closeApp(ActionEvent event) {MainClass.getWindowManager().closeDialogs();}

    // # Minimize Window Button
    @FXML private void minimizeApp(ActionEvent event) {MainClass.getWindowManager().minimizeDialog("mainWindow");}

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        $UI$01.u_01$1$1(cmainsplit,new Button[]{settingsSceneBtn,cctvSceneBtn,applySceneBtn,scanSceneBtn,HelpBtn});
        // I18n
        settingsSceneBtn.setText(tl("settings.btn.text"));
        cctvSceneBtn.setText(tl("settings.cctv.btn.text"));
        scanSceneBtn.setText(tl("scan.btn.text"));
        applySceneBtn.setText(tl("apply.btn.text"));
        taskslefttxt.setText(tl("apply.task.left"));
        backendtxt.setText(tl("apply.task.default",""));
        applystatustxt.setText(tl("apply.task.status"));
        versiontxt.setText(tl("version.format",aa.VERSION_TEXT,aa.BUILD));
        licensetxt.setText(tl("license.format",aa.LICENSEE,aa.LICENSEKEY));
    }

}
