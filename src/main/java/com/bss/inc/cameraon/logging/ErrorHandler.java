package com.bss.inc.cameraon.logging;

public interface ErrorHandler {

    void error(String message, Exception e);
    void error(String message);
    void error(Exception e);
    void error(String message, Exception e, Class<?> clazz);
    void error(String message, Exception e, String subname);
}
