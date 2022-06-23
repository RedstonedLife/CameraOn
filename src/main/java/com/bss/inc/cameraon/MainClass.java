package com.bss.inc.cameraon;

import com.bss.inc.cameraon.constants.FrontendPaths;
import com.bss.inc.cameraon.display.Dialog;
import com.bss.inc.cameraon.display.DialogManager;
import com.bss.inc.cameraon.i18n.I18n;
import com.bss.inc.cameraon.logging.Logger;
import javafx.application.Application;
import javafx.stage.Stage;

import java.net.URL;
import java.time.LocalDateTime;

public class MainClass extends Application {

    private static Logger logger = Logger.getLogger("BNC");
    private static DialogManager WindowManager;
    private static Dialog[] dialogs;
    private transient I18n _i18n = new I18n(this);
    private static Class<MainClass> clazz = MainClass.class;

    static {
        dialogs = new Dialog[] {
          new Dialog(FrontendPaths.HEIGHT, FrontendPaths.WIDTH, "mainWindow", new URL[]{
                  clazz.getResource(FrontendPaths.ABOUTUS_FXML), clazz.getResource(FrontendPaths.SETTINGS_FXML),
                  clazz.getResource(FrontendPaths.WELCOME_FXML), clazz.getResource(FrontendPaths.)
          })
        };
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
