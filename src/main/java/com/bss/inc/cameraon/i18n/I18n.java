package com.bss.inc.cameraon.i18n;

import java.util.Locale;

public class I18n implements II18n {
    private static I18n instance;
    private final transient Locale defaultLocale = Locale.getDefault();
    private transient ResourceBundle defaultBundle;
    
}
