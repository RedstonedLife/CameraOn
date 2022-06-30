package com.bss.inc.cameraon.utils;

import com.bss.inc.cameraon.Launcher;
import com.bss.inc.cameraon.MainClass;
import com.bss.inc.cameraon.constants.FrontendPaths;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Control;
import javafx.scene.control.SplitPane;
import javafx.scene.text.Text;
import org.json.JSONObject;

import java.util.Map;

public class $UI$01 {
    public static void u_00$1$1(SplitPane csplitpane) {csplitpane.getDividers().get(0).positionProperty().addListener((observableValue, number, t1) -> csplitpane.getDividers().get(0).setPosition(FrontendPaths.DIVID_POS));}
    public static void u_01$1$1(SplitPane csplitpane, Button[] buttons) {
        u_00$1$1(csplitpane);
        buttons[0].setOnAction(e -> MainClass.getWindowManager().changeDialogScene("mainWindow",MainClass.class.getResource(FrontendPaths.SETTINGS_FXML)));
        buttons[1].setOnAction(e -> MainClass.getWindowManager().changeDialogScene("mainWindow",MainClass.class.getResource(FrontendPaths.CAM_SETTINGS)));
        buttons[2].setOnAction(e -> MainClass.getWindowManager().changeDialogScene("mainWindow",MainClass.class.getResource(FrontendPaths.APPLY_FXML)));
        buttons[3].setOnAction(e -> MainClass.getWindowManager().changeDialogScene("mainWindow",MainClass.class.getResource(FrontendPaths.SCAN_FXML)));
        buttons[4].setOnAction(e -> MainClass.getWindowManager().changeDialogScene("popUpWindow",MainClass.class.getResource(FrontendPaths.POP_HELP_FXML)));
    }
    public static void u_02$1$1(Map<Button, String> map) {for(Button object : map.keySet()) {object.setText(map.get(object));}}
    public static void u_03$1$1(Map<Text, String> map) {for(Text object : map.keySet()) {object.setText(map.get(object));}}
    public static void u_04$1$1(Button object) {object.setOnAction(e -> {
        MainClass.getWindowManager().changeDialogScene("preferencesDialog", MainClass.class.getResource(FrontendPaths.PREF_DISPLAY_FXML)); // <--- Look at this closely;
        MainClass.getWindowManager().getDialog("preferencesDialog").getParent().show();
        //MainClass.getWindowManager().openDialog("mainWindow");
    });}
    public static <T> void u_05$1$1(ChoiceBox<T> cb, int dfv, T[] vl) {for(T v : vl) {cb.getItems().add(v);}cb.setValue(cb.getItems().get(dfv));}
    public static void u_06$1$1() {
        MainClass.getWindowManager().getDialog("mainWindow").changeScene(MainClass.getWindowManager().getDialog("mainWindow").getCurrentScene());
    }

    public static <T> void u_07$1$1(Button[] buttons, Text fpsText, ChoiceBox<T> cbs) {
        /*
        Buttons Map (4 Buttons)
        buttons[0] - Left  x5
        buttons[1] - Left  x1
        buttons[2] - Right x1
        buttons[3] - Right x5
         */
        JSONObject _j = new JSONObject(Launcher.SettingsContainer.getValue("cameraSettings"));
        buttons[0].setOnAction(e -> {
            if(Integer.valueOf(fpsText.getText()) <= 5) return;
            else Launcher.SettingsContainer.setValue("cameraSettings");
        });
        buttons[1].setOnAction(e -> {

        });
        buttons[2].setOnAction(e -> {

        });
        buttons[3].setOnAction(e -> {

        });

    }
}
