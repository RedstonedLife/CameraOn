package com.bss.inc.cameraon;

import com.bss.inc.cameraon.display.Dialog;
import com.bss.inc.cameraon.display.DialogManager;
import com.bss.inc.cameraon.i18n.I18n;
import com.bss.inc.cameraon.logging.Logger;
import javafx.application.Application;
import javafx.stage.Stage;

import java.time.LocalDateTime;

public class MainClass extends Application {

    private static Logger logger = Logger.getLogger("BNC");
    private static DialogManager WindowManager;
    private static Dialog[] dialogs;
    private transient I18n _i18n = new I18n(this);

    static {
        
    }

    @Override
    public void start(Stage stage) {
        this._i18n.OnStart();
    }
    @Override
    public void stop() {}

    public static void main(String[] args) {
        launch();
    }

    public static DialogManager getWindowManager() {
        return null;
    }
}
