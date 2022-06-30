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

import java.io.FileNotFoundException;
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

    public static void u_07$1$1(Button[] buttons, Text fpsText, ChoiceBox[] cbs) throws FileNotFoundException {
        /*
        Buttons Map (4 Buttons)
        buttons[0] - Left  x5
        buttons[1] - Left  x1
        buttons[2] - Right x1
        buttons[3] - Right x5

        CBS<T> Map (3 CBS)
        cbs[0] - Video Encoding
        cbs[1] - Resolution
        cbs[2] - Bitrate
         */
        JSONObject _j = new JSONObject(Launcher.SettingsContainer.getValue("cameraSettings"));
        int fps = Integer.valueOf(fpsText.getText());
        buttons[0].setOnAction(e -> {
            if(fps <= 5 || fps-5<=5) return;
            else {
                _j.put("frameRate",fps-5);
                Launcher.SettingsContainer.setValue("cameraSettings",_j);
                try {Launcher.SettingsContainer.Save();} catch (FileNotFoundException ex) {throw new RuntimeException(ex);}
            }
            fpsText.setText(String.valueOf(fps));
        });
        buttons[1].setOnAction(e -> {
            if(fps <= 5) return;
            else {
                _j.put("frameRate",fps-1);
                Launcher.SettingsContainer.setValue("cameraSettings",_j);
                try {Launcher.SettingsContainer.Save();} catch (FileNotFoundException ex) {throw new RuntimeException(ex);}
            }
            fpsText.setText(String.valueOf(fps));
        });
        buttons[2].setOnAction(e -> {
            if(fps >= 60) return;
            else {
                _j.put("frameRate",fps+1);
                Launcher.SettingsContainer.setValue("cameraSettings",_j);
                try {Launcher.SettingsContainer.Save();} catch (FileNotFoundException ex) {throw new RuntimeException(ex);}
            }
            fpsText.setText(String.valueOf(fps));
        });
        buttons[3].setOnAction(e -> {
            if(fps >= 60 || fps+5>=60) return;
            else {
                _j.put("frameRate",fps+5);
                Launcher.SettingsContainer.setValue("cameraSettings",_j);
                try {Launcher.SettingsContainer.Save();} catch (FileNotFoundException ex) {throw new RuntimeException(ex);}
            }
            fpsText.setText(String.valueOf(fps));
        });

        int[] cbt = new int[]{_j.getInt("videnc"),_j.getInt("resolution"),_j.getInt("bitrate")};

        cbs[0].setOnAction(e -> {_j.put("videnc", cbs[0].getItems().indexOf(cbs[0].getValue())+1);});
        cbs[1].setOnAction(e -> {_j.put("resolution", cbs[1].getItems().indexOf(cbs[1].getValue())+1);});
        cbs[2].setOnAction(e -> {_j.put("bitrate", cbs[2].getItems().indexOf(cbs[2].getValue())+1);});


        Launcher.SettingsContainer.Save();
    }
}
