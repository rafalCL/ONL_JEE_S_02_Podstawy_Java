package pl.coderslab.files;

//        W pliku `Main01.java` napisz program, który będzie wczytywał kolejne linie tekstu z konsoli,
//        a następnie zapisywał je do pliku o nazwie `text1.txt`.
//        Program ma zakończyć działanie po wpisaniu słowa `quit` (bez zapisywania go do pliku `text1 .txt`).

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main01 {
    public static void main(String[] args) {
        Scanner scanUserInput = new Scanner(System.in);
        try(PrintWriter pw = new PrintWriter("text1.txt")) {
            System.out.println("Wprowadź tekst. Pusta linia zakończy wprowadzanie.");
            String input = scanUserInput.nextLine();
            while (!input.equals("")) {
                pw.println(input);
                System.out.println("Wprowadź tekst. Pusta linia zakończy wprowadzanie.");
                input = scanUserInput.nextLine();
            }
        } catch (FileNotFoundException e){
            System.out.println("Błąd zapisu do pliku");
        }
    }
}
