//! Take Two Numbers From User and Provide Sum Of Those Numbers
package Basics;
import java.util.Scanner;

public class InputNumbersFromUser {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number");
        int a = sc.nextInt();
        System.out.println("Enter Second Number");
        int b = sc.nextInt();
        int result = a + b;
        System.out.println("Addition Of Two Numbers is " + result);
    }

}
