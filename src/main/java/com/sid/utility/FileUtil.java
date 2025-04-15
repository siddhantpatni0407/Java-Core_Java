package com.sid.utility;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

/**
 * @author Siddhant Patni
 */
public class FileUtil {

    public static List<String> readLines(String filePath) throws Exception {
        return Files.readAllLines(Paths.get(filePath));
    }

    public static void writeToFile(String filePath, String content) throws Exception {
        Files.write(Paths.get(filePath), content.getBytes());
    }

}