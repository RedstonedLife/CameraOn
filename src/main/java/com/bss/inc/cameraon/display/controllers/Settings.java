package com.bss.inc.cameraon.display.controllers;

import com.bss.inc.cameraon.constants.FilePaths;
import com.bss.inc.cameraon.exceptions.UnknownOS;
import com.bss.inc.cameraon.logging.Logger;
import com.bss.inc.cameraon.settings.ISettings;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Settings implements ISettings {

    private File file;
    private String name;
    private String defaultJsonSettings;
    private HashMap<String, Object> values = new HashMap<String, Object>();
    private Logger logger;

    public Settings(final String name) throws UnknownOS {
        this.name = name;
        file = new File(FilePaths.SETTINGS_FOLDER+name +".json");
        if(FilePaths.SETTINGS_FOLDER.equals("UKNS"))
            throw new UnknownOS("An unsupported OS is being used, exiting.");
        logger = Logger.getLogger("BNC");
        Setup();
    }

    public Settings(final String name, final String defaultJsonSettings) throws UnknownOS {
        this.name = name;
        this.defaultJsonSettings = defaultJsonSettings;
        file = new File(FilePaths.SETTINGS_FOLDER+name +".json");
        if(FilePaths.SETTINGS_FOLDER.equals("UKNS"))
            throw new UnknownOS("An unsupported OS is being used, exiting.");
        logger = Logger.getLogger("BNC");
        Setup();
    }

    @Override
    public void Setup() {
        if(!file.exists()) {
            file.getParentFile().mkdir();
            try{file.createNewFile();}
            catch(IOException e){logger.error("Could not initialize "+name+".json ", e);}
            try {new JSONObject(defaultJsonSettings);} catch (JSONException e) {
                logger.error("Invalid default JSON settings for "+name+".json, reverting to in-house default",e);
            }
            try {
                JSONObject _n = new JSONObject("{}");
                PrintWriter pw = new PrintWriter(file.getPath());
                pw.write(_n.toString());
                pw.flush();
                pw.close();
                _n = null;
                pw = null;
            } catch(FileNotFoundException e) {logger.error(name+".json was not found.",e);}
        } else {
            try {Load();}
            catch (FileNotFoundException e) {logger.error(name+".json was not found.",e);}
        }
    }

    @Override
    public void Save() throws FileNotFoundException, JSONException {
        JSONObject settings = new JSONObject();
        for(String k : values.keySet()) {settings.put(k, values.get(k));}
        PrintWriter pw = null;
        try {pw = new PrintWriter(file.getPath());}catch (FileNotFoundException e) {
            logger.error(name+".json was not found! Running setup again!", e);
            Setup();
            Save();
        }
        pw.write(settings.toString());
        pw.flush();
        pw.close();
        pw = null;
        settings = null;
    }

    @Override
    public void Load() throws FileNotFoundException, JSONException {
        StringBuilder builder = new StringBuilder();
        Scanner reader = new Scanner(file);
        while (reader.hasNextLine()) {builder.append(reader.nextLine());}
        JSONObject settings = new JSONObject(builder.toString());
        builder = null;
        reader = null;
        for(String k : settings.keySet()) {
            if(values.containsKey(k)) {
                values.replace(k, settings.get(k));
            }
        }
    }

    @Override
    public <T> T getValue(String key) {
        return null;
    }

    @Override
    public <T> void setValue(String key, T value) {

    }
}
