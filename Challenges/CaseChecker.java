package Challenges;

import java.util.Scanner;

public class CaseChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Character To Be Checked");
        char ch = sc.next().trim().charAt(0);
        if(ch >='A' && ch <='Z'){
            System.out.println("UPPERCASE");
        }else if(ch >='a' && ch <='z'){
            System.out.println("LOWERCASE");
        }else{
            System.out.println("INVALID CHARACTER ENTERED");
        }
    }
}
