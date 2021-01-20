package pl.coderslab.exceptions;

import pl.coderslab.algorithms.ExampleBreak;

import java.io.IOException;

public class ExceptionExample {
    public static void main(String[] arguments) {
        try {
            int result = divide(3, 10000);
            System.out.println(result);
        } catch (IllegalArgumentException e){
            System.out.println("Przechwycono wyjątek illegal argument: "+ e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("przechwycono ogólny wyjątek: "+e.getMessage());
        } finally {
            System.out.println("wykonam się zawsze, niezależnie, czy był wyjątek, czy nie");
        }
        System.out.println("Metoda main. Koniec programu.");
    }

    static int divide(int a, int b) {
        if(b==0){
            throw new IllegalArgumentException("Denominator equals 0.");
        }

        if (b > 1000) {
            throw new RuntimeException("Za duża liczba: "+b);
        }
        return a/b;
    }

    static int veryPrimitiveApproach(int age){
        return -1;
    }
}
