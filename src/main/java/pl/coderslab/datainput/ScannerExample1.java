package pl.coderslab.datainput;

import java.util.Scanner;

public class ScannerExample1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Wprowadź imię:");
        String imie = scan.nextLine();
        System.out.println("Wprowadź wiek:");
        int age = scan.nextInt();
        System.out.println("Wprowadź ksywe:");
        String nickname = scan.nextLine();

        System.out.println("imie: " + imie + ", wiek: " + age + ", ksywa: ");
    }
}
