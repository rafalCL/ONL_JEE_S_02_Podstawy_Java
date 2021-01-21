package pl.coderslab.filesnio;
//
//        W pliku `Main01.java` stwórz metodę o sygnaturze:
//
//        `public static void createDirectory(String directoryName)`.
//
//        1. uzupełnij ciało metody tak, aby tworzyła katalog o zadanej nazwie,
//        2. sprawdzaj, czy katalog nie istnieje,
//        3. wykorzystaj metody klas pakietu `java.nio.file`:
//        - `Files.exists(directory)`,
//        - `Files.createDirectory(directory)`.
//

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main01 {

    public static void main(String[] args) {
        try {
            createDirectory("nowy_katalog");
        } catch (IOException e){
            System.out.println("Błąd tworzenia katalogu: " + e.getMessage());
        }
    }

    public static void createDirectory(String directoryName) throws IOException {
        Path dirPath = Paths.get(directoryName);
        if(Files.exists(dirPath)){
            System.out.println("katalog już istnieje"); // tutaj powinien być użyty logger
            return;
        }

        Files.createDirectory(dirPath);
    }
}
