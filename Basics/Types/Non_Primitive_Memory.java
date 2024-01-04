package Basics.Types;

public class Non_Primitive_Memory {
    public static void main(String[] args) {
        int []arr1 = {1,2,3,4,5,6,7};
        int []arr2 = arr1;

        arr2[0] = 26; // This Will Also Change arr1 0th index


        for (int a = 0; a < arr1.length; a++){
            System.out.println(arr1[a]);
        }
        for (int a = 0; a < arr2.length; a++){
            System.out.println(arr2[a]);
        }
    }
}
