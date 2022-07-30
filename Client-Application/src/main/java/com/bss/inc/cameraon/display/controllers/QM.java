package com.bss.inc.cameraon.display.controllers;

import com.bss.inc.cameraon.MainClass;
import com.bss.inc.cameraon.constants.FrontendPaths;
import com.bss.inc.cameraon.utils.$UI$01;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

public class QM implements Initializable {

    @FXML
    private Text qmHelpTxt,qmFaqTxt,qmTplTxt;
    @FXML private Button qmHelpBtn,qmFaqBtn,qmTplBtn,close;

    private MainClass instance;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        //tl("language.{}.changeConfirmation".replace("{}",prLang(instance.getSCENE_MANAGER().getCurrentLanguage())),prLang(instance.getSCENE_MANAGER().getSettings().get_language()))
        qmHelpBtn.setOnAction(e -> MainClass.getWindowManager().changeDialogScene("popUpWindow", MainClass.class.getResource(FrontendPaths.POP_HELP_FXML)));
        qmFaqBtn.setOnAction(e -> MainClass.getWindowManager().changeDialogScene("popUpWindow", MainClass.class.getResource(FrontendPaths.POP_FAQ_FXML)));
        qmTplBtn.setOnAction(e -> MainClass.getWindowManager().changeDialogScene("popUpWindow", MainClass.class.getResource(FrontendPaths.POP_TPL_FXML)));
        close.setOnAction(e -> $UI$01.u_06$1$1());
    }

}
