package pl.coderslab.datainput;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TryWithResourcesExample {
    public static void main(String[] args) throws FileNotFoundException {

    }

    static void readFromFile() throws FileNotFoundException {
        File f = new File("f.txt");
        try(Scanner scan = new Scanner(f);
            Scanner scan2 = new Scanner(f)){

        }
        // read with scanner

        // milion linii kodu






        // kolejny milion linii kodu
    }
}
