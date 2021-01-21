package pl.coderslab.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadWithScannerExample {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(new File("text1.txt"));
    }
}
