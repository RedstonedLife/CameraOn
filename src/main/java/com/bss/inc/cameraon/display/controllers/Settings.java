package com.bss.inc.cameraon.display.controllers;

import com.bss.inc.cameraon.constants.FilePaths;
import com.bss.inc.cameraon.exceptions.UnknownOS;
import com.bss.inc.cameraon.settings.ISettings;

import java.io.File;

public class Settings implements ISettings {

    private File file;
    private String name;

    public Settings(final String name) throws UnknownOS {
        this.name = name;
        file = new File(FilePaths.SETTINGS_FOLDER+name +".json");
        if(FilePaths.SETTINGS_FOLDER.equals("UKNS"))
            throw new UnknownOS("An unsupported OS is being used, exiting.")
    }

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
