package Challenges;

/* Swap Two Variables Using Third Variable */
import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Before Swapping a : "+ a +" b : " + b );
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After Swapping a : "+ a +" b : " + b );

    }
}
