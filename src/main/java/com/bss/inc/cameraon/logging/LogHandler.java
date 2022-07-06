package com.bss.inc.cameraon.logging;

public interface LogHandler {

    void log(Level level, String message);
    void log(Level level, String message, Object... args);
    void log(Level level, String message, Exception exception);
    void log(Level level, String message, Exception exception, Class<?> clazz);
    void log(Level level, String message, Class<?> clazz);
    void log(Level level, String message, Class<?> clazz, Object... args);

    void log(Logger logger, Level level, String message);

}
