package Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayIntroduction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length Of Array");
        int length = sc.nextInt();
        int [] array = makeArray(length);
        String printedArray =  printArray(array);
        System.out.println(printedArray);
    }

    static int[] makeArray(int length){
        Scanner sc = new Scanner(System.in);
        int createArray[] = new int[length];
        for (int i = 0 ; i<createArray.length;i++){
            System.out.println("Enter Value At : "+ i + " Index");
            createArray[i] = sc.nextInt();
        }
        return createArray;
    }
    static String printArray(int[] arr){
        return Arrays.toString(arr);
    }
}
