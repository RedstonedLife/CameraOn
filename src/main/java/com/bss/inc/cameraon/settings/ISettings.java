package com.bss.inc.cameraon.settings;

public interface ISettings {
    void Setup();
    void Save();
    void Load();
    T getValue(String key);
    void setValue(String key, T value);
}
