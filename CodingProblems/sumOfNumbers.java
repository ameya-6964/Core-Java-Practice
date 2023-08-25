/*
        Day 10 coding Statement: Write a program to find Sum of digits of a number
        Description
        Get a number from user and then find the sum of the digits in the given number.
        E.g.  let the number = 341
        Sum of digits is 3+4+1= 8

        Input
        4521
        Output
        12
*/


package CodingProblems;
import java.util.Scanner;
public class sumOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(digitAddition(number));
    }
    static int digitAddition(int n){
        int sum = 0;
        while(n!=0){
            int lastNumber = n % 10;
            sum += lastNumber;
            n /= 10;
        }
        return sum;
    }
}