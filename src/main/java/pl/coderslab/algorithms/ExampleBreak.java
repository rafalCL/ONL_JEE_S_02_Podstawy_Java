package pl.coderslab.algorithms;

import javax.naming.PartialResultException;

public class ExampleBreak {
    public static void main(String[] args) {
        int dayOfWeek = 42;
        String dayOfWeekString;

        switch (dayOfWeek) {
            case 1:
                System.out.println("case 1");
            case 2:
                System.out.println("case 2");
            case 3:
                System.out.println("case 3");
            default:
                System.out.println("case default");
                break;
        }
        System.out.println("after case");

        dayOfWeekString = "";
    }
}
