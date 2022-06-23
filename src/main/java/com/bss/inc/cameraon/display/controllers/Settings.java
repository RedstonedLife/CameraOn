package com.bss.inc.cameraon.display.controllers;

import com.bss.inc.cameraon.constants.FilePaths;
import com.bss.inc.cameraon.exceptions.UnknownOS;
import com.bss.inc.cameraon.settings.ISettings;

import java.io.File;
import java.io.IOException;

public class Settings implements ISettings {

    private File file;
    private String name;

    public Settings(final String name) throws UnknownOS {
        this.name = name;
        file = new File(FilePaths.SETTINGS_FOLDER+name +".json");
        if(FilePaths.SETTINGS_FOLDER.equals("UKNS"))
            throw new UnknownOS("An unsupported OS is being used, exiting.");
        Setup();
    }

    @Override
    public void Setup() {
        if(!file.exists()) {
            file.getParentFile().mkdir();
            try {file.createNewFile();}
            catch (IOException e) {
                
            }
        }
    }

    @Override
    public void Save() {

    }

    @Override
    public void Load() {

    }

    @Override
    public <T> T getValue(String key) {
        return null;
    }

    @Override
    public <T> void setValue(String key, T value) {

    }
}
