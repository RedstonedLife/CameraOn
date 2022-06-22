package com.bss.inc.cameraon.utils;

import com.bss.inc.cameraon.MainClass;
import com.bss.inc.cameraon.constants.FilePaths;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class FileResClassLoader extends ClassLoader {
    private final transient File dataFolder;

    public FileResClassLoader(final ClassLoader classLoader, final MainClass instance) {
        super(classLoader);
        this.dataFolder = new File(FilePaths.SETTINGS_FOLDER);
    }

    @Override
    public URL getResource(final String string) {
        final File file = new File(dataFolder, string);
        if (file.exists())
            try {return file.toURI().toURL();} catch (final MalformedURLException ignored) {}
        return null;
    }

    @Override
    public InputStream getResourceAsStream(final String string) {
        final File file = new File(dataFolder, string);
        if (file.exists())
            try {return new FileInputStream(file);} catch (final FileNotFoundException ignored) {}
        return null;
    }
}
