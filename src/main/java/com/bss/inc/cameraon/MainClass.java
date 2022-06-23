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
          new Dialog(FrontendPaths.HEIGHT, FrontendPaths.WIDTH, "mainWindow", new URL[]{ // MainWindow URL[] Start
                  clazz.getResource(FrontendPaths.ABOUTUS_FXML), clazz.getResource(FrontendPaths.SETTINGS_FXML),
                  clazz.getResource(FrontendPaths.WELCOME_FXML), clazz.getResource(FrontendPaths.CAM_SETTINGS),
                  clazz.getResource(FrontendPaths.HELP_FXML), clazz.getResource(FrontendPaths.GETSTARTED_FXML),
                  clazz.getResource(FrontendPaths.SCAN_FXML), clazz.getResource(FrontendPaths.APPLY_FXML),
          }), // MainWindow URL[] End
          new Dialog(300d, 200d, "confirmationDialog", new URL[]{ // ConfirmationDialog URL[] Start
                  clazz.getResource(FrontendPaths.CONFIRMATION_FXML), clazz.getResource(FrontendPaths.LANG_CONFIRMATION_FXML)
          }), // ConfirmationDialog URL[] End
          new Dialog(500d, 800d, "preferencesDialog", new URL[]{ // PreferencesDialog URL[] Start
                  clazz.getResource(FrontendPaths.PREF_DISPLAY_FXML), clazz.getResource(FrontendPaths.PREF)
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
