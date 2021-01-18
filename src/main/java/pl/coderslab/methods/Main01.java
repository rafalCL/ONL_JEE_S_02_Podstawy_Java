package pl.coderslab.methods;

public class Main01 {

    public static void main(String[] args) {
        int multiplied = multiply(2,3);

        System.out.println(multiplied);
    }

    public static int multiply(int multipler, int index) {
        int result = multipler * index;

        return result;
    }
}
