package com.bss.inc.cameraon.logging;

public interface DebugHandler {

    void debug(String message, Exception e);
    void debug(String message);
    void debug(Exception e);
    void debug(String message, Exception e, Class<?> clazz);
    void debug(String message, Exception e, String subname);
}
