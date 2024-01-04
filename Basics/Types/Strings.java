package Basics.Types;

public class Strings {
    public static void main(String[] args) {
        String message = "Hello World " + "!!";
        System.out.println(message.length()); //14
        System.out.println(message.indexOf("H")); //0
        System.out.println(message.startsWith("H")); // true
        System.out.println(message.endsWith("H")); // false
        System.out.println(message.replace("!!","**")); // Hello World ** (Does Not MODIFY Original String Are Immutable)
        System.out.println(message.trim()); // Hello World !! (REMOVES White Spaces From Beginning and End)

        //! Escape Sequences
        String greet = "Hello \"Ameya\"";
        System.out.println(greet); //Hello "Ameya"

        String path = "c:\\windows\\drive\\desktop";
        System.out.println(path); // c:\windows\drive\desktop

    }
}
