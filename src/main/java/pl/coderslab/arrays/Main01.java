package pl.coderslab.arrays;

public class Main01 {

    public static void main(String[] args) {
//        int[] arrIntegers = {1,2,3,4};
//        int element0 = arrIntegers[0];
//        int element2 = arrIntegers[2];
//        int lastElem = arrIntegers[arrIntegers.length - 1];

        int[] mainTab = new int[50];

        for(int i = 0; i< mainTab.length; i++){
            mainTab[i] = i;
        }

        for(int i = 0; i< mainTab.length; i++){
            if(i % 10 == 0 && i != 0){
                System.out.println();
            }
            if(mainTab[i] < 10){
                System.out.print("0");
            }
            System.out.print(mainTab[i]);

            if(i != mainTab.length-1) {
                System.out.print(", ");
            }
        }
    }
}
