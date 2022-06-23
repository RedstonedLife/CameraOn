package com.bss.inc.cameraon.settings;

import org.json.JSONException;

import java.io.FileNotFoundException;

public interface ISettings {
    void Setup();
    void Save() throws FileNotFoundException, JSONException;
    void Load();
    <T> T getValue(String key);
    <T> void setValue(String key, T value);
}
