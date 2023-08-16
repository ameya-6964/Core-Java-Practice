/*
Day 5 coding Statement:  Write a program to identify if the number is even or odd

        Description

        Get a number as input from the user and check whether the given number is odd or even

        Input

        10

        Output

        Even

        Input

        5

        Output

        Odd
*/

package CodingProblems;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(number % 2 == 0){
            System.out.println("Even Number");
        }
        else{
            System.out.println("Odd Number");
        }
    }
}
