package pl.coderslab.datainput;

import java.util.Scanner;

public class ScannerExample2 {
    public static void main(String[] args) {
        System.out.print("Podaj liczbę całkowitą: ");
        Scanner scan = new Scanner(System.in);
        while (!scan.hasNextInt()) {
            scan.next();
            System.out.print("Nieprawidłowe dane. Podaj jeszcze raz:");
        }
        int number = scan.nextInt();
        System.out.println("Podałeś liczbę: " + number);
        String coZostalo = scan.nextLine();
        System.out.println(coZostalo);
    }
}
