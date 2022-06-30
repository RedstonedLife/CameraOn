package com.bss.inc.cameraon.display.controllers;

import com.bss.inc.cameraon.Launcher;
import com.bss.inc.cameraon.MainClass;
import com.bss.inc.cameraon.constants.FrontendPaths;
import com.bss.inc.cameraon.utils.$UI$01;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.SplitPane;
import javafx.scene.text.Text;
import org.json.JSONObject;

import java.net.URL;
import java.util.ResourceBundle;

import static com.bss.inc.cameraon.i18n.I18n.tl;

public class CameraSettings implements Initializable {
    @FXML private Button settingsSceneBtn,cctvSceneBtn,scanSceneBtn,applySceneBtn,btnClose,btnMinimize,HelpBtn;
    @FXML private Button fpsleftbtn,fpsDleftbtn,fpsrightbtn,fpsDrightbtn;
    @FXML private ChoiceBox<String> veCB,rCB,brCB;
    @FXML private SplitPane cmainsplit;
    @FXML private Text cctvencodingtxt,cctvencodingbetxt,cctvfpstxt,cctvrestxt,cctvbrtxt,fpscounttxt,versiontxt,licensetxt;

    // # Close Window Button
    @FXML private void closeApp(ActionEvent event) {MainClass.getWindowManager().closeDialogs();}

    // # Minimize Window Button
    @FXML private void minimizeApp(ActionEvent event) {MainClass.getWindowManager().minimizeDialog("mainWindow");}

    private void initializeLanguage() {
        cctvencodingtxt.setText(tl("settings.cctv.encoding"));
        cctvencodingbetxt.setText(tl("settings.cctv.encoding.below"));
        cctvbrtxt.setText(tl("settings.cctv.bitrate"));
        cctvfpstxt.setText(tl("settings.cctv.fps"));
        settingsSceneBtn.setText(tl("settings.btn.text"));
        cctvSceneBtn.setText(tl("settings.cctv.btn.text"));
        scanSceneBtn.setText(tl("scan.btn.text"));
        applySceneBtn.setText(tl("apply.btn.text"));
        versiontxt.setText(tl("version.format", FrontendPaths.VERSION_TEXT,FrontendPaths.BUILD));
        licensetxt.setText(tl("license.format",FrontendPaths.LICENSEE,FrontendPaths.LICENSEKEY));
    }

    private void modifyStyle() {
        this.cctvencodingtxt.getStyleClass().add("text");
        this.cctvencodingbetxt.getStyleClass().add("text");
        this.cctvbrtxt.getStyleClass().add("text");
        this.cctvfpstxt.getStyleClass().add("text");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        initializeLanguage();
        modifyStyle();
        $UI$01.u_01$1$1(cmainsplit, new Button[]{settingsSceneBtn, cctvSceneBtn, applySceneBtn, scanSceneBtn, HelpBtn});
        /* Load Choice Boxes */
        veCB.getItems().addAll("H.264", "H.264H", "H.265");
        rCB.getItems().addAll("1080 (1920x1080)", "720 (1280x720)", "480 (720x480)", "360 (640x360)");
        brCB.getItems().addAll("4096 Kb/s (4 Mb/s)", "3072 Kb/s (3 Mb/s)", "2048 Kb/s (2 Mb/s)", "1024 Kb/s (1 Mb/s)");

        JSONObject settings = new JSONObject(Launcher.SettingsContainer.getValue("cameraSettings").toString());
        fpscounttxt.setText(settings.getInt("framerate"));
    }
}
