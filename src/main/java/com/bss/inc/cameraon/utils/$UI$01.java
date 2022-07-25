package com.bss.inc.cameraon.utils;

import com.bss.inc.cameraon.Launcher;
import com.bss.inc.cameraon.MainClass;
import com.bss.inc.cameraon.constants.FrontendPaths;
import com.bss.inc.cameraon.logging.Logger;
import com.bss.inc.cameraon.utils.net.angryscan.config.ScannerConfig;
import com.bss.inc.cameraon.utils.net.angryscan.enums.DisplayResultType;
import com.weilerhaus.productKeys.enums.ProductKeyState;
import javafx.scene.control.*;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import org.apache.tools.ant.Main;
import org.json.JSONObject;
import oshi.SystemInfo;

import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

public class $UI$01 {
    public static final Pattern digitPattern;
    public static final Pattern licensePattern;
    public static final Pattern ipaddressPattern;
    private static boolean isCopyingLicenseKey = false;
    static TextField[] tfs,tfs2;
    static CheckBox[] chkbs, chkbs2;
    static RadioButton[] rbs;
    static TextArea ptsct;
    static ChoiceBox<String> pingMethod;
    static ScannerConfig scannerConfig;
    static TextField usernameTf,passwordTf;

    static {
        digitPattern = Pattern.compile("\\d+");
        licensePattern = Pattern.compile("[A-Z\\d]{4}-|[A-Z\\d]{4}");
        ipaddressPattern = Pattern.compile(	"^((25[0-5]|(2[0-4]|1\\d|[1-9]|)\\d)(\\.(?!$)|$)){4}$");
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

        cbs[0].setOnAction(e -> {_j.put("videnc", cbs[0].getItems().indexOf(cbs[0].getValue()));try {Launcher.SettingsContainer.setValue("cameraSettings",_j);Launcher.SettingsContainer.Save();} catch (FileNotFoundException ex) {ex.printStackTrace();}});
        cbs[1].setOnAction(e -> {_j.put("resolution", cbs[1].getItems().indexOf(cbs[1].getValue()));try {Launcher.SettingsContainer.setValue("cameraSettings",_j);Launcher.SettingsContainer.Save();} catch (FileNotFoundException ex) {ex.printStackTrace();}});
        cbs[2].setOnAction(e -> {_j.put("bitrate", cbs[2].getItems().indexOf(cbs[2].getValue()));try {Launcher.SettingsContainer.setValue("cameraSettings",_j);Launcher.SettingsContainer.Save();} catch (FileNotFoundException ex) {ex.printStackTrace();}});
    } // Fixed CCTV Settings being broken when switching to lowest or highest value in dropdown menus.

    /**
     * u_08$1$3 Validates if a string contains any digit
     * @param i String to validate
     * @return boolean (true if matches) (false if not)
     */
    public static boolean u_08$1$3(String i) {return digitPattern.matcher(i).matches();}
    public static boolean u_08$1$7(String i) {return licensePattern.matcher(i).matches();}
    public static void u_08$1$8() {
        usernameTf.textProperty().addListener((observable, oldValue, newValue) -> {
            if(oldValue == null || oldValue == "") {return;}
            usernameTf.setText(newValue);
        });
        passwordTf.textProperty().addListener((observable, oldValue, newValue) -> {
            if(oldValue == null || oldValue == "") {return;}
            passwordTf.setText(newValue);
        });
    }
    public static void u_08$2$3(TextField utf, TextField ptf) {
        usernameTf = utf;
        passwordTf = ptf;
    }
    public static String u_08$2$1() {return usernameTf.getText();}
    public static String u_08$2$2() {return passwordTf.getText();}

    /**
     * Validates a port pattern i.e 3-50,5,600-8000
     * @param c char
     * @param text String
     * @param caretPos int
     * @return true if valid false if invalid
     */
    public static boolean u_08$1$4(char c, String text, int caretPos) {
            // previous
            char pc = 0;
            for (int i = caretPos-1; i >= 0; i--) {pc = text.charAt(i);if (!Character.isWhitespace(pc)) break;}
            boolean isCurDigit = c >= '0' && c <= '9';
            boolean isPrevDigit = pc >= '0' && pc <= '9';
            return isPrevDigit && (isCurDigit || c == '-' || c == ',') ||
                    isCurDigit && (pc == '-' || pc == ',' || pc == 0) ||
                    Character.isWhitespace(c) && pc == ',';
    }

