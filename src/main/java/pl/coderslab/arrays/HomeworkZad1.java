package pl.coderslab.arrays;

import java.util.Arrays;

public class HomeworkZad1 {
    public static void main(String[] args) {
        int[] nonUnique = {1,1,2,2,3};
        int[] unique = returnUnique(nonUnique);
        System.out.println(Arrays.toString(unique));
    }

    public static int[] returnUnique(int[] arr){
        int[] result = new int[0];

        for (int elem : arr){
            if(true){ // TODO test if unique
                result = Arrays.copyOf(result, result.length+1);
                result[result.length-1] = elem; // new value
            }
        }

        return result;
    }

    public static int oddSum(int[][] arr){
        int sum = 0;
        for (int[] row : arr){
            for (int i = 0; i< row.length; i++){
                if (i%2==1){
                    sum+=row[i];
                }
            }
        }

        return sum;
    }
}
