package pl.coderslab.algorithms;

public class LoopsExample {
    public static void main(String[] args) {
        for (int i=0; i<5; i++){
            System.out.println(i);
        }

//        for (;true;){
//            System.out.println("infinite loop");
//        }

        int i=0;
        for (; i<5; i++){
            System.out.println("infinite loop");
        }

        do {
            // at least once
        } while (i<5);
    }
}
