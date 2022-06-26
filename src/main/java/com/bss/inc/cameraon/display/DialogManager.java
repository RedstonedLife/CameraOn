package com.bss.inc.cameraon.display;

import com.bss.inc.cameraon.MainClass;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.HashMap;

public class DialogManager {
    private HashMap<String, Dialog> dialogsMap = new HashMap<String, Dialog>();
    private Class<MainClass> instance = MainClass.class;
    private int currentLanguage;
    private boolean alreadyScanned = false;

    public DialogManager(Dialog[] dialogs) throws IOException {
        //this.currentLanguage = BNC.getSettingsManager().get_language();
        for(Dialog dial : dialogs) {dialogsMap.put(dial.getDialogName(),dial);}
    }

    public void openDialog(String name) {dialogsMap.get(name).openDialog();}
    public void closeDialog(String name) {dialogsMap.get(name).closeDialog();}
    public void minimizeDialog(String name) {dialogsMap.get(name).minimize();}
    public void closeDialogs() {for(Dialog dialog : dialogsMap.values()) {dialog.closeDialog();}}
    public void changeDialogScene(String dialogName, URL sceneLoc) {dialogsMap.get(dialogName).changeScene(sceneLoc);}
    public Dialog getDialog(String name) {return dialogsMap.get(name);}
    public HashMap<String, Dialog> getDialogs() {return dialogsMap;}
    public int getCurrentLanguage() {return this.currentLanguage;}
    public boolean isAlreadyScanned() {return alreadyScanned;}
    public void setAlreadyScanned(boolean alreadyScanned) {this.alreadyScanned = alreadyScanned;}
}
