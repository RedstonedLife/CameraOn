package com.bss.inc.cameraon.i18n;

import com.bss.inc.cameraon.Launcher;
import com.bss.inc.cameraon.constants.FrontendPaths;
import com.bss.inc.cameraon.utils.FileResClassLoader;

import java.text.MessageFormat;
import java.util.*;
import java.util.logging.Logger;

public class I18n implements II18n {
    private static I18n instance;
    private final transient Locale defaultLocale = Locale.US;
    private transient ResourceBundle defaultBundle;
    private final transient Class<Launcher> _i;
    private transient Locale currentLocale = defaultLocale;
    private transient ResourceBundle customBundle;
    private transient ResourceBundle localeBundle;
    private transient Map<String, MessageFormat> messageFormatCache = new HashMap<>();

    public I18n(final Class<Launcher> instance) {
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
            catch (final MissingResourceException ex) {
                Logger.getLogger("BNC").info("MissingResourceException: Could not find translated string-"+string+" in custom bundle");
                Logger.getLogger("BNC").info("MissingResourceException: Resorting to localeBundle");
                return localeBundle.getString(string);}
        } catch(final MissingResourceException ex) {
            Logger.getLogger("BNC").info("MissingResourceException: Could not find translated string-"+string+" in custom bundle");
            Logger.getLogger("BNC").info("MissingResourceException: Resorting to defaultBundle");
            return defaultBundle.getString(string);}
    }

    public String format(final String string, final Object... objects) {
        String fmt = translate(string);
        MessageFormat messageFormat = messageFormatCache.get(fmt);
        if(messageFormat == null) {
            try {messageFormat = new MessageFormat(fmt);}
            catch (final IllegalArgumentException ex) {
                fmt = fmt.replaceAll("\\{(\\D*?)\\}", "\\[$1\\]");
                messageFormat = new MessageFormat(fmt);
            }
            messageFormatCache.put(fmt, messageFormat);
        }
        return messageFormat.format(objects).replace(' ', ' ');
    }

    public void updateLocale(final String loc) {
        if (loc != null && !loc.isEmpty()) {
            final String[] parts = loc.split("[_\\.]");
            if (parts.length == 1) currentLocale = new Locale(parts[0]);
            if (parts.length == 2) currentLocale = new Locale(parts[0], parts[1]);
            if (parts.length == 3) currentLocale = new Locale(parts[0], parts[1], parts[2]);
        }
        ResourceBundle.clearCache();
        messageFormatCache = new HashMap<>();

        ResourceBundle[] bundles = updateLocale(currentLocale);
        localeBundle = bundles[0];
        customBundle = bundles[1];
    }

    public ResourceBundle[] updateLocale(Locale currentLocale) {
        ResourceBundle localeBundle, customBundle;
        try {localeBundle = ResourceBundle.getBundle(FrontendPaths.MESSAGES, currentLocale);}
        catch (final MissingResourceException ex) {localeBundle = FrontendPaths.NULL_BUNDLE;}
        try {customBundle = ResourceBundle.getBundle(FrontendPaths.MESSAGES, currentLocale, new FileResClassLoader(I18n.class.getClassLoader(), this._i));}
        catch (final MissingResourceException ex) {customBundle = FrontendPaths.NULL_BUNDLE;}
        return new ResourceBundle[]{localeBundle,customBundle};
    }
}
