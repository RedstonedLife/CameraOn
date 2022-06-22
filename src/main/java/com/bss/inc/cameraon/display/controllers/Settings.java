package com.bss.inc.cameraon.display.controllers;

import com.bss.inc.cameraon.exceptions.UnknownOS;
import com.bss.inc.cameraon.settings.ISettings;

import java.io.File;

public class Settings implements ISettings {

    private File file;

    public Settings() throws UnknownOS

    @Override
    public void Setup() {

    }

    @Override
    public void Save() {

    }

    @Override
    public void Load() {

    }

    @Override
    public T getValue(String key) {
        return null;
    }

    @Override
    public void setValue(String key, T value) {

    }
}
