package com.bss.inc.cameraon.logging;

public interface InfoHandler {

    void info(String message, Exception e);
    void info(String message);
    void info(Exception e);
    void info(String message, Exception e, Class<?> clazz);
    void info(String message, Exception e, String subname);
}
