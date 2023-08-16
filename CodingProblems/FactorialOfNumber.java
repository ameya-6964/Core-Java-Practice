package CodingProblems;

import java.util.Scanner;
public class FactorialOfNumber {
    public static int factorial(int n){
        if (n==0){
            return 1;
        }
        return  n * factorial(n -1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int number = sc.nextInt();
        System.out.println("Factorial Is : " + factorial(number));
    }
}


/* Using For Loop */

//public class FactorialOfNumber {
//    public static int factorial(int n){
//        int res = 1;
//        for(int i=1;i<=n;i++){
//            res*=i;
//        }
//        return res;
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a Number");
//        int number = sc.nextInt();
//        System.out.println("Factorial Is : " + factorial(number));
//    }
//}

/* Using While loop */

//public class FactorialOfNumber {
//    public static int factorial(int n){
//        int res = 1;
//        int i = 1;
//        while(i<=n){
//            res*=i;
//            i++;
//        }
//        return res;
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a Number");
//        int number = sc.nextInt();
//        System.out.println("Factorial Is : " + factorial(number));
//    }
//}

/* Using Do While loop */

//public class FactorialOfNumber {
//    public static int factorial(int n) {
//        int res = 1;
//        int i = 1;
//        do{
//            res*=i;
//            i++;
//
//        }while(i<=n);
//        return res;
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a Number");
//        int number = sc.nextInt();
//        System.out.println("Factorial Is : " + factorial(number));
//    }
//}


