/*
        Day 7 coding Statement:  Write a program to find Number of days in a given month of a given year

        Description

        Get the number of month and year as input from the user and check the number of days present in that month.

        Input

        Enter month : 2

        Enter year : 2000

        Output

        29
 */

package CodingProblems;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int month = sc.nextInt();
        int year = sc.nextInt();
        if(((month==2) && (year%400==0)) || ((year%100!=0)&&(year%4==0)))
        {
            System.out.println("29");
        }
        else if(month==2){
            System.out.println("28");
        }
        else if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 ||
                month==12)
        {
            System.out.println("31");
        }
        else
        {
            System.out.println("Number of days is 30");
        }
    }
}