package DSA.SpaceAndTimeComplexity;

public class LinearSpaceAndTime {
    public static void main(String[] args) {
        //Liner Time Complexity Is O(n) -> Big O(n)
        int[] arr = new int[]{1,2,3,4,5};

             /* Q) Add 10 To First Element Of Array */
              arr[0] = arr[0] + 10; // O(1)
              System.out.println(arr[0]);// O(1)

              /* Q) Print All Elements Of Array */
           for (int i=0;i< arr.length;i++) // This Statement Is Running n Times T.C -> O(n)
           {
               System.out.println(arr[i]); //  T.C -> O(1)
           }
        // Total Time Complexity Is O(1) + O(1) + O(n) == O(2+n) -> O(n)

        /*
        OverAll
         Time Complexity == O(n)
         Space Complexity == O(1)
         */
    }
}
