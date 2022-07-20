package com.bss.inc.cameraon;

import com.bss.inc.cameraon.constants.FrontendPaths;
import com.bss.inc.cameraon.display.Dialog;
import com.bss.inc.cameraon.display.DialogManager;
import com.bss.inc.cameraon.i18n.I18n;
import com.bss.inc.cameraon.logging.Logger;
import com.bss.inc.cameraon.utils.net.angryscan.config.Config;
import com.bss.inc.cameraon.utils.net.angryscan.di.Injector;
import com.bss.inc.cameraon.utils.net.angryscan.enums.DisplayResultType;
import com.bss.inc.cameraon.utils.net.angryscan.state.state.StateMachine;
import javafx.application.Application;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import org.json.JSONObject;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.time.LocalDateTime;

public class MainClass extends Application {

    private static Logger logger = Logger.getLogger("BNC");
    private static DialogManager WindowManager;
    private static Class<MainClass> clazz = MainClass.class;

    private Injector injector;
    private static StateMachine stateMachine = new StateMachine();
    private static Config config = new Config();

    public static StateMachine getStateMachine() {return stateMachine;}
    public static Config getConfig() {return config;}
    public static DisplayResultType DisplayType;

    static {DisplayType = DisplayResultType.valueOf(((JSONObject)Launcher.SettingsContainer.getValue("scanResultDisplay")).getString("displayResult"));}

    @Override
    public void start(Stage stage) {
        try {WindowManager = new DialogManager(new Dialog[] {
                new Dialog(stage, FrontendPaths.HEIGHT, FrontendPaths.WIDTH, "mainWindow", new URL[]{ // MainWindow URL[] Start
                        clazz.getResource(FrontendPaths.SETTINGS_FXML),
                        clazz.getResource(FrontendPaths.WELCOME_FXML), clazz.getResource(FrontendPaths.CAM_SETTINGS),
                        clazz.getResource(FrontendPaths.SCAN_FXML), clazz.getResource(FrontendPaths.APPLY_FXML),
                }), // MainWindow URL[] End
                new Dialog(300d, 200d, "confirmationDialog", new URL[]{ // ConfirmationDialog URL[] Start
                        clazz.getResource(FrontendPaths.CONFIRMATION_FXML), clazz.getResource(FrontendPaths.LANG_CONFIRMATION_FXML)
                }), // ConfirmationDialog URL[] End
                new Dialog(500d, 800d, "preferencesDialog", new URL[]{ // PreferencesDialog URL[] Start
                        clazz.getResource(FrontendPaths.PREF_DISPLAY_FXML), clazz.getResource(FrontendPaths.PREF_DISPLAY_AS_FXML)
                }), // PreferencesDialog URL[] End
                new Dialog(350d, 500d, "popUpWindow", new URL[] { // PopUpWindow URL[] Start
                        clazz.getResource(FrontendPaths.POP_FAQ_FXML),clazz.getResource(FrontendPaths.POP_TPL_FXML),
                        clazz.getResource(FrontendPaths.POP_HELP_FXML)
                }), // PopUpWindow URL[] End
                new Dialog(500d, 200d, "license")
        });}
        catch (IOException e) {logger.error("Error occurred while initializing the WindowManager", e);e.printStackTrace();}
        WindowManager.changeDialogScene("mainWindow",clazz.getResource(FrontendPaths.SETTINGS_FXML));
        WindowManager.openDialog("mainWindow");
        //WindowManager.changeDialogScene("mainWindow", clazz.getResource(FrontendPaths.SETTINGS_FXML));
        //WindowManager.openDialog("mainWindow");
    }
    @Override
    public void stop() throws FileNotFoundException {
        config.onExit();
    }

    public static void main(String[] args) {
        launch(args);
    }

    public static DialogManager getWindowManager() {
        return WindowManager;
    }
}
