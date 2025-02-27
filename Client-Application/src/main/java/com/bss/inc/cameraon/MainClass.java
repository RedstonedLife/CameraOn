package com.bss.inc.cameraon;

import com.bss.inc.cameraon.constants.FrontendPaths;
import com.bss.inc.cameraon.display.Dialog;
import com.bss.inc.cameraon.display.DialogManager;
import com.bss.inc.cameraon.logging.Logger;
import com.bss.inc.cameraon.utils.$UI$02;
import com.bss.inc.cameraon.utils.SHA512;
import com.bss.inc.cameraon.utils.net.angryscan.Scanner;
import com.bss.inc.cameraon.utils.net.angryscan.ScanningResultList;
import com.bss.inc.cameraon.utils.net.angryscan.config.ComponentRegistry;
import com.bss.inc.cameraon.utils.net.angryscan.config.Config;
import com.bss.inc.cameraon.utils.net.angryscan.core.ScannerDispatcherThreadFactory;
import com.bss.inc.cameraon.utils.net.angryscan.di.Injector;
import com.bss.inc.cameraon.utils.net.angryscan.enums.DisplayResultType;
import com.bss.inc.cameraon.utils.net.angryscan.state.PingerRegistry;
import com.bss.inc.cameraon.utils.net.angryscan.state.state.StateMachine;
import javafx.application.Application;
import javafx.stage.Stage;
import org.json.JSONObject;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.security.NoSuchAlgorithmException;
import java.util.prefs.Preferences;

public class MainClass extends Application {

    private static Logger logger = Logger.getLogger("BNC");
    private static Preferences regi = Preferences.userRoot().node("bss").node("cmon");

    private static DialogManager WindowManager;
    private static Class<MainClass> clazz = MainClass.class;

    private static Injector injector;
    private static StateMachine stateMachine = new StateMachine();
    private static ScanningResultList scanningResults;
    private static Scanner scanner;
    private static PingerRegistry pingerRegistry;
    private static ScannerDispatcherThreadFactory scannerDispatcherThreadFactory;

    public static StateMachine getStateMachine() {return stateMachine;}

    public static Config getConfig() {return Launcher.getConfig();}
    public static DisplayResultType DisplayType;
    private static $UI$02 ui02;

    static {
        DisplayType = DisplayResultType.valueOf(((JSONObject)Launcher.SettingsContainer.getValue("scanResultDisplay")).getString("displayResult"));
        // DARK VOODOO MAGIC, IDK WTF I AM DOING
        try {
            injector = new ComponentRegistry().init();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        try {pingerRegistry = new PingerRegistry(injector);} catch (ClassNotFoundException e) {throw new RuntimeException(e);} catch (Exception e) {throw new RuntimeException(e);}
        //
        scanner = new Scanner();
        scanningResults = new ScanningResultList(stateMachine);
        scannerDispatcherThreadFactory = new ScannerDispatcherThreadFactory(scanningResults,scanner,stateMachine,Launcher.getConfig().forScanner());
        ui02 = new $UI$02(scannerDispatcherThreadFactory,stateMachine,pingerRegistry,Launcher.getConfig().forScanner());

    }

    @Override
    public void start(Stage stage) {


        try {WindowManager = new DialogManager(new Dialog[] {
                new Dialog(stage, FrontendPaths.HEIGHT, FrontendPaths.WIDTH, "mainWindow", new URL[]{ // MainWindow URL[] Start
                        clazz.getResource(FrontendPaths.SETTINGS_FXML), clazz.getResource(FrontendPaths.CAM_SETTINGS),
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
                new Dialog(597d, 200d, "licenseWindow", new URL[] { // licenseWindow URL[] Start
                        clazz.getResource(FrontendPaths.LICENSE_KEY_FXML)
                }), // licenseWindow URL[] End
                new Dialog(800d,450d, "welcomeWindow", new URL[] { // welcomeWindow URL[] Start
                        clazz.getResource(FrontendPaths.WELCOME_NA_FXML), clazz.getResource(FrontendPaths.WELCOME_FXML)
                }) // welcomeWindow URL[] End
        });}
        catch (IOException e) {logger.error("Error occurred while initializing the WindowManager", e);e.printStackTrace();}
        if(regi.get("ST", null) == null || regi.get("isAT", null) == null) {
            WindowManager.changeDialogScene("welcomeWindow", clazz.getResource(FrontendPaths.WELCOME_NA_FXML));
        } else if(regi.get("ST", null) != null && regi.get("isAT", null) != null) {
            if(!regi.get("isAT", null).equals(SHA512.getSecureSHA("true&&"+Launcher.getHu().getFileStores().get(0).getUUID(), regi.get("ST", null).getBytes()))) {
                WindowManager.changeDialogScene("welcomeWindow", clazz.getResource(FrontendPaths.WELCOME_NA_FXML));
            } else {
                WindowManager.changeDialogScene("welcomeWindow", clazz.getResource(FrontendPaths.WELCOME_FXML));
            }
        }
        WindowManager.openDialog("welcomeWindow");
        stateMachine.init();
        //WindowManager.changeDialogScene("mainWindow", clazz.getResource(FrontendPaths.SETTINGS_FXML));
        //WindowManager.openDialog("mainWindow");
    }
    @Override
    public void stop() throws FileNotFoundException {
        Launcher.getConfig().onExit();
    }
    public static void main(String[] args) {
        try {if(regi.get("ST", null) == null) {regi.put("ST", SHA512.getSalt().toString());}}
        catch (NoSuchAlgorithmException e) {throw new RuntimeException(e);}
        launch(args);
    }

    public static Preferences getRegi() {return regi;}
    public static $UI$02 getUi02() {return ui02;}
    public static PingerRegistry getPingerRegistry() {return pingerRegistry;}
    public static Injector getInjector() {return injector;}
    public static ScanningResultList getScanningResults() {return scanningResults;}
    public static DialogManager getWindowManager() {
        return WindowManager;
    }
}
