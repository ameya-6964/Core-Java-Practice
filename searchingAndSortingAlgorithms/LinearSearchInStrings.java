package searchingAndSortingAlgorithms;

public class LinearSearchInStrings {
    public static void main(String[] args) {
        String name = "Ameya";
        char target = 'y';
        boolean result = linearSearch(name,target);
        if(true){
            System.out.println("Character Exist");
        }
        else{
            System.out.println("Character Does Not Exist");
        }
    }
    static boolean linearSearch(String str , char target){
        if(str.length() == 0){
            return false;
        }
        for (int i = 0; i<str.length();i++){
            if(target == str.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
