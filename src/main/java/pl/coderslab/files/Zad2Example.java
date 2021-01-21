package pl.coderslab.files;

import java.io.File;
import java.io.FileNotFoundException;

public class Zad2Example {
    public static void main(String[] args) throws FileNotFoundException {
        callingMethod();
    }

    static String readFromFile(String filePath) throws FileNotFoundException {
        File f = new File(filePath);
        // todo implement reading
        // or throw
        return "zawartosc";
    }

    static void callingMethod() throws FileNotFoundException {
        String fileContents = readFromFile("text1.txt");
    }
}
