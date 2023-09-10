package searchingAndSortingAlgorithms;

public class LinearSearchInRange {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,12,23,124,55,65,156};
        int startIndex =4;
        int endIndex = arr.length -1;
        int target = 23;
        int result = searchInRange(arr,startIndex,endIndex,target);
        System.out.println(result);
    }

    private static int searchInRange(int[] arr, int startIndex, int endIndex,int target) {
        if(arr.length == 0){
            return -1;
        }
        for (int i = startIndex; i <=endIndex ; i++) {
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}
