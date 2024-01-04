package Basics.Types;

import java.util.Arrays;

public class Arrays_Basic {
    public static void main(String[] args) {
        //! 1st Syntax
        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;
        System.out.println(Arrays.toString(numbers)); // [1, 2, 3, 4, 5]

        int[] numbers2 = {1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(numbers2)); // [1, 2, 3, 4, 5, 6, 7]

    }
}
