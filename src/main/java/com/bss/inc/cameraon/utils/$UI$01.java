package com.bss.inc.cameraon.utils;

import com.bss.inc.cameraon.Launcher;
import com.bss.inc.cameraon.MainClass;
import com.bss.inc.cameraon.constants.FrontendPaths;
import com.bss.inc.cameraon.utils.net.angryscan.config.ScannerConfig;
import javafx.scene.control.*;
import javafx.scene.text.Text;
import org.json.JSONObject;

import java.io.FileNotFoundException;
import java.util.Map;
import java.util.regex.Pattern;

public class $UI$01 {
    public static final Pattern digitPattern;

    static {
        digitPattern = Pattern.compile("\\d+");
    }

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
        JSONObject _j = new JSONObject(Launcher.SettingsContainer.getValue("cameraSettings").toString());
        buttons[0].setOnAction(e -> {
            int fps = Integer.valueOf(fpsText.getText());
            if(fps <= 5 || fps-5<=4) {
                _j.put("frameRate",5);
                Launcher.SettingsContainer.setValue("cameraSettings",_j);
                try {Launcher.SettingsContainer.Save();} catch (FileNotFoundException ex) {ex.printStackTrace();}
            }
            else {
                _j.put("frameRate",fps-5);
                Launcher.SettingsContainer.setValue("cameraSettings",_j);
                try {Launcher.SettingsContainer.Save();} catch (FileNotFoundException ex) {ex.printStackTrace();}
            }
            fpsText.setText(String.valueOf(_j.getInt("frameRate")));
        });
        buttons[1].setOnAction(e -> {
            int fps = Integer.valueOf(fpsText.getText());
            if(fps <= 5) return;
            else {
                _j.put("frameRate",fps-1);
                Launcher.SettingsContainer.setValue("cameraSettings",_j);
                try {Launcher.SettingsContainer.Save();} catch (FileNotFoundException ex) {ex.printStackTrace();}
            }
            fpsText.setText(String.valueOf(_j.getInt("frameRate")));
        });
        buttons[2].setOnAction(e -> {
            int fps = Integer.valueOf(fpsText.getText());
            if(fps >= 60) return;
            else {

                _j.put("frameRate",fps+1);
                Launcher.SettingsContainer.setValue("cameraSettings",_j);
                try {Launcher.SettingsContainer.Save();} catch (FileNotFoundException ex) {ex.printStackTrace();}
            }
            fpsText.setText(String.valueOf(_j.getInt("frameRate")));
        });
        buttons[3].setOnAction(e -> {
            int fps = Integer.valueOf(fpsText.getText());
            if(fps >= 60 || fps+5>=60) {
                _j.put("frameRate",60);
                Launcher.SettingsContainer.setValue("cameraSettings",_j);
                try {Launcher.SettingsContainer.Save();} catch (FileNotFoundException ex) {ex.printStackTrace();}
            }
            else {
                _j.put("frameRate",fps+5);
                Launcher.SettingsContainer.setValue("cameraSettings",_j);
                try {Launcher.SettingsContainer.Save();} catch (FileNotFoundException ex) {ex.printStackTrace();}
            }
            fpsText.setText(String.valueOf(_j.getInt("frameRate")));
        });

        int[] cbt = new int[]{_j.getInt("videnc"),_j.getInt("resolution"),_j.getInt("bitrate")};

