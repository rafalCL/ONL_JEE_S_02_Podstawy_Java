package pl.coderslab.algorithms;

public class MethodCallExample {
    public static void main(String[] args) {
        String name = "User";
        sayHello(name);
        sayHello("Adrianna");

        int result = calculateSum(2,3);
        System.out.println(result);
    }

    static void sayHello(String userName) {
        System.out.println("Hello " + userName + "! :)");
    }

    static int calculateSum(int a, int b) {
        int sum = a + b;
        return sum;
    }
}
