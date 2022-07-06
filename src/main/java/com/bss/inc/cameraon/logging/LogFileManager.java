package com.bss.inc.cameraon.logging;

import com.bss.inc.cameraon.Launcher;
import com.bss.inc.cameraon.MainClass;
import com.bss.inc.cameraon.constants.LoggingConstants;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

public class LogFileManager implements ErrorHandler, WarnHandler, InfoHandler, DebugHandler, LogHandler {

    private static final File _folder = new File(LoggingConstants.LOG_FOLDER);
    private boolean _LATEST_EXISTS;
    private final LocalDateTime _INIT_TIME;
    private static String _INIT_TIME_FORMATTED;
    private static File currentLogFile;

    public LogFileManager() {
        this._INIT_TIME = Launcher._INIT_TIME;
        _initialize();
    }

    private void _initialize() {
        /*CHECK IF LOGS FOLDER EXISTS*/
        if (!_folder.exists()) _folder.mkdirs();
        /*CHECK IF LATEST.LOG EXISTS*/
        _LATEST_EXISTS = _fileExists(LoggingConstants.LOG_LATEST);
        /*FORMAT INIT TIME*/
        _INIT_TIME_FORMATTED = _INIT_TIME.format(LoggingConstants.LOG_DATE_FORMAT);
        /* COPY LATEST TO ITS OWN FILE */
        if (_LATEST_EXISTS) {
            File latest = new File(_folder, LoggingConstants.LOG_LATEST);
            if (_sameDayLogs(_logCreationDateFormatted(LoggingConstants.LOG_LATEST)) >= 1) {
                currentLogFile = _createLog(LoggingConstants.LOG_NAME_DUPLICATE_FORMAT.formatted(
                        _logCreationDateFormatted(LoggingConstants.LOG_LATEST),
                        String.valueOf(_sameDayLogs(_logCreationDateFormatted(LoggingConstants.LOG_LATEST)))
                ));
            } else {
                currentLogFile = _createLog(LoggingConstants.LOG_NAME_FORMAT.formatted(
                        _logCreationDateFormatted(LoggingConstants.LOG_LATEST)
                ));
            }
            try {
                _copyContents(latest, currentLogFile);
            } catch (IOException e) {
                e.printStackTrace();
            }
            currentLogFile = latest;
            _wipeContents(currentLogFile);
        } else {
            currentLogFile = _createLog(LoggingConstants.LOG_LATEST);
        }
        System.out.println(getCurrentTimestamp());
    }

    private static boolean _fileExists(String filename) {
        for (File f: Objects.requireNonNull(_folder.listFiles()))
            if (f.getName().equals(filename)) return true;
        return false;
    }
    private static boolean _fileExists(File _f, String filename) {
        for (File f: Objects.requireNonNull(_f.listFiles()))
            if (f.getName().equals(filename)) return true;
        return false;
    }

