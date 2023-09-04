package arrays;

import java.util.Scanner;

public class TakingInputFromUserArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<arr.length;i++){
            System.out.println("Enter Element At "+ i + " th Index");
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i< arr.length ; i++){
            System.out.println("Element at Index : "+i+ " Is "+arr[i]);
        }
    }
}
