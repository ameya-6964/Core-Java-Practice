package Challenges;

import java.util.Scanner;

public class SimilarNumberChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int numberToFind=sc.nextInt();
        int count = 0;
        for (; number > 0; number/=10) {
            int lastDigit = number % 10;
            if(lastDigit == numberToFind){
                count++;
            }
        }
        System.out.println(count);

    }
}
