package com.bss.inc.cameraon.logging;

import com.bss.inc.cameraon.Launcher;
import com.bss.inc.cameraon.constants.LoggingConstants;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

public class ScanFileManager {

    private static final File _folder = new File(LoggingConstants.SCAN_FOLDER);
    private static File currentScanFile;
    private boolean _LATEST_EXISTS;
    private final LocalDateTime _INIT_TIME;
    private static String _INIT_TIME_FORMATTED;

    public ScanFileManager() {
        this._INIT_TIME = Launcher._INIT_TIME;
        _initialize();
    }
    private void _initialize() {
        /*CHECK IF LOGS FOLDER EXISTS*/
        if (!_folder.exists()) _folder.mkdirs();
        /*CHECK IF LATEST.LOG EXISTS*/
        _LATEST_EXISTS = _fileExists(LoggingConstants.SCAN_LATEST);
        /*FORMAT INIT TIME*/
        _INIT_TIME_FORMATTED = _INIT_TIME.format(LoggingConstants.LOG_DATE_FORMAT);
        /* COPY LATEST TO ITS OWN FILE */
        if (_LATEST_EXISTS) {
            File latest = new File(_folder, LoggingConstants.SCAN_LATEST);
            if (_sameDayScan(_ScanCreationDateFormatted(LoggingConstants.LOG_LATEST)) >= 1) {
                currentScanFile = _createScan(LoggingConstants.SCAN_NAME_DUPLICATE_FORMAT.formatted(
                        _ScanCreationDateFormatted(LoggingConstants.SCAN_LATEST),
                        String.valueOf(_sameDayScan(_ScanCreationDateFormatted(LoggingConstants.SCAN_LATEST)))
                ));
            } else {
                currentScanFile = _createScan(LoggingConstants.SCAN_NAME_FORMAT.formatted(
                        _ScanCreationDateFormatted(LoggingConstants.SCAN_LATEST)
                ));
            }
            try {
                _copyContents(latest, currentScanFile);
            } catch (IOException e) {
                e.printStackTrace();
            }
            currentScanFile = latest;
            _wipeContents(currentScanFile);
        } else {
            currentScanFile = _createScan(LoggingConstants.SCAN_LATEST);
        }
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

    private static @NotNull File _createScan(String name) {
        File log = new File(_folder, name);
        try {
            log.createNewFile();
        } catch (IOException e) {
            new LogFileManager().error("Could not create log file " + name, e);
        }
        return log;
    }
    private static @NotNull File _createScan(File _f, String name) {
        File file = new File(_f, name);
        try {
            file.createNewFile();
        } catch (IOException e) {
            new LogFileManager().error("Could not create log file " + name, e);
        }
        return file;
    }

    private static Object @NotNull[] _countReOccuringFiles(String baseName) {
        if (!_folder.exists()) _folder.mkdir();
        File[] files = _folder.listFiles();
        ArrayList< String > _f = new ArrayList < String > ();
        for (int i = 0; i < Objects.requireNonNull(files).length; i++)
            if (files[i].getName().contains(baseName)) _f.add(files[i].getName());
        return _f.toArray();
    }

    private void _wipeContents(@NotNull File a) {
        try {
            Files.newBufferedWriter(a.toPath(), StandardOpenOption.TRUNCATE_EXISTING);
        } catch (IOException e) {
            new LogFileManager().error("Could not wipe log file-" + a.getName() + " contents", e);
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

    private static long _ScanCreationDateMilli(@NotNull File a) throws IOException {
        return Files.readAttributes(a.toPath(), BasicFileAttributes.class).creationTime().to(TimeUnit.MILLISECONDS);
    }

    @Contract(value = "_ -> new", pure = true)
    private static @NotNull Date _ScanCreationDate(long milliseconds) {
        return new Date(milliseconds);
    }

    private static @Nullable String _ScanCreationDateFormatted(String baseName) {
        try {
            return LocalDateTime.ofInstant(
                    _ScanCreationDate(
                            _ScanCreationDateMilli(
                                    Objects.requireNonNull(_getFile(baseName))
                            )
                    ).toInstant(), ZoneId.systemDefault()).format(LoggingConstants.SCAN_DATE_FORMAT);
        } catch (IOException e) {
            Logger.getLogger("BNC").error("Scan file name date format creation failed (base-name: " + baseName + ")", e);
        }
        return null;
    }

    private static int _sameDayScan() {
        return _countReOccuringFiles(_INIT_TIME_FORMATTED).length;
    }

    private static int _sameDayScan(String date) {
        return _countReOccuringFiles(date).length;
    }

    private static @Nullable File _getFile(String baseName) {
        for (File _f: Objects.requireNonNull(_folder.listFiles()))
            if (_f.getName().equals(baseName)) return _f;
        return null;
    }

    public static String @NotNull[] existentScanFiles() {
        if (!_folder.exists()) _folder.mkdir();
        File[] logs = _folder.listFiles();
        assert logs != null;
        String[] logNames = new String[logs.length];
        for (int i = 0; i < logs.length; i++)
            logNames[i] = logs[i].getName();
        return logNames;
    }

    public static String getCurrentTimestamp() {
        return "%sT%s".formatted(LocalDateTime.now().format(LoggingConstants.SCAN_DATE_FORMAT), LocalDateTime.now().format(LoggingConstants.LOG_TIME_FORMAT));
    }

    private void _append(String line) {
        try {
            Files.write(currentScanFile.toPath(), (line+"\n").getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            Logger.getLogger("BNC").error("Could not append line to scan ", e); // WTF? WHY?!
        }
    }

    public void append(String line) {_append(line);}

}
