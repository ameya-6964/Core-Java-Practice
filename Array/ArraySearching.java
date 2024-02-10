package Array;

public class ArraySearching {
    public static void main(String[] args) {
        int arr[] = {1,2,14,5,6,3,25};

        boolean result = isFound(arr,5);
        if(result){
            System.out.println("Your Element Is Present In This Array");
        }else {
            System.out.println("Your Element Is Not Present In This Array");
        }
    }
    public static boolean isFound(int[] arr,int num){

        int length = arr.length;
        for (int i=0;i<length;i++){
            if(arr[i] == num){
                return true;
            }
        }
        return false;
    }
}
