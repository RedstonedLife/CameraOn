package com.bss.inc.cameraon.display.controllers;

import javafx.fxml.Initializable;

public class QM implements Initializable {

    @FXML
    private Text qmHelpTxt,qmFaqTxt,qmTplTxt;
    @FXML private Button qmHelpBtn,qmFaqBtn,qmTplBtn;

    private BNC instance = new BNC();

    @FXML private void closeApp(ActionEvent event) {instance.getSCENE_MANAGER().closeDialog("popUpWindow");}

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        //tl("language.{}.changeConfirmation".replace("{}",prLang(instance.getSCENE_MANAGER().getCurrentLanguage())),prLang(instance.getSCENE_MANAGER().getSettings().get_language()))
        qmHelpBtn.setOnAction(e -> instance.getSCENE_MANAGER().changeDialogScene("popUpWindow", BNC.class.getResource(aa.POP_HELP_FXML)));
        qmFaqBtn.setOnAction(e -> instance.getSCENE_MANAGER().changeDialogScene("popUpWindow", BNC.class.getResource(aa.POP_FAQ_FXML)));
        qmTplBtn.setOnAction(e -> instance.getSCENE_MANAGER().changeDialogScene("popUpWindow", BNC.class.getResource(aa.POP_TPL_FXML)));
    }

}
