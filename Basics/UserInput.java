    /* Take user Input And Print User Name and LastName */

    package Basics;

    import java.util.Scanner;

    public class UserInput {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Your FirstName");
            String name = sc.next(); // Eg :- Ameya Belvalkar => Will Only Take Ameya
            // Consume the newline character left in the buffer
            sc.nextLine();
            System.out.println("Enter Your Full Name");
            String fullName = sc.nextLine(); // Eg :- Ameya Belvalkar => Will Take Ameya Belvakar
            System.out.println("Enter Your Age");
            int age = sc.nextInt();
            String fullDetails = "Your Name Is : "+name + " and Your Full Name Is " + fullName +" .  Your Age Is "+age;
            System.out.println(fullDetails);
        }
    }
