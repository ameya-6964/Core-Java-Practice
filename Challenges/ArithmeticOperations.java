package Challenges;
/* Create Program That Takes two Numbers and Shows Results Of All arithmetic
   operations (+,-,*,/,%)
*/

import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int firstNumber = sc.nextInt();
    int secondNumber = sc.nextInt();

    int resultOfAddition = addition(firstNumber,secondNumber);
    int resultOfSubtraction = subtraction(firstNumber,secondNumber);
    int resultOfDivide = divide(firstNumber,secondNumber);
    int resultOfModule = modulo(firstNumber,secondNumber);
    int resultOfMultiply = multiply(firstNumber,secondNumber);
        System.out.println("Result Of Addition Is : " + resultOfAddition);
        System.out.println("Result Of Subtraction Is : " + resultOfSubtraction);
        System.out.println("Result Of Division Is : " + resultOfDivide);
        System.out.println("Result Of Modulo Is : " + resultOfModule);
        System.out.println("Result Of Multiply Is : " + resultOfMultiply);

    }
     static int addition(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }
    static int divide(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }
    static int modulo(int firstNumber, int secondNumber) {
        return firstNumber % secondNumber;
    }
    static int multiply(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }
    static int subtraction(int firstNumber, int secondNumber) {
        if(firstNumber > secondNumber){
            return firstNumber - secondNumber;
        }
        return secondNumber - firstNumber;
    }

}
