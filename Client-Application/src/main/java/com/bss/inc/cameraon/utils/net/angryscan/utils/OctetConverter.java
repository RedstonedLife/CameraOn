package com.bss.inc.cameraon.utils.net.angryscan.utils;

public final class OctetConverter {
    private OctetConverter() {}

    /**
     * Converts a set of IPv4 octets to a 32-bit word.
     *
     * @param octets A byte array containing the IPv4 octets.
     * @param offset The offset into the array where the octets start.
     * @return The 32-bit word representation of the IPv4 address.
     */
    public static int octetsToInt(byte[] octets, int offset) {
        return (((octets[offset] & 0xff) << 24) |
                ((octets[offset + 1] & 0xff) << 16) |
                ((octets[offset + 2] & 0xff) << 8) |
                (octets[offset + 3] & 0xff));
    }

    /**
     * Same as <code>octetsToInt(octets, 0);</code>
     */
    public static int octetsToInt(byte[] octets) {
        return octetsToInt(octets, 0);
    }

    /**
     * Converts a set of octets to a 64-bit word.
     *
     * @param octets A byte array containing the octets.
     * @param offset The offset into the array where the octets start.
     * @return The 64-bit word representation of the octets.
     */
    public static long octetsToLong(byte[] octets, int offset) {
        return (((octets[offset] & 0xffffL) << 56) |
                ((octets[offset + 1] & 0xffL) << 48) |
                ((octets[offset + 2] & 0xffL) << 40) |
                ((octets[offset + 3] & 0xffL) << 32) |
                ((octets[offset + 4] & 0xffL) << 24) |
                ((octets[offset + 5] & 0xffL) << 16) |
                ((octets[offset + 6] & 0xffL) << 8) |
                (octets[offset + 7] & 0xffL));
    }

    /**
     * Same as <code>octetsToLong(octets, 0);</code>
     */
    public static long octetsToLong(byte[] octets) {
        return octetsToLong(octets, 0);
    }

    /**
     * Converts a set of IPv4 octets to a string representation.
     *
     * @param buffer The StringBuffer to which to append the string.
     * @param octets A byte array containing the IPv4 octets.
     * @param offset The offset into the array where the octets start.
     */
    public static void octetsToString(StringBuffer buffer, byte[] octets, int offset) {
        buffer.append(octets[offset++] & 0xff);
        buffer.append(".");
        buffer.append(octets[offset++] & 0xff);
        buffer.append(".");
        buffer.append(octets[offset++] & 0xff);
        buffer.append(".");
        buffer.append(octets[offset++] & 0xff);
    }

    /**
     * Same as <code>octetsToString(buffer, octets, 0);</code>
     */
    public static void octetsToString(StringBuffer buffer, byte[] octets) {
        octetsToString(buffer, octets, 0);
    }

    /**
     * Converts a 32-bit word representation of an IPv4 address to a
     * string representation.
     *
     * @param buffer The StringBuffer to which to append the string.
     * @param address The 32-bit word representation of the address.
     */
    public static void intToString(StringBuffer buffer, int address) {
        buffer.append(0xff & (address >>> 24));
        buffer.append(".");
        buffer.append(0xff & (address >>> 16));
        buffer.append(".");
        buffer.append(0xff & (address >>> 8));
        buffer.append(".");
        buffer.append(0xff & address);
    }

    /**
     * Converts a 32-bit word representation of an IPv4 address to a
     * byte array of octets.
     *
     * @param address The 32-bit word representation of the IPv4 address.
     * @param octets The byte array in which to store the IPv4 octets.
     * @param offset The offset into the array where the octets start.
     */
    public static void intToOctets(int address, byte[] octets, int offset) {
        octets[offset]     = (byte)(0xff & (address >>> 24));
        octets[offset + 1] = (byte)(0xff & (address >>> 16));
        octets[offset + 2] = (byte)(0xff & (address >>> 8));
        octets[offset + 3] = (byte)(0xff & address);
    }

    /**
     * Same as <code>intToOctets(address, octets, 0);</code>
     */
    public static void intToOctets(int address, byte[] octets) {
        intToOctets(address, octets, 0);
    }

    /**
     * Converts a 64-bit word to a byte array of octets.
     *
     * @param address The 64-bit word.
     * @param octets The byte array in which to store octets.
     * @param offset The offset into the array where the octets start.
     */
    public static void longToOctets(long address, byte[] octets, int offset) {
        octets[offset]     = (byte)(0xffL & (address >>> 56));
        octets[offset + 1] = (byte)(0xffL & (address >>> 48));
        octets[offset + 2] = (byte)(0xffL & (address >>> 40));
        octets[offset + 3] = (byte)(0xffL & (address >>> 32));
        octets[offset + 4] = (byte)(0xffL & (address >>> 24));
        octets[offset + 5] = (byte)(0xffL & (address >>> 16));
        octets[offset + 6] = (byte)(0xffL & (address >>> 8));
        octets[offset + 7] = (byte)(0xffL & address);
    }


    /**
     * Same as <code>longToOctets(address, octets, 0);</code>
     */
    public static void longToOctets(long address, byte[] octets) {
        longToOctets(address, octets, 0);
    }
}
