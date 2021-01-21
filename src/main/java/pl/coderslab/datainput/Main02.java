package pl.coderslab.datainput;

import java.util.Scanner;

public class Main02 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Wprowadź działanie (a operator b):");
        int a = scan.nextInt();
        char operator = scan.next().charAt(0);
        int b = scan.nextInt();
        int result;
        switch (operator){
            case '+':
                result = a + b;
                System.out.println(a + " " + operator + " " + b + " = " + result);
                break;
            case '*':
                result = a * b;
                System.out.println(a + " " + operator + " " + b + " = " + result);
                break;
            default:
                System.out.println("Błędny znak działania: " + operator);
        }
    }
}
