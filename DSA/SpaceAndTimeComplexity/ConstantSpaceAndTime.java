package DSA.SpaceAndTimeComplexity;

public class ConstantSpaceAndTime {
    public static void main(String[] args) {
        //Constant Time Complexity Is O(1) -> Big O (1)
        int[] arr = new int[]{1,2,3,4,5};

        /* Q) Add 10 To First Element Of Array */
        arr[0] = arr[0] + 10; // O(1)
        System.out.println(arr[0]);// O(1)

        /* Q) Get Last Element Of Array */
        int lastNumber = arr[arr.length -1]; /* Space Complexity is O(4) Because int Takes 4 bytes */
        System.out.println(lastNumber);

        /*
         Time Complexity Of This Operation Is O(1) + O(1) = O(2)
         But 2 Is Constant Therefore We Drop The Constant And Time Complexity Is O(1)
         O(1) + O(1) = O(2) == O(1)

         Space Complexity Is O(4) == O(1) Constant Space Complexity
         */
    }
}
