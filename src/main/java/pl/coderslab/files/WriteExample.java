package pl.coderslab.files;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WriteExample {
    public static void main(String[] args) throws FileNotFoundException {
        final String INPUT = "1.1, 1.2, 1.3, 2.0, 1.8\n" +
                "1.3, aa, 4.5, 6.7, 2.1\n" +
                "3.5, 7.7, 9.9, 4.1, 2.1";

        PrintWriter pw = new PrintWriter("data2.txt");
        pw.print(INPUT);
        pw.close();
    }
}
