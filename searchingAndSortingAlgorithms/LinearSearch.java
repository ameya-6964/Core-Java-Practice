package searchingAndSortingAlgorithms;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {5,4,6,8,4,45,56,4865,46,546,94,95,97};
        System.out.println("Your Array is "+ Arrays.toString(arr));
        System.out.println("Select Your Target Element To Check Index Position");
        int target = sc.nextInt();
        int result = linearSearch(arr,target);
        if(result != -1){
            System.out.println("Element Found At Index : " + result);
        }
        else{
            System.out.println("Element Does Not Exist In Array");
        }

    }

     // Search In Array If ITEM Found and Return Index Value
    //  OtherWise Return -1 If Item Not Found
    private static int linearSearch(int[] arr, int target) {
        if(arr.length == 0){
            return -1;
        }
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] == target) {
                return i;
            }
        }

        //Advance For Loop
       /* for(int element : arr){
            if(element == target){
                return element;
            }
            return Integer.MIN_VALUE
        }*/
        return -1;
    }
}
