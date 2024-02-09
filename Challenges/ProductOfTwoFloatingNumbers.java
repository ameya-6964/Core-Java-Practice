package Challenges;

import java.util.Scanner;

public class ProductOfTwoFloatingNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float firstNumber = sc.nextFloat();
        float secondNumber = sc.nextFloat();
        float result = productOfTwoNumbers(firstNumber,secondNumber);
        System.out.println(result);
    }

    static float productOfTwoNumbers(float firstNumber, float secondNumber) {
        return firstNumber * secondNumber;
    }
}
