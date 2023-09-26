package CodingProblems.Recursion;

import java.util.Scanner;

public class FactorialProblem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(factorial(number));
    }

    private static int factorial(int number) {
        if(number == 0 ){
            return 1;
        }
        return number * factorial(number -1);
    }
}
