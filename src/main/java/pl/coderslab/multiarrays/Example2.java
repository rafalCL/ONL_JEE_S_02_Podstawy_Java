package pl.coderslab.multiarrays;

public class Example2 {
    public static void main(String[] args) {
        int rowCount = 3;
        int colCount1 = 4;
        int colCount2 = 6;
        int colCount3 = 2;

        // create table with that many rows as defined in rowCount variable
        int[][] tab2d = new int[rowCount][];

        // for every row create inner table with 7 columns
        for (int i=0; i< tab2d.length; i++){
            tab2d[i] = new int[7];
        }

// for each row create different column count as defined in colCount variables
//        tab2d[0] = new int[colCount1];
//        tab2d[1] = new int[colCount2];
//        tab2d[2] = new int[colCount3];

    }
}
