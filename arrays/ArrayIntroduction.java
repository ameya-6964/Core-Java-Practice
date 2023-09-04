package arrays;

public class ArrayIntroduction {
    public static void main(String[] args) {
      // Syntax 1 :- Writing Arrays
        int arr[] = new int[10];
        arr[0]= 5;
        arr[1]= 10;
        arr[2]= 15;
        arr[3]= 25;
        arr[4]= 45;
        arr[5]= 55;
        arr[6]= 65;
        arr[7]= 57;
        arr[8]= 85;
        arr[9]= 59;

       for(int i = 0; i< arr.length ; i++){
           System.out.println(arr[i]);
       }

       // Syntax 2 :- Writing Arrays
       int arr1 [] = new int[]{1,2,3,4,5};

        for(int i = 0; i< arr1.length ; i++){
            System.out.println(arr1[i]);
        }

    }
}
