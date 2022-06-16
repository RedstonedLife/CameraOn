package com.bss.inc.cameraon.logging;

import java.util.EnumSet;

public enum Level {

    /*
    No events will be logged.
     */
    OFF("OFF", 0),

    /**
     * A severe error that will prevent the application from continuing
     */
    FATAL("FATAL", 100),

    /**
     * An error in the application, possibly recoverable
     */
    ERROR("ERROR", 200),

    /**
     * An event that might possibly lead to an error
     */
    WARN("WARN", 300),

    /**
     * An event for informational purposes.
     */
    INFO("INFO", 400),

    /**
     * A general debugging event
     */
    DEBUG("DEBUG", 500),

    /**
     * A fine-grained debug message typically capturing the flow through the application
     */
    TRACE("TRACE", 600),

    /**
     * All events should be logged
     */
    ALL("*",Integer.MAX_VALUE);

    private static final EnumSet<Level> LEVELSET = EnumSet.allOf(Level.class);

    public final String label;
    public final int intLevel;

    Level(String label, int intLevel) {
        this.label = label;
        this.intLevel = intLevel;
    }

    public int intLevel() {return intLevel;}
    public String label(){return label;}

    public static Level getStandardLevel(final int intLevel) {
        Level level = Level.OFF;
        for (final Level lvl : LEVELSET) {if (lvl.intLevel > intLevel) {break;} level = lvl;}
        return level;
    }

}
