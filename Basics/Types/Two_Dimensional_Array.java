package Basics.Types;

import java.util.Arrays;

public class Two_Dimensional_Array {
    public static void main(String[] args) {
        //! First Syntax

        int[][] numbers = new int[2][3];
        numbers[0][0] = 1;
        numbers[0][1] = 2;
        numbers[0][2] = 3;
        numbers[1][0] = 4;
        numbers[1][1] = 5;
        numbers[1][2] = 6;
        System.out.println(Arrays.deepToString(numbers)); //[[1, 2, 3], [4, 5, 6]]

        //! Second Syntax
        int [][] numbers1 = {{1,2,3},{4,5,6}};
        System.out.println(Arrays.deepToString(numbers1)); // [[1, 2, 3], [4, 5, 6]]
    }
}
