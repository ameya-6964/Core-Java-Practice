package Methods;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number");
        float number1 = sc.nextFloat();
        System.out.println("Enter Second Number");
        float number2 = sc.nextFloat();
        System.out.println("Enter The Operation + - * or /");
        char symbol = sc.next().charAt(0);

        // Old Switch Statement
//        switch (symbol){
//            case '+' :
//                System.out.println(number1 + number2);
//                break;
//
//            case '-':
//                System.out.println(number1 - number2);
//                break;
//                case '*':
//                System.out.println(number1 * number2);
//                break;
//
//            case '/':
//                System.out.println(number1 / number2);
//                break;
//
//            default:
//                System.out.println("Invalid Operation");
//                break;
//
//        }

        //New Switch Statement
        switch (symbol) {
            case '+' -> System.out.println(number1 + number2);
            case '-' -> System.out.println(number1 - number2);
            case '*' -> System.out.println(number1 * number2);
            case '/' -> System.out.println(number1 / number2);
            default -> System.out.println("Invalid Operation");
        }

        sc.close();
    }
}
