//! Take Input From User As Firstname and Lastname and Concat It And Display The Output
package Basics;

import java.util.Scanner;

public class PrintName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstName = sc.nextLine();
        String lastName = sc.nextLine();
        String fullName = firstName + " " +  lastName;
        System.out.println(fullName);
    }
}
