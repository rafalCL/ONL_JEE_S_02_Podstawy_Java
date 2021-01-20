package pl.coderslab.datainput;

//W pliku `Main01.java` stwórz metodę o sygnaturze:
//
//        `public static void getInfo()`.
//
//        W ciele metody dodaj kod, który:
//
//        1. poprosi Cię o podanie imienia,
//        2. poprosi Cię o podanie wieku,
//        3. wypisze na konsoli informacje w formacie `"{imię} ma {wiek} lat"`.
//        Wywołaj metodę w metodzie `main`.

import java.util.Scanner;

public class Main01 {

    public static void main(String[] args) {
        getInfo();
    }

    public static void getInfo(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj imię:");
        String name = scan.nextLine();
        System.out.println("Podaj wiek: ");
        while (!scan.hasNextInt()){
            scan.nextLine();
            System.out.println("Nieprawidłowa wartość wieku, podaj LICZBĘ! Podaj wiek: ");
        }
        int age = scan.nextInt();
        System.out.println(String.format("%s ma %s lat.", name, age));
    }
}
