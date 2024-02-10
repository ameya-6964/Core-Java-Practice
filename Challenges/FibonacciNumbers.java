package Challenges;

import java.util.Scanner;

// FibonacciNumbers Starts With 0 And 1
public class FibonacciNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 1;
        int c =0;
        int sum =0;
        int product = 1;
        int n = sc.nextInt();
        for (int i=0;i<n;i++){
            System.out.print(a + " ");
            c = a+b;
            sum=sum+a;
            product=product*b;
            a=b;
            b=c;
        }
        System.out.println();
        System.out.println(sum);
        System.out.println(product);
    }
}
