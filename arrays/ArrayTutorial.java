package arrays;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayTutorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Array Of Primitives
        int [] number = new int[4];

        // Taking Input Through For Loop
        for (int i = 0; i < number.length; i++) {
            number[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(number));

        // Array Of Objects
        String [] str = new String[5];
        for (int i = 0; i < str.length; i++) {
            str[i] = sc.next();
        }
        System.out.println(Arrays.toString(str));
    }
}
