/*

Day 1 coding Statement: Write a program to identify if the character is a vowel or consonant.

        Description of the program:
        Take an input character from the user and check whether the given input is a vowel or consonant.

        Input
        A

        Output
        Vowel

        Input
        m

        Output
        Consonant

        Input
        3

        Output
        Invalid Input
*/

package CodingProblems;
import java.util.Scanner;

public class VowelsAndConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = sc.nextLine().charAt(0);
        if(c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'|| c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
            System.out.println("Vowel");
        } else if (c >= 'a' && c<='z' || c >= 'A' && c<='Z' ) {
            System.out.println("Consonant");
        }
        else {
            System.out.println("Invalid Input");
        }
    }
}
