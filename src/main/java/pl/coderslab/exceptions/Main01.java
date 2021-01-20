package pl.coderslab.exceptions;

//W pliku `Main01.java` została umieszczona metoda o sygnaturze:
//        `public static int factorial(int number)`
//
//        zwracająca silnię liczby naturalnej przekazanej w parametrze.

//        2. zwróć uwagę czy jest to wyjątek kontrolowany czy niekontrolowany i dlaczego,
//        3. przetestuj działanie programu wywołując metodę `factorial` z poprawnym i z niepoprawnym parametrem,
//        4. przy wywołaniu metody `factorial` dodaj obsługę wyjątku `IllegalArgumentException`,
//        5. przetestuj ponownie działanie programu.


public class Main01 {

    public static void main(String[] args) {
        try {
            int result = factorial(4);
            System.out.println(result);
        } catch (IllegalArgumentException e){
            System.out.println("Błąd: " + e.getMessage());
        }
        System.out.println("koniec programu.");
    }

    static int factorial(int number) {
//        1. zmodyfikuj kod tak, aby metoda zwracała wyjątek `IllegalArgumentException`
//        w sytuacji, gdy liczba `number` przekazana w parametrze będzie mniejsza od zera,
        if(number < 0){
            throw new IllegalArgumentException("Invalid input for factorial: "+number);
        }
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }
}
