package com.bss.inc.cameraon.i18n;

import com.bss.inc.cameraon.MainClass;
import com.bss.inc.cameraon.constants.FrontendPaths;

import java.text.MessageFormat;
import java.util.*;

public class I18n implements II18n {
    private static I18n instance;
    private final transient Locale defaultLocale = Locale.getDefault();
    private transient ResourceBundle defaultBundle;
    private final transient MainClass _i;
    private transient Locale currentLocale = defaultLocale;
    private transient ResourceBundle customBundle;
    private transient ResourceBundle localeBundle;
    private transient Map<String, MessageFormat> messageFormatCache = new HashMap<>();

    public I18n(final MainClass instance) {
        this._i = instance;
        defaultBundle = ResourceBundle.getBundle(FrontendPaths.MESSAGES, currentLocale);
        localeBundle = defaultBundle;
        customBundle = FrontendPaths.NULL_BUNDLE;
    }

    public static String tl(final String string, final Object... objects) {
        if(instance == null) return "";
        if(objects.length==0) return FrontendPaths.NODOUBLEMARK.matcher(instance.translate(string)).replaceAll("'");
        else return instance.format(string, objects);
    }

    public static String capitalCase(final String input) {return input == null || input.length() == 0 ? input : input.toUpperCase(Locale.ENGLISH).charAt(0) + input.toLowerCase(Locale.ENGLISH).substring(1);}
    public void OnStart() {instance = this;}
    public void OnStop() {instance = null;}
    @Override public Locale getCurrentLocale() {return currentLocale;}

    private String translate(final String string) {
        try {
            try {return customBundle.getString(string);}
            catch (final MissingResourceException ex) {return localeBundle.getString(string);}
        } catch(final MissingResourceException ex) {return defaultBundle.getString(string);}
    }

    public String format(final String string, final Object... objects) {
        String format = translate(string);
        MessageFormat messageFormat = messageFormatCache
    }
}
