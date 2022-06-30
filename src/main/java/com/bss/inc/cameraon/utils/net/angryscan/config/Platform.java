package com.redsoftware.ltd.bnc.utils.networking.angryscan.config;

import static java.lang.Double.parseDouble;

public class Platform {

    private static final String OS_NAME = System.getProperty("os.name");

    public static final boolean ARCH_64 = System.getProperty("os.arch").contains("64");

    /**
     * Mac OS detection :-)
     */
    public static final boolean MAC_OS = OS_NAME.contains("OS X");

    /**
     * Linux
     */
    public static final boolean LINUX = OS_NAME.contains("Linux");

    /**
     * Any Windows version
     */
    public static final boolean WINDOWS = OS_NAME.startsWith("Windows");

    /**
     * Crippled-down version of Windows (no RawSockets, TCP rate limiting, etc
     */
    public static final boolean CRIPPLED_WINDOWS = WINDOWS && !OS_NAME.contains("Server") && between(parseDouble(System.getProperty("os.version").substring(0, 3)), 5.1, 6.1);

    private static boolean between(double x, double min, double max) {
        return x >= min && x < max;
    }
}
