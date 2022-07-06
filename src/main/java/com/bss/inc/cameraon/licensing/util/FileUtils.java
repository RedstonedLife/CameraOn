package com.bss.inc.cameraon.licensing.util;

public class FileUtils {
    public static String readFile(String fileName) throws IOException {
        FileReader fileReader = new FileReader(fileName);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        StringBuilder stringBuilder = new StringBuilder();
        String str;
        while ((str = bufferedReader.readLine()) != null) {
            stringBuilder.append(str);
            stringBuilder.append("\n");
        }
        bufferedReader.close();
        fileReader.close();
        return stringBuilder.toString();
    }

    public static boolean writeFile(String fileName, String data) throws IOException {
        FileWriter fileWriter = new FileWriter(fileName);
        BufferedWriter bufferedWriter;
        (bufferedWriter = new BufferedWriter(fileWriter)).write(data);
        bufferedWriter.close();
        fileWriter.close();
        return true;
    }
}
