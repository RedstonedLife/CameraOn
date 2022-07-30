package com.bss.inc.cameraon.display.controllers;

import com.bss.inc.cameraon.Launcher;
import com.bss.inc.cameraon.constants.FrontendPaths;
import com.bss.inc.cameraon.utils.$UI$01;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.SplitPane;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

import static com.bss.inc.cameraon.i18n.I18n.tl;

public class SceneSettings implements Initializable {
    @FXML private ChoiceBox<String> langCb;
    @FXML private SplitPane cmainsplit;
    @FXML private Button settingsSceneBtn,cctvSceneBtn,scanSceneBtn,applySceneBtn,HelpBtn;
    @FXML private Text languagetxt,versiontxt,licensetxt;
    @FXML private Button btnClose;
    @FXML private Button btnMinimize;

    private void initializeLanguage() {
        settingsSceneBtn.setText(tl("settings.btn.text"));
        cctvSceneBtn.setText(tl("settings.cctv.btn.text"));
        scanSceneBtn.setText(tl("scan.btn.text"));
        applySceneBtn.setText(tl("apply.btn.text"));
        languagetxt.setText(tl("settings.language.text"));
        versiontxt.setText(tl("version.format", FrontendPaths.VERSION_TEXT,FrontendPaths.BUILD));
        licensetxt.setText(tl("license.format",FrontendPaths.LICENSEE,FrontendPaths.LICENSEKEY));
        langCb.setOnAction(e -> {
            //BNC.getSettingsManager().set_language(langCb.getItems().indexOf(langCb.getValue()) + 1);
            //BNC.getSCENE_MANAGER().changeDialogScene("confirmationDialog", BNC.class.getResource(FrontendPaths.LANG_CONFIRMATION_FXML));
            //BNC.getSCENE_MANAGER().openDialog("confirmationDialog");
        });
    }

    public void modifyStyle() {
        this.languagetxt.getStyleClass().add("text");
    }

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