        cbs[0].setOnAction(e -> {_j.put("videnc", cbs[0].getItems().indexOf(cbs[0].getValue())+1);try {Launcher.SettingsContainer.Save();} catch (FileNotFoundException ex) {ex.printStackTrace();}});
        cbs[1].setOnAction(e -> {_j.put("resolution", cbs[1].getItems().indexOf(cbs[1].getValue())+1);try {Launcher.SettingsContainer.Save();} catch (FileNotFoundException ex) {ex.printStackTrace();}});
        cbs[2].setOnAction(e -> {_j.put("bitrate", cbs[2].getItems().indexOf(cbs[2].getValue())+1);try {Launcher.SettingsContainer.Save();} catch (FileNotFoundException ex) {ex.printStackTrace();}});
    }

    /**
     * u_08$1$3 Validates if a string contains any digit
     * @param i String to validate
     * @return boolean (true if matches) (false if not)
     */
    public static boolean u_08$1$3(String i) {return digitPattern.matcher(i).matches();}

    /**
     * Validates a port pattern i.e 3-50,5,600-8000
     * @param i
     * @return
     */
    public static boolean u_08$1$4(char c, String text, int caretPos) {
            // previous
            char pc = 0;
            for (int i = caretPos-1; i >= 0; i--) {
                pc = text.charAt(i);
                if (!Character.isWhitespace(pc))
                    break;
            }

            boolean isCurDigit = c >= '0' && c <= '9';
            boolean isPrevDigit = pc >= '0' && pc <= '9';
            return isPrevDigit && (isCurDigit || c == '-' || c == ',') ||
                    isCurDigit && (pc == '-' || pc == ',' || pc == 0) ||
                    Character.isWhitespace(c) && pc == ',';

    }

    public static void u_08$1$1(ScannerConfig scannerConfig, TextField[] tfs, CheckBox[] chkbs, TextArea ptsct, ChoiceBox<String> pingMethod) {
        /*
        TextFields Array Layout
        0 - threadsDelay
        1 - maxThreads
        2 - pingCount
        3 - pingTimeout
        4 - defaultPortTimeout
        5 - minPortTimeout
        Checkboxes Array Layout
        0 - scanDeadHosts
        1 - skipUnassigned
        2 - adaptPortTimeout
        3 - useRequestedPorts
        Text Area ptsct - portsToScan (portString)
        PingMethod<String> - selectedPinger
         */
        for (TextField textField: tfs) {
            textField.textProperty().addListener((observable, oldValue, newValue) -> {
                if(oldValue == null || oldValue == "") {return;}
                if(!u_08$1$3(newValue)) {textField.setText(oldValue);}
                if((newValue.length() > 5)) {textField.setText(oldValue);}
            });
        }
        ptsct.textProperty().addListener((observable, oldValue, newValue) -> {
            if(!u_08$1$4(newValue.charAt(newValue.length()-1),newValue,newValue.length()-oldValue.length()+1)){textField.setText(oldValue);}
        });

    }

    public static void u_08$1$2(TextField[] tfs, CheckBox[] chkbs, TextArea ptsct, ChoiceBox<String> pingMethod) {
        try {
            //pingMethod.getItems().addAll("pinger.windows", "pinger.udp", "pinger.tcp", "pinger.combined", "pinger.java", "pinger.arp");
            JSONObject j_ = (JSONObject) Launcher.SettingsContainer.getValue("scanSettings");
            if (j_.has("threadDelay")) {
                tfs[0].setText(String.valueOf(j_.getInt("threadDelay")));
            } // Thread Delay         threadDelay           (Default 20 MS)             (int)
            if (j_.has("maxThreads")) {
                tfs[1].setText(String.valueOf(j_.getInt("maxThreads")));
            } // Max Threads          maxThreads            (Default 255 Threads)       (int)
            if (j_.has("scanDeadHosts")) {
                chkbs[0].setSelected(j_.getBoolean("scanDeadHosts"));
            } // Scan Dead Hosts      scanDeadHosts         (Default true)             (bool)
            if (j_.has("selectedPinger")) {
                pingMethod.setValue(pingMethod.getItems().get(pingMethod.getItems().indexOf(j_.getString("selectedPinger"))));
            } // Selected Pinger      selectedPinger        (Default "pinger.arp")      (string)
            if (j_.has("pingTimeout")) {
                tfs[3].setText(String.valueOf(j_.getInt("pingTimeout")));
            } // Ping Timeout         pingTimeout           (Default 20 MS)             (int)
            if (j_.has("pingCount")) {
                tfs[2].setText(String.valueOf(j_.getInt("pingCount")));
            } // Ping Count           pingCount             (Default 3 Probes/Packets)  (int)
            if (j_.has("skipBroadcastAddress")) {
                chkbs[1].setSelected(j_.getBoolean("skipBroadcastAddress"));
            } // Skip Broadcast IP    skipBroadcastAddress  (Default true)              (bool)
            if (j_.has("portTimeout")) {
                tfs[4].setText(String.valueOf(j_.getInt("portTimeout")));
            } // Port Timeout         portTimeout           (Default 2000 MS, 2s)       (int)
            if (j_.has("adaptPortTimeout")) {
                chkbs[2].setSelected(j_.getBoolean("adaptPortTimeout"));
            } // Adapt Port Timeout   adaptPortTimeout      (Default true)              (bool)
            if (j_.has("minPortTimeout")) {
                tfs[5].setText(String.valueOf(j_.getInt("minPortTimeout")));
            } // Min Port Timeout     minPortTimeout        (Default 100 MS, 0.1s)      (int)
            if (j_.has("portString")) {
                ptsct.setText(j_.getString("portString"));
            } // Port String          portString            (Default "80,443,8080")     (string)
            if (j_.has("useRequestedPorts")) {
                chkbs[3].setSelected(j_.getBoolean("useRequestedPorts"));
            } // Use Requested Ports  useRequestedPorts     (Default true)              (bool)
            return;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
