/*
Day 4 coding Statement: Write a program to identify of that a number is positive or negative

        Description


        Get an input number from the user and check whether it is a positive or negative number.

        Input : -10
        Output : Negative number

        Input :0
        Output : Neither positive nor negative

        Input :15
        Output : Positive number
        */

package CodingProblems;

import java.util.Scanner;

public class NegativePositive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number > 0)
        {
            System.out.println("Positive number");
        } else if (number < 0) {
            System.out.println("Negative number");
        }
        else {
            System.out.println("Neither positive nor negative");
        }

    }
}
