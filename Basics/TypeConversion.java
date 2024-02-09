package Basics;

public class TypeConversion {
    public static void main(String[] args) {
        byte firstNumber = 126;
        int secondNumber = firstNumber; //Implicit Typecasting => byte To int

        int thirdNumber = 1223121321;
        short fourthNumber = (short) thirdNumber ; // Explicit TypeCasting => int to short
        System.out.println(fourthNumber); // 22953 Loss Of Memory
    }
}
