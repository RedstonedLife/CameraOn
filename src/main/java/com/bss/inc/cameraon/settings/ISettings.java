package com.bss.inc.cameraon.settings;

import org.json.JSONException;

import java.io.FileNotFoundException;

public interface ISettings {
    void Setup();
    void Save() throws FileNotFoundException, JSONException;
    void Load() throws FileNotFoundException, JSONException;
    Object getValue(String key);
    void setValue(String key, Object value);
}