    public static void u_08$1$6(ScannerConfig scConfig, TextField[] textFields, CheckBox[] checkBoxes, TextArea textArea, ChoiceBox<String> pingMeth)
    {scannerConfig = scConfig;tfs = textFields;chkbs = checkBoxes;ptsct = textArea;pingMethod = pingMeth;}

    public static void u_08$1$5() throws FileNotFoundException {
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
        scannerConfig.selectedPinger = pingMethod.getValue();
        scannerConfig.threadDelay = Integer.valueOf(tfs[0].getText());
        scannerConfig.maxThreads = Integer.valueOf(tfs[1].getText());
        scannerConfig.pingCount = Integer.valueOf(tfs[2].getText());
        scannerConfig.pingTimeout = Integer.valueOf(tfs[3].getText());
        scannerConfig.portTimeout = Integer.valueOf(tfs[4].getText());
        scannerConfig.minPortTimeout = Integer.valueOf(tfs[5].getText());
        scannerConfig.scanDeadHosts = chkbs[0].isSelected();
        scannerConfig.skipBroadcastAddresses = chkbs[1].isSelected();
        scannerConfig.adaptPortTimeout = chkbs[2].isSelected();
        scannerConfig.useRequestedPorts = chkbs[3].isSelected();
        scannerConfig.portString = ptsct.getText();
        scannerConfig.store();
    }

