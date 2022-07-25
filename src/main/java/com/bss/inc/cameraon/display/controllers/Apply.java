package com.bss.inc.cameraon.display.controllers;

import com.bss.inc.cameraon.MainClass;
import com.bss.inc.cameraon.constants.FrontendPaths;
import com.bss.inc.cameraon.utils.$UI$01;
import com.sun.tools.javac.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.SplitPane;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

import static com.bss.inc.cameraon.i18n.I18n.tl;

public class Apply implements Initializable {

    private Class<MainClass> instance = MainClass.class;

    @FXML private Button settingsSceneBtn,cctvSceneBtn,scanSceneBtn,applySceneBtn,HelpBtn,btnClose,btnMinimize,applyBtn;
    @FXML private SplitPane cmainsplit;
    @FXML private Text taskslefttxt,backendtxt,applystatustxt,versiontxt,licensetxt;


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
        versiontxt.setText(tl("version.format", FrontendPaths.VERSION_TEXT,FrontendPaths.BUILD));
        licensetxt.setText(tl("license.format",FrontendPaths.LICENSEE,FrontendPaths.LICENSEKEY));
        $UI$01.u_10$1$1(btnClose);
        $UI$01.u_10$1$2(btnMinimize,"mainWindow");
    }

}
