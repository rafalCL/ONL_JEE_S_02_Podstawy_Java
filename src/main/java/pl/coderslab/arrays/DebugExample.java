package pl.coderslab.arrays;

public class DebugExample {
    public static void main(String[] args) {
        System.out.println("pierwsza linia");
        boolean ifIsOdd = isOdd(3);
        System.out.println(ifIsOdd);
    }

















    public static boolean isOdd(int toCheck){
        return toCheck % 2 == 1;
    }

}
