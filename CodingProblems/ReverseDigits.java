/*
Day 12 Coding Statement : Write a program to reverse a given number
        Description
        Get an input from the user and the print the reverse of the given number as the output
        E.g.  let the number be 324 then the reverse of the number is 423
        Input
        675
        Output
        576
*/

package CodingProblems;

import java.util.Scanner;

public class ReverseDigits {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
        System.out.println(reverseNumber(number));
    }
    static int reverseNumber(int n){
        int reverse = 0;
        int updateNumber = n;
        while(updateNumber!= 0){
           int lastNumber = updateNumber % 10;
           reverse = reverse * 10 + lastNumber;
            updateNumber = updateNumber /10;
        }

        return reverse;
    }
}
