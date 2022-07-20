package com.bss.inc.cameraon.logging;

public class Logger implements ErrorHandler, WarnHandler, InfoHandler, DebugHandler, LogHandler {

    /**
     * The fully qualified name of the Logger class
     */
    private static final String FQCN = Logger.class.getName();
    private static boolean stampEnabled = true;
    private static String LOGGER_NAME;

    public Logger(String name) {
        /* Check LogManager for conflictions Loggers */
        LOGGER_NAME = name;
    }
    public static Logger getLogger(final String name) {
        return LogManager.getLogger(name);
    }
    public static void disableStamp() {stampEnabled = false;}
    public static void enableStamp() {stampEnabled = true;}

    public String getName() {return LOGGER_NAME;}
    @Override public void debug(String message, Exception e) {LogManager.getLFM().debug(message, e);}
    @Override public void debug(String message) {LogManager.getLFM().debug(message);}
    @Override public void debug(Exception e) {LogManager.getLFM().debug(e);}
    @Override public void debug(String message, Exception e, Class<?> clazz) {LogManager.getLFM().debug(message, e, clazz);}
    @Override public void debug(String message, Exception e, String subname) {LogManager.getLFM().debug(message, e, subname);}
    @Override public void error(String message, Exception e) {LogManager.getLFM().error(message, e);}
    @Override public void error(String message) {LogManager.getLFM().error(message);}
    @Override public void error(Exception e) {LogManager.getLFM().error(e);}
    @Override public void error(String message, Exception e, Class<?> clazz) {LogManager.getLFM().error(message, e, clazz);}
    @Override public void error(String message, Exception e, String subname) {LogManager.getLFM().error(message, e, subname);}
    @Override public void info(String message, Exception e) {LogManager.getLFM().info(message, e);}
    @Override public void info(String message) {LogManager.getLFM().info(message);}
    @Override public void info(Exception e) {LogManager.getLFM().info(e);}
    @Override public void info(String message, Exception e, Class<?> clazz) {LogManager.getLFM().info(message, e, clazz);}
    @Override public void info(String message, Exception e, String subname) {LogManager.getLFM().info(message, e, subname);}
    @Override public void log(Level level, String message) {LogManager.getLFM().log(level, message);}
    @Override public void log(Level level, String message, Object... args) {LogManager.getLFM().log(level, message, args);}
    @Override public void log(Level level, String message, Exception exception) {LogManager.getLFM().log(level, message, exception);}
    @Override public void log(Level level, String message, Exception exception, Class<?> clazz) {LogManager.getLFM().log(level, message, exception, clazz);}
    @Override public void log(Level level, String message, Class<?> clazz) {LogManager.getLFM().log(level, message, clazz);}
    @Override public void log(Level level, String message, Class<?> clazz, Object... args) {LogManager.getLFM().log(level, message, clazz, args);}
    @Override public void warn(String message, Exception e) {LogManager.getLFM().warn(message, e);}
    @Override public void warn(String message) {LogManager.getLFM().warn(message);}
    @Override public void warn(Exception e) {LogManager.getLFM().warn(e);}
    @Override public void warn(String message, Exception e, Class<?> clazz) {LogManager.getLFM().warn(message, e, clazz);}
    @Override public void warn(String message, Exception e, String subname) {LogManager.getLFM().warn(message, e, subname);}
    @Override public void log(Logger logger, Level level, String message) {LogManager.getLFM().log(logger,level,message);}
}
