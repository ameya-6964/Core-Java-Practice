/*
        Day 11 coding Statement : Write a program to find Sum of N natural numbers
        Description
        Get the input from the user for the value of n and then find the sum of first n natural numbers.
        e.g.  let the n value = 5
        then first 5 natural numbers are 1,2,3,4,5 for which we need to find the sum
        Therefore sum of first 5 natural numbers is 1+2+3+4+5 = 15

        Input
        4
        Output
        10
*/


package CodingProblems;

import java.util.Scanner;

public class AdditionOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(sum(number));
    }
    static int sum(int n){
        int sum = 0;
        for(int i = 1; i<=n;i++){
            sum=sum+i;
        }
        return sum;
    }
}
