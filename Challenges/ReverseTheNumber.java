package Challenges;

import java.util.Scanner;

public class ReverseTheNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int reversed = 0;
        for(; number > 0; number/=10){
            int lastDigit = number % 10;
            reversed = reversed * 10 + lastDigit;
        }
        System.out.println(reversed);
    }
}
