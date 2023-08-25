/*
        Day 13 Write a program to find Fibonacci series up to n

        Description
        Fibonacci series is a special series where nth term is the sum of previous two terms in the series. The series starts with 0 and 1 as the first and second term of the series respectively.
        Here you need to get the value for nth term from user and then print Fibonacci series containing n terms.

        Input
        5
        Output
        0,1,1,2,3
        Input
        8
        Output
        0,1,1,2,3,5,8,13

 */
package CodingProblems;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int a = 0;
        int b = 0;
        int c = 1;
        for(int i = 1; i<=number;i++){
           a=b;
           b=c;
           c=a+b;
            System.out.print(a + " ");
        }
    }
}
