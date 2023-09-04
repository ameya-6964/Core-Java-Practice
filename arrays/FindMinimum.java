package arrays;

import java.util.Scanner;

public class FindMinimum {
    // Function To Take Input Of Array
    public static int[] takeInput(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<n;i++){
            System.out.println("Enter Element At "+ i + " th Index");
            arr[i] = sc.nextInt();
        }
        return  arr;
    }
    // Function To Find Minimum Number From Array
    public static int minimum(int [] arr){
        int min = Integer.MAX_VALUE;
        for(int i = 0; i< arr.length ; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int arr[] = takeInput();
        int minimum = minimum(arr);
        System.out.println(minimum);

    }
}
