package CodingProblems;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        boolean isPrime =true ;
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        for (int i = 2; i < number/2 ; i++) {
            if(number % i == 0){
                isPrime = false;
                break;
            }
        }
       if(isPrime){
           System.out.println(number +" Is Prime Number" + " Square Root Of " + number + " Is " +  SquareRoot(number));
       }
        else {
           System.out.println(number +" Is Not Prime Number");
       }
    }
    public static String SquareRoot(int n){
        String ans = String.format( "%.2f",Math.sqrt(n));
        return ans;
    }

}
