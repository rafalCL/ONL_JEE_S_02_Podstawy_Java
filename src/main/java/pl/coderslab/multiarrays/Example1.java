package pl.coderslab.multiarrays;

public class Example1 {
    public static void main(String[] args) {
        int[][] tab2d = {
                {1,2,3},
                {11,12,13},
                {21,22,23}
        };

        int[] firstRow = tab2d[0];
        tab2d[0][0] = 256; // this and next code line reference to the same element in 2d array
        firstRow[0] = 128;

        int firstElemInFirstRow = firstRow[0];
//        firstElemInFirstRow = 64;
        tab2d[1][1] = 42;

        // iterate over 2d array
        for(int i = 0; i<tab2d.length; i++){
            for(int j = 0; j < tab2d[i].length; j++) {
                int elementToPrint = tab2d[i][j];
                System.out.println(elementToPrint);
            }
        }
    }
}
