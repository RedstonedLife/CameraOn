package com.bss.inc.cameraon.logging;

public interface WarnHandler {

    void warn(String message, Exception e);
    void warn(String message);
    void warn(Exception e);
    void warn(String message, Exception e, Class<?> clazz);
    void warn(String message, Exception e, String subname);

}
