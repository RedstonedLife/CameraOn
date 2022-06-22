package com.bss.inc.cameraon.i18n;

import com.bss.inc.cameraon.MainClass;

import java.text.MessageFormat;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.ResourceBundle;

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
    }
}
