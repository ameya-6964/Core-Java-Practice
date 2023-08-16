
package Basics;

import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Your Name");
        String str = s.next();
        char ch = str.charAt(0);
        System.out.println("Enter Marks 1");
        int m1 = s.nextInt();
        System.out.println("Enter Marks 2");
        int m2 = s.nextInt();
        System.out.println("Enter Marks 3");
        int m3 = s.nextInt();
        double avg = (m1 + m2 + m3) / 3;
        System.out.println("Name is: " + ch);
        System.out.print("Average Is:  " + avg);
    }
}
