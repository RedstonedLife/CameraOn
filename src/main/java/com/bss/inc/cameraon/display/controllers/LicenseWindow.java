package com.bss.inc.cameraon.display.controllers;

import com.bss.inc.cameraon.MainClass;
import com.bss.inc.cameraon.constants.FrontendPaths;
import com.bss.inc.cameraon.utils.$UI$01;
import com.bss.inc.cameraon.utils.licenseHandler;
import com.weilerhaus.productKeys.enums.ProductKeyState;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.scene.shape.Rectangle;C6B4AA1C-DD6D02-991F4E-188631-5C3814
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

public class LicenseWindow implements Initializable {
    @FXML private Text TitleTxt, SubTitleTxt;
    @FXML private TextField ACtf1,ACtf2,ACtf3,ACtf4,ACtf5;
    @FXML private Button HelpBtn, ActivateBtn, btnMinimize, btnClose;
    @FXML private Rectangle btnLED1,btnLED2;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        HelpBtn.setCancelButton(true);
        btnClose.setOnAction(e -> $UI$01.u_11$1$5());
        $UI$01.u_11$1$1(new TextField[]{ACtf1,ACtf2,ACtf3,ACtf4,ACtf5}, ActivateBtn);
        ActivateBtn.setOnAction(e -> $UI$01.u_11$1$4(new TextField[]{ACtf1,ACtf2,ACtf3,ACtf4,ACtf5}, new Rectangle[]{btnLED1,btnLED2}));
        $UI$01.u_10$1$2(btnMinimize, "welcomeWindow");
    }
}
