package OOPS;

public class WrapperExample {
    public static void main(String[] args) {
        Integer a = 10;
        Integer b = 35;
        System.out.println("Before Swapping");
        System.out.println("Value Of a "+a + " " + " Value Of b " + b);
        swap(a,b);
        System.out.println("After Swapping");
        System.out.println("Value Of a "+a + " " + " Value Of b " + b);

    }
    static void swap(Integer a,Integer b){
        System.out.println("Value Of a Before Swapping In Function "+a + " " + " Value Of b Before Swapping In Function " + b);
        Integer temp = a;
        a=b;
        b=temp;
        System.out.println("Value Of a After Swapping In Function " + a + " Value Of b After Swapping In Function " + b );
    }
}
