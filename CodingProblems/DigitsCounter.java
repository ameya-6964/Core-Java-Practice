/*
 Day 8 coding Statement: Write a program to find Number of digits in an integer

        Description
        Take an integer as the input from the user and then calculate the number of digits in the given input and print it as the output.

        Input
        3241
        Output
        4
        Input
        6
        Output
        1
*/
package CodingProblems;

import java.util.Scanner;

public class DigitsCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println((digitsCounter(number)));
    }
    static int digitsCounter(int n){
        int counter = 0;
        while(n!=0){
            n = n / 10;
            counter++;
        }
        return counter;
    }
}
