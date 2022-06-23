package com.bss.inc.cameraon.settings;

public interface ISettings {
    void Setup();
    void Save();
    void Load();
    <T> T getValue(String key);
    <T> void setValue(String key, T value);
}
