package Basics;

//This Code Takes Input From User With Help Of Scanner Class and Prints The Same Numnber//

import java.util.*;

public class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Number");
        int user = input.nextInt();
        System.out.println("Number is " + user);
    }
}