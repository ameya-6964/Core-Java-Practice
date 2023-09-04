package arrays;

import java.util.Scanner;

public class ArrayFunctions {
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
    // Function To Print Array
    public static void printArr(int [] arr){
        for(int i = 0; i< arr.length ; i++){
            System.out.println("Element at Index : "+i+ " Is "+arr[i]);
        }

    }
    public static void main(String[] args) {
       int arr[] = takeInput();
       printArr(arr);

    }
}
