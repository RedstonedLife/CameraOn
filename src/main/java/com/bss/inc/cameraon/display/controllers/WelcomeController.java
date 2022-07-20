package com.bss.inc.cameraon.display.controllers;

import com.bss.inc.cameraon.Launcher;
import com.bss.inc.cameraon.utils.$UI$01;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

import static com.bss.inc.cameraon.i18n.I18n.tl;

public class WelcomeController implements Initializable {
    @FXML private Text licensetxt,versiontxt,showTxt;
    @FXML private CheckBox showChkB;
    @FXML private Button HelpBtn,StartBtn,ActivateBtn,btnMinimize,btnClose;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        langCb.getItems().addAll(tl("language.english"),tl("language.russian"),tl("language.hebrew"),tl("language.german"),tl("language.spanish"),tl("language.ukrainian"),
                tl("language.arabic"),tl("language.french"),tl("language.polish"),tl("language.portuguese"),tl("language.czech"),tl("language.italian"),tl("language.romanian"),tl("language.greek"));
        langCb.setValue(langCb.getItems().get(Integer.valueOf(Launcher.SettingsContainer.getValue("appLanguage").toString())));
        langCb.setDisable(true);
        $UI$01.u_01$1$1(cmainsplit,new Button[]{settingsSceneBtn,cctvSceneBtn,applySceneBtn,scanSceneBtn,HelpBtn});
        $UI$01.u_10$1$1(btnClose);
        $UI$01.u_10$1$2(btnMinimize,"mainWindow");
        initializeLanguage();
    }
}
