package arrays;

import java.util.Scanner;

public class LargestNumber {
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
    // Function To Find Maximum Number From Array
    public static int largest(int [] arr){
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for(int i = 0; i< arr.length ; i++){
           if(arr[i] > max){
               secondMax = max;
               max = arr[i];

           }
        }
        return secondMax;
    }
    public static void main(String[] args) {
        int arr[] = takeInput();
        int largest = largest(arr);
        System.out.println(largest);

    }
}
