package pl.coderslab.multiarrays;

public class Main01 {

    public static void main(String[] args) {

		int[][] task1Array = { { 2, 3, 4 }, { 12, 32, 12, 11 }, { 3, 2, 1, 4, 5 }, { 5, 1, 6, 7, 8 } };

//        1. wypisz element znajdujący się w 3 kolumnie i 2 wierszu,
        int elemRow2Col3 = task1Array[1][2];
        System.out.println(elemRow2Col3);
//                2. wypisz długość tablicy znajdującej się w drugim wierszu,
        int[] row2 = task1Array[1];
        int row2Length = row2.length;
        // alternatively: int row2Length = task1Array[1].length;
        System.out.println(row2Length);
//        3. wypisz element znajdujący się w 4 kolumnie i 3 wierszu.
        int elemRow3Col4 = task1Array[2][3];
        System.out.println(elemRow3Col4);


    }
}
