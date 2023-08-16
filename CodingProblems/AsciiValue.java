/*

Day 2 coding Statement: Write a program to find ASCII values of a character

        Description: Get an input character from the user and give the ASCII value of the given input as the output.

        Input: b

        Output: 98

        Input: B

        Output: 66

        */

package CodingProblems;

import java.util.Scanner;

public class AsciiValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.nextLine().charAt(0);
        int Ascii = ch;
        System.out.println(Ascii);
    }
}
