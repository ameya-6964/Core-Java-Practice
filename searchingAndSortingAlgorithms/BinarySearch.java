/*
        You are given an integer array 'A' of size 'N', sorted in non-decreasing order. You are also given an integer 'target'.
        Your task is to write a function to search for 'target' in the array 'A'. If it exists, return its index in 0-based indexing. Otherwise, return -1.
        Note: You must write an algorithm whose time complexity is O(logN).

        Example:
        Input: ‘N’ = 7 ‘target’ = 3
        ‘A’ = [1, 3, 7, 9, 11, 12, 45]

        Output: 1
        Explanation: For A = [1, 3, 7, 9, 11, 12, 45],
        The index of element '3' is 1.
        Hence, the answer is '1'.
*/


package searchingAndSortingAlgorithms;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr1 ={10,20,30,40,50,60,70,80,85,98,102,130,150};
        int target = 10;
        int result = binarySearch(arr1,target);
        System.out.println(result);

    }

    private static int binarySearch(int[] arr, int target) {
         int start = 0;
         int end = arr.length-1;
         while(start <= end){
             //int mid = start + end /2; // Only Use When Array Is Small
             int mid = start = (end - start) /2;
              if(arr[mid] < target ){
                  start = mid +1;
              } else if (arr[mid] > target){
                  end = mid -1;
              }
              else{
                  return mid;
              }
         }

        return -1;
    }
}
