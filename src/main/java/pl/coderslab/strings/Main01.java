package pl.coderslab.strings;

//## Zadanie 1 - rozwiązywane z wykładowcą
//
//        W pliku `Main01.java` napisz program, który:
//
//        1. pobierze przedostatnią literę zmiennej `str`, znajdującej się w pliku,
//        2. wyświetli na konsoli liczbę wystąpień tej litery w całym ciągu znaków.

public class Main01 {

    public static void main(String[] args) {
        String str = "CodersLab jak dobrze zacząć programować";

        char secondLastLetter = str.charAt(str.length()-2);
        System.out.println(secondLastLetter);

        int count = 0;

        for(int i = 0; i<str.length(); i++){
            if(str.charAt(i)==secondLastLetter){
                count++;
            }
        }
        System.out.println(count);
    }
}
