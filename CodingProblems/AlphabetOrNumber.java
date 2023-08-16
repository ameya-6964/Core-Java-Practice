/*
Day 2 coding Statement: Write a program to identify if the character is an alphabet or not.
        Description: Take an input character from user and check whether it is an alphabet or not.

       Input : A

        Output:  Alphabet

        Input: 7

        Output: Not an alphabet */

package CodingProblems;

import java.util.Scanner;

public class AlphabetOrNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.nextLine().charAt(0);
        if (ch>='A' && ch<='Z' || ch>='a' && ch<='b'){
            System.out.println("Alphabet");
        }
        else {
            System.out.println("Not An Alphabet");
        }
    }
}