    private static @NotNull File _createLog(String name) {
        File log = new File(_folder, name);
        try {
            log.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return log;
    }
    private static @NotNull File _createLog(File _f, String name) {
        File file = new File(_f, name);
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return file;
    }

    private static Object @NotNull[] _countReOccuringFiles(String baseName) {
        if (!_folder.exists()) _folder.mkdir();
        File[] files = _folder.listFiles();
        ArrayList < String > _f = new ArrayList < String > ();
        for (int i = 0; i < Objects.requireNonNull(files).length; i++)
            if (files[i].getName().contains(baseName)) _f.add(files[i].getName());
        return _f.toArray();
    }

    private void _wipeContents(@NotNull File a) {
        try {
            Files.newBufferedWriter(a.toPath(), StandardOpenOption.TRUNCATE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Copies contents of a to b
     *
     * @param a
     * @param b
     */
    private void _copyContents(File a, File b) throws IOException {
        FileInputStream input = new FileInputStream(a);
        BufferedReader reader = new BufferedReader(new InputStreamReader(input));

        FileWriter ostream = new FileWriter(b, false);
        BufferedWriter out = new BufferedWriter(ostream);

        String line = null;
        while ((line = reader.readLine()) != null) {
            out.write(line);
            out.newLine();
        }

        // reader close
        reader.close();
        // writer close
        out.close();
    }

    private static long _logCreationDateMilli(@NotNull File a) throws IOException {
        return Files.readAttributes(a.toPath(), BasicFileAttributes.class).creationTime().to(TimeUnit.MILLISECONDS);
    }

    @Contract(value = "_ -> new", pure = true)
    private static @NotNull Date _logCreationDate(long milliseconds) {
        return new Date(milliseconds);
    }

    private static @Nullable String _logCreationDateFormatted(String baseName) {
        try {
            return LocalDateTime.ofInstant(
                    _logCreationDate(
                            _logCreationDateMilli(
                                    Objects.requireNonNull(_getFile(baseName))
                            )
                    ).toInstant(), ZoneId.systemDefault()).format(LoggingConstants.LOG_DATE_FORMAT);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    private static int _sameDayLogs() {
        return _countReOccuringFiles(_INIT_TIME_FORMATTED).length;
    }

    private static int _sameDayLogs(String date) {
        return _countReOccuringFiles(date).length;
    }

    private static @Nullable File _getFile(String baseName) {
        for (File _f: Objects.requireNonNull(_folder.listFiles()))
            if (_f.getName().equals(baseName)) return _f;
        return null;
    }

    public static String @NotNull[] existentLogFiles() {
        if (!_folder.exists()) _folder.mkdir();
        File[] logs = _folder.listFiles();
        assert logs != null;
        String[] logNames = new String[logs.length];
        for (int i = 0; i < logs.length; i++)
            logNames[i] = logs[i].getName();
        return logNames;
    }

    public static String getCurrentTimestamp() {
        return "%sT%s".formatted(LocalDateTime.now().format(LoggingConstants.LOG_DATE_FORMAT), LocalDateTime.now().format(LoggingConstants.LOG_TIME_FORMAT));
    }

    private void append(String line) {
        System.out.println(line); // Mandatory (Not Debugging)
        try {
            Files.write(currentLogFile.toPath(), (line+"\n").getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override public void error(String message, Exception e) {
        append(LoggingConstants.LOG_CLASSED_FORMAT.formatted(LogFileManager.getCurrentTimestamp(), e.getClass().getName(), Level.ERROR.label(), message));
    }
    @Override public void error(String message) {
        append(LoggingConstants.LOG_UNCLASSED_FORMAT.formatted(LogFileManager.getCurrentTimestamp(), Level.ERROR.label(), message));
    }
    @Override public void error(Exception e) {
        append(LoggingConstants.LOG_CLASSED_FORMAT.formatted(LogFileManager.getCurrentTimestamp(), e.getClass().getName(), Level.ERROR.label(), e.getMessage()));
    }
    @Override public void error(String message, Exception e, Class <?> clazz) {
        append(LoggingConstants.LOG_SUPER_FORMAT.formatted(LogFileManager.getCurrentTimestamp(), Level.ERROR.label(), clazz.getSimpleName(), e.getClass().getName(), message));
    }
    @Override public void error(String message, Exception e, String name) {
        append(LoggingConstants.LOG_SUPER_FORMAT.formatted(LogFileManager.getCurrentTimestamp(), Level.ERROR.label(), e.getClass().getName(), name, message));
    }
    @Override public void warn(String message, Exception e) {
        append(LoggingConstants.LOG_CLASSED_FORMAT.formatted(LogFileManager.getCurrentTimestamp(), e.getClass().getName(), Level.WARN.label(), message));
    }
    @Override public void warn(String message) {
        append(LoggingConstants.LOG_UNCLASSED_FORMAT.formatted(LogFileManager.getCurrentTimestamp(), Level.WARN.label(), message));
    }
    @Override public void warn(Exception e) {
        append(LoggingConstants.LOG_CLASSED_FORMAT.formatted(LogFileManager.getCurrentTimestamp(), e.getClass().getName(), Level.WARN.label(), e.getMessage()));
    }
    @Override public void warn(String message, Exception e, Class <?> clazz) {
        append(LoggingConstants.LOG_SUPER_FORMAT.formatted(LogFileManager.getCurrentTimestamp(), Level.WARN.label(), clazz.getSimpleName(), e.getClass().getName(), message));
    }
    @Override public void warn(String message, Exception e, String name) {
        append(LoggingConstants.LOG_SUPER_FORMAT.formatted(LogFileManager.getCurrentTimestamp(), Level.WARN.label(), e.getClass().getName(), name, message));
    }
    @Override public void debug(String message, Exception e) {
        append(LoggingConstants.LOG_CLASSED_FORMAT.formatted(LogFileManager.getCurrentTimestamp(), e.getClass().getName(), Level.DEBUG.label(), message));
    }
    @Override public void debug(String message) {
        append(LoggingConstants.LOG_UNCLASSED_FORMAT.formatted(LogFileManager.getCurrentTimestamp(), Level.DEBUG.label(), message));
    }
    @Override public void debug(Exception e) {
        append(LoggingConstants.LOG_CLASSED_FORMAT.formatted(LogFileManager.getCurrentTimestamp(), e.getClass().getName(), Level.DEBUG.label(), e.getMessage()));
    }
    @Override public void debug(String message, Exception e, Class <?> clazz) {
        append(LoggingConstants.LOG_SUPER_FORMAT.formatted(LogFileManager.getCurrentTimestamp(), Level.DEBUG.label(), clazz.getSimpleName(), e.getClass().getName(), message));
    }
    @Override public void debug(String message, Exception e, String name) {
        append(LoggingConstants.LOG_SUPER_FORMAT.formatted(LogFileManager.getCurrentTimestamp(), Level.DEBUG.label(), e.getClass().getName(), name, message));
    }
    @Override public void info(String message, Exception e) {
        append(LoggingConstants.LOG_CLASSED_FORMAT.formatted(LogFileManager.getCurrentTimestamp(), e.getClass().getName(), Level.INFO.label(), message));
    }
    @Override public void info(String message) {
        append(LoggingConstants.LOG_UNCLASSED_FORMAT.formatted(LogFileManager.getCurrentTimestamp(), Level.INFO.label(), message));
    }
    @Override public void info(Exception e) {
        append(LoggingConstants.LOG_CLASSED_FORMAT.formatted(LogFileManager.getCurrentTimestamp(), e.getClass().getName(), Level.INFO.label(), e.getMessage()));
    }
    @Override public void info(String message, Exception e, Class <?> clazz) {
        append(LoggingConstants.LOG_SUPER_FORMAT.formatted(LogFileManager.getCurrentTimestamp(), Level.INFO.label(), clazz.getSimpleName(), e.getClass().getName(), message));
    }
    @Override public void info(String message, Exception e, String name) {
        append(LoggingConstants.LOG_SUPER_FORMAT.formatted(LogFileManager.getCurrentTimestamp(), Level.INFO.label(), e.getClass().getName(), name, message));
    }
    @Override @Deprecated(since = "2/18/2022", forRemoval = true) public void log(Level level, String message, Object... args) {
        append(LoggingConstants.LOG_UNCLASSED_FORMAT.formatted(LogFileManager.getCurrentTimestamp(), level.label(), message.formatted(args)));
    }
    @Override public void log(Level level, String message, Exception exception) {
        append(LoggingConstants.LOG_CLASSED_FORMAT.formatted(LogFileManager.getCurrentTimestamp(), exception.getClass().getName(), level.label(), message));
    }
    @Override public void log(Level level, String message, Exception exception, Class<?> clazz) {
        append(LoggingConstants.LOG_SUPER_FORMAT.formatted(LogFileManager.getCurrentTimestamp(), level.label(), clazz.getName(), exception.getClass().getName(), message));
    }
    @Override public void log(Level level, String message, Class<?> clazz) {
        append(LoggingConstants.LOG_CLASSED_FORMAT.formatted(LogFileManager.getCurrentTimestamp(), clazz.getSimpleName(), level.label(), message));
    }
    @Override public void log(Level level, String message, Class<?> clazz, Object... args) {
        append(LoggingConstants.LOG_CLASSED_FORMAT.formatted(LogFileManager.getCurrentTimestamp(), clazz.getSimpleName(), level.label(), message.formatted(args)));
    }
    @Override public void log(Level level, String message) {
        append(LoggingConstants.LOG_UNCLASSED_FORMAT.formatted(LogFileManager.getCurrentTimestamp(), level.label(), message));
    }

    public void log(final Logger logger, Level level, String message) {
        append(LoggingConstants.LOG_CLASSED_FORMAT.formatted(logger.getName(), LogFileManager.getCurrentTimestamp(), level.label(), message));
    }
}