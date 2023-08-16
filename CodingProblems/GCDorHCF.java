package CodingProblems;

import java.util.Scanner;

public class GCDorHCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1= sc.nextInt();
        int number2 = sc.nextInt();
        System.out.println("GCD of " + number1 + " and " + number2 + " Is " + GCD(number1,number2) );
    }

    public static int GCD(int a, int b) {
        if(a==0){
            return b;
        }
        if(b==0){
            return a;
        }
        if(a==b){
            return a;
        }
        if(a>b){
            return GCD(a-b,b);
        }
        return GCD(a,b-a);
    }
}
