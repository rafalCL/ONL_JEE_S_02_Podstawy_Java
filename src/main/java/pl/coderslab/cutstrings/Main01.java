package pl.coderslab.cutstrings;

//W pliku `Main01.java` napisz program, który:
//
//        1. podzieli na wyrazy ciąg znaków przechowywany w zmiennej `str`, znajdującej się w pliku,
//        2. wyświetli na konsoli każdy z tych wyrazów w oddzielnej linii.

public class Main01 {
    public static void main(String[] args) {
        String str = "Naucz się programować od podstaw i rozwiń wymarzoną karierę w branży IT.";
//        1. podzieli na wyrazy ciąg znaków przechowywany w zmiennej `str`, znajdującej się w pliku,
        String[] words = str.split(" ");
//        2. wyświetli na konsoli każdy z tych wyrazów w oddzielnej linii.
        for (String word : words){
            System.out.println(word);
        }
    }
}
