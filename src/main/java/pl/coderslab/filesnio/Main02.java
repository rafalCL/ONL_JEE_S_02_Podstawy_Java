package pl.coderslab.filesnio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main02 {

    public static void main(String[] args) {
        try {
            Files.createDirectory(Paths.get("ala"));
            extendedCreateFile("ala", "makota.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    static void extendedCreateFile(String directoryName, String fileName) throws IOException {
        Path p = Paths.get(directoryName, fileName);
        Files.createFile(p);
    }
}
