package Array;

import java.util.Arrays;

public class TwoDimensionalArrays {
    public static void main(String[] args) {
        int twoDimensionArrays[][] = new int[2][2];
     twoDimensionArrays[0][0] = 1;
     twoDimensionArrays[0][1] = 2;
     twoDimensionArrays[1][0] = 3;
     twoDimensionArrays[1][1] = 4;
     for (int i = 0 ; i < twoDimensionArrays.length; i++){
        for (int j=0; j < twoDimensionArrays[i].length; j++){
            System.out.print(twoDimensionArrays[i][j] + " ");
        }
         System.out.println();
     }
    }
}