    public static void u_08$1$1() {
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
            if(oldValue == null || oldValue == "") {return;}
            if((newValue.length() > 142)) {ptsct.setText(oldValue);}
            if(!u_08$1$4(newValue.charAt(newValue.length()-1),newValue,newValue.length()-oldValue.length()+1)){ptsct.setText(oldValue);}
        });

    }

    public static void u_08$1$2() {
        try {
            ptsct.setWrapText(true);
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
            Logger.getLogger("BNC").error("An error occurred while trying to set the window with settings from file 'app.json.settings' 'scanSettings' column", e);
        }
    }

    public static void u_09$1$4(TextField[] textFields, CheckBox[] checkBoxes, RadioButton[] radioButtons)
    {tfs2 = textFields;chkbs2 = checkBoxes;rbs = radioButtons;}
    public static void u_09$1$1() {
        /*
        TextField Array Layout
        0 - NotAvailable Text Field                  naTf
        1 - NotScanned Text Field                    nsTf
        CheckBox Array Layout
        0 - Ask Confirmation Before Scan             askConfirmBeforeScan
        1 - Show Info Dialog After Scan              showInfoAfterScan
        RadioButton Array Layout
        0 - All Scanned Hosts                      - ALL
        1 - Alive Hosts (Responding to Pings) only - ALIVE
        2 - Hosts with open ports only             - OPEN_PORTS_ONLY
         */
        JSONObject j_ = (JSONObject) Launcher.SettingsContainer.getValue("scanResultDisplay");
        if(j_.has("displayResult")) {
            switch (DisplayResultType.fromString(j_.getString("displayResult"))) {
                case ALL -> {rbs[0].setSelected(true);rbs[1].setSelected(false);rbs[2].setSelected(false);}
                case ALIVE -> {rbs[0].setSelected(false);rbs[1].setSelected(true);rbs[2].setSelected(false);}
                case OPEN_PORTS_ONLY -> {rbs[0].setSelected(false);rbs[1].setSelected(false);rbs[2].setSelected(true);}
            }
        }
        if(j_.has("valueNotAvailable")) {tfs2[0].setText(j_.getString("valueNotAvailable"));}
        if(j_.has("valueNotScanned")) {tfs2[1].setText(j_.getString("valueNotScanned"));}
        if(j_.has("askConfirmationBeforeScan")) {chkbs2[0].setSelected(j_.getBoolean("askConfirmationBeforeScan"));}
        if(j_.has("showInfoDialogAfterScan")) {chkbs2[1].setSelected(j_.getBoolean("showInfoDialogAfterScan"));}
    }

    public static void u_09$1$2() {
        rbs[0].setOnAction(e -> {rbs[1].setSelected(false);rbs[2].setSelected(false);});
        rbs[1].setOnAction(e -> {rbs[0].setSelected(false);rbs[2].setSelected(false);});
        rbs[2].setOnAction(e -> {rbs[0].setSelected(false);rbs[1].setSelected(false);});
    }

    public static void u_09$1$3() throws FileNotFoundException {
        scannerConfig.notAvailableText = tfs2[0].getText();
        scannerConfig.notScannedText = tfs2[1].getText();
        scannerConfig.askConfirmationBeforeScan = chkbs2[0].isSelected();
        scannerConfig.showInfoDialogAfterScan = chkbs2[1].isSelected();
        if(rbs[0].isSelected()) {scannerConfig.displayResultType = DisplayResultType.ALL;}
        if(rbs[1].isSelected()) {scannerConfig.displayResultType = DisplayResultType.ALIVE;}
        if(rbs[2].isSelected()) {scannerConfig.displayResultType = DisplayResultType.OPEN_PORTS_ONLY;}
        scannerConfig.store();
    }

    public static void u_10$1$1(Button button) {
        button.setOnAction(e -> {MainClass.getWindowManager().closeDialogs();});
    }

    public static void u_10$1$2(Button button, String name) {
        button.setOnAction(e -> {MainClass.getWindowManager().minimizeDialog(name);});
    }

    public static void u_11$1$1(TextField[] textFields, Button activateButton) {
        textFields[0].textProperty().addListener((observable, oldValue, newValue) -> {
            if(isCopyingLicenseKey) {return;}
            if(newValue.split("-").length==5 && newValue.split("-") != null) {
                isCopyingLicenseKey = true;
                String[] temp = newValue.split("-");
                textFields[0].setText(temp[0]);
                textFields[1].setText(temp[1]);
                textFields[2].setText(temp[2]);
                textFields[3].setText(temp[3]);
                textFields[4].setText(temp[4]);
                textFields[4].requestFocus();
                activateButton.fire();
                isCopyingLicenseKey = false;
                return;
            }
            if(oldValue == null || oldValue == "") {return;}
            if((newValue.length() == 9 && oldValue != null)) {
                textFields[0].setText(oldValue);textFields[1].requestFocus();textFields[1].setText(newValue.substring(newValue.length()-1));textFields[1].positionCaret(textFields[1].getText().length());}
        });
        textFields[1].textProperty().addListener((observable, oldValue, newValue) -> {
            if(isCopyingLicenseKey) {return;}
            if(newValue.split("-").length==5 && newValue.split("-") != null) {
                isCopyingLicenseKey = true;
                String[] temp = newValue.split("-");
                textFields[0].setText(temp[0]);
                textFields[1].setText(temp[1]);
                textFields[2].setText(temp[2]);
                textFields[3].setText(temp[3]);
                textFields[4].setText(temp[4]);
                textFields[4].requestFocus();
                activateButton.fire();
                isCopyingLicenseKey = false;
                return;
            }
            if(oldValue == null || oldValue == "") {return;}
            if(newValue == "") {textFields[0].requestFocus();}
            if((newValue.length() == 7)) {
                textFields[1].setText(oldValue);textFields[2].requestFocus();textFields[2].setText(newValue.substring(newValue.length()-1));textFields[2].positionCaret(textFields[2].getText().length());}
        });
        textFields[2].textProperty().addListener((observable, oldValue, newValue) -> {
            if(isCopyingLicenseKey) {return;}
            if(newValue.split("-").length==5 && newValue.split("-") != null) {
                isCopyingLicenseKey = true;
                String[] temp = newValue.split("-");
                textFields[0].setText(temp[0]);
                textFields[1].setText(temp[1]);
                textFields[2].setText(temp[2]);
                textFields[3].setText(temp[3]);
                textFields[4].setText(temp[4]);
                textFields[4].requestFocus();
                activateButton.fire();
                isCopyingLicenseKey = false;
                return;
            }
            if(oldValue == null || oldValue == "") {return;}
            if(newValue == "") {textFields[1].requestFocus();}
            if((newValue.length() == 7 && oldValue != null)) {
                textFields[2].setText(oldValue);textFields[3].requestFocus();textFields[3].setText(newValue.substring(newValue.length()-1));textFields[3].positionCaret(textFields[3].getText().length());}
        });
        textFields[3].textProperty().addListener((observable, oldValue, newValue) -> {
            if(isCopyingLicenseKey) {return;}
            if(newValue.split("-").length==5 && newValue.split("-") != null) {
                isCopyingLicenseKey = true;
                String[] temp = newValue.split("-");
                textFields[0].setText(temp[0]);
                textFields[1].setText(temp[1]);
                textFields[2].setText(temp[2]);
                textFields[3].setText(temp[3]);
                textFields[4].setText(temp[4]);
                textFields[4].requestFocus();
                activateButton.fire();
                isCopyingLicenseKey = false;
                return;
            }
            if(oldValue == null || oldValue == "") {return;}
            if(newValue == "") {textFields[2].requestFocus();}
            if((newValue.length() == 7 && oldValue != null)) {
                textFields[3].setText(oldValue);textFields[4].requestFocus();textFields[4].setText(newValue.substring(newValue.length()-1));textFields[4].positionCaret(textFields[4].getText().length());}
        });
        textFields[4].textProperty().addListener((observable, oldValue, newValue) -> {
            if(isCopyingLicenseKey) {return;}
            if(newValue.split("-").length==5 && newValue.split("-") != null) {
                isCopyingLicenseKey = true;
                String[] temp = newValue.split("-");
                textFields[0].setText(temp[0]);
                textFields[1].setText(temp[1]);
                textFields[2].setText(temp[2]);
                textFields[3].setText(temp[3]);
                textFields[4].setText(temp[4]);
                textFields[4].requestFocus();
                activateButton.fire();
                isCopyingLicenseKey = false;
                return;
            }
            if(oldValue == null || oldValue == "") {return;}
            if(newValue == "") {textFields[3].requestFocus();}
            if((newValue.length() == 7 && oldValue != null)) {
                textFields[4].setText(oldValue);activateButton.fire();}
        });
    }

    public static String u_11$1$2(TextField[] textFields) {
        StringBuilder temp = new StringBuilder();
        for(TextField textField : textFields) {temp.append(textField.getText());}
        return temp.toString();
    }

    public static void u_11$1$3(Rectangle[] rectangles) {
        for(Rectangle rect : rectangles) {
            rect.setFill(Color.color(0.992156862745098d,0.0745098039215686d,0.0745098039215686d));
        }
    }

    public static void u_11$1$4(TextField[] textFields, Rectangle[] rectangles) {
        if(licenseHandler.verifyProductKey($UI$01.u_11$1$2(textFields)) != ProductKeyState.KEY_GOOD) {
            u_11$1$3(rectangles);
        } else if(licenseHandler.verifyProductKey($UI$01.u_11$1$2(textFields)) == ProductKeyState.KEY_GOOD) {
            try{
                if(MainClass.getRegi().get("isAT", null) == null || !MainClass.getRegi().get("isAT", null).equals(SHA512.getSecureSHA("true&&"+Launcher.getHu().getFileStores().get(0).getUUID(),MainClass.getRegi().get("ST", null).getBytes()))) {
                    MainClass.getRegi().put("isAT", SHA512.getSecureSHA("true&&"+Launcher.getHu().getFileStores().get(0).getUUID(),MainClass.getRegi().get("ST", null).getBytes()));
                } else {
                    for(Rectangle rect : rectangles) {
                        rect.setFill(Color.color(0.1294117647058824d,1.0d,0.3882352941176471d));
                    }
                    /* SEND TO MAIN PROGRAM */
                    return;
                }
            } catch (Exception e) {}
            for(Rectangle rect : rectangles) {
                rect.setFill(Color.color(0.1294117647058824d,1.0d,0.3882352941176471d));
            }
        }
    }

    public static void u_11$1$5() {
        if(MainClass.getRegi().get("ST", null) == null || MainClass.getRegi().get("isAT", null) == null) {
            MainClass.getWindowManager().changeDialogScene("welcomeWindow", MainClass.class.getResource(FrontendPaths.WELCOME_NA_FXML));
        } else if(MainClass.getRegi().get("ST", null) != null && MainClass.getRegi().get("isAT", null) != null) {
            if(!MainClass.getRegi().get("isAT", null).equals(SHA512.getSecureSHA("true&&"+Launcher.getHu().getFileStores().get(0).getUUID(), MainClass.getRegi().get("ST", null).getBytes()))) {
                MainClass.getWindowManager().changeDialogScene("welcomeWindow", MainClass.class.getResource(FrontendPaths.WELCOME_NA_FXML));
            } else {
                MainClass.getWindowManager().changeDialogScene("welcomeWindow", MainClass.class.getResource(FrontendPaths.WELCOME_FXML));
            }
        }
    }

    public static boolean u_12$1$1(String ip) {return ipaddressPattern.matcher(ip).matches();}

}
