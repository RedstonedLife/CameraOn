package com.bss.inc.cameraon.utils;

import com.redsoftware.ltd.bnc.BNC;
import com.redsoftware.ltd.bnc.constants.aa;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Control;
import javafx.scene.control.SplitPane;
import javafx.scene.text.Text;

import java.util.Map;

public class $UI$01 {
    public static void u_00$1$1(SplitPane csplitpane) {csplitpane.getDividers().get(0).positionProperty().addListener((observableValue, number, t1) -> csplitpane.getDividers().get(0).setPosition(aa.DIVID_POS));}
    public static void u_01$1$1(SplitPane csplitpane, Button[] buttons) {
        u_00$1$1(csplitpane);
        buttons[0].setOnAction(e -> BNC.getSCENE_MANAGER().changeDialogScene("mainWindow",BNC.class.getResource(aa.SETTINGS_FXML)));
        buttons[1].setOnAction(e -> BNC.getSCENE_MANAGER().changeDialogScene("mainWindow",BNC.class.getResource(aa.CAM_SETTINGS)));
        buttons[2].setOnAction(e -> BNC.getSCENE_MANAGER().changeDialogScene("mainWindow",BNC.class.getResource(aa.APPLY_FXML)));
        buttons[3].setOnAction(e -> BNC.getSCENE_MANAGER().changeDialogScene("mainWindow",BNC.class.getResource(aa.SCAN_FXML)));
        buttons[4].setOnAction(e -> {if(BNC.getSCENE_MANAGER().getDialog("popUpWindow").isEnabled()) {BNC.getSCENE_MANAGER().getDialog("popUpWindow").closeDialog();} else {BNC.getSCENE_MANAGER().getDialog("popUpWindow").openDialog();BNC.getSCENE_MANAGER().changeDialogScene("popUpWindow", BNC.class.getResource(aa.POP_HELP_FXML));}});
    }
    public static void u_02$1$1(Map<Button, String> map) {for(Button object : map.keySet()) {object.setText(map.get(object));}}
    public static void u_03$1$1(Map<Text, String> map) {for(Text object : map.keySet()) {object.setText(map.get(object));}}
    public static void u_04$1$1(Button object) {object.setOnAction(e -> {
        BNC.getSCENE_MANAGER().changeDialogScene("preferencesDialog",BNC.class.getResource(aa.PREF_DISPLAY_FXML));
        BNC.getSCENE_MANAGER().openDialog("preferencesDialog");
    });}
    public static <T> void u_05$1$1(ChoiceBox<T> cb, int dfv, T[] vl) {for(T v : vl) {cb.getItems().add(v);}cb.setValue(cb.getItems().get(dfv));}
}
