package pl.coderslab.cutstrings;

import java.util.Arrays;

public class Main04 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString("a-b-c-d".split("-", 3)));
    }

    public static String[] onlyTwoElements(String str, char separator){
        return str.split(String.valueOf(separator), 2);
    }
}
