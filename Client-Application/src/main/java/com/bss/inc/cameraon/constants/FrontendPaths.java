package com.bss.inc.cameraon.constants;

import com.bss.inc.cameraon.MainClass;
import org.jetbrains.annotations.NotNull;

import java.util.Enumeration;
import java.util.ResourceBundle;
import java.util.regex.Pattern;

public class FrontendPaths {
    /* Visual */
    public static final String ABOUTUS_FXML = "cctvsettings.fxml";
    public static final String SETTINGS_FXML = "settings.fxml";
    public static final String CAM_SETTINGS = "cctvsettings.fxml";
    public static final String GETSTARTED_FXML = "getstarted.fxml";
    public static final String SCAN_FXML = "scan.fxml";
    public static final String PREF_DISPLAY_FXML = "prefDisplay.fxml";
    public static final String PREF_DISPLAY_AS_FXML = "prefAS.fxml";
    public static final String PREF_DISPLAY_IBS_FXML = "prefIBS.fxml";
    public static final String PREF_DISPLAY_CBS_FXML = "prefCBS.fxml";
    public static final String POP_HELP_FXML = "qmHelp.fxml";
    public static final String POP_FAQ_FXML = "qmFaq.fxml";
    public static final String POP_TPL_FXML = "qmTpl.fxml";
    public static final String APPLY_FXML = "apply.fxml";
    public static final String HELP_FXML = "help.fxml";
    public static final String CONFIRMATION_FXML = "confirmation.fxml";
    public static final String LANG_CONFIRMATION_FXML = "langconfirmation.fxml";
    public static final String LICENSE_KEY_FXML = "licensekey.fxml";
    public static final String WELCOME_NA_FXML = "startupna.fxml";
    public static final String WELCOME_FXML = "startup.fxml";
    public static final double HEIGHT = 900d;
    public static final double WIDTH = 600d;
    public static final double DIVID_POS = 0.25278396436525613d;
    public static final double EPSILON = 0.0000005;
    /* Internationalization (I18n) */
    public static final String MESSAGES = "messages"; //"messages_en";
    public static final Pattern NODOUBLEMARK = Pattern.compile("''");
    public static final ResourceBundle NULL_BUNDLE = new ResourceBundle() {
        public Enumeration<String> getKeys() {return null;}
        protected Object handleGetObject(@NotNull String s) {return null;}
    };
    /* VERSION */
    public static final String VERSION_TEXT="Epsilon-1.21.22.5";
    public static final int BUILD = 277684;
    public static final String LICENSEE="Tal B.";
    public static final String LICENSEKEY="A7F8CC0281A0E9E8E30CB0E5C3840541";
    /* CACHED THEME */
    public static final String APP_CSS = MainClass.class.getResource("app.css").toExternalForm();
}
