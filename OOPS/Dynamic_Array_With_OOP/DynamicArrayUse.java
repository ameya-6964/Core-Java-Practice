package OOPS.Dynamic_Array_With_OOP;

public class DynamicArrayUse {
    public static void main(String[] args) {
        DynamicArray d =new DynamicArray();
        for (int i = 0; i < 100 ; i++) {
            d.add(10+i);
        }
        System.out.println(d.size());
        System.out.println(d.get(5));
        System.out.println(d.get(0));
        d.set(3,76);
        System.out.println(d.get(3));
        System.out.println(d.get(99));
        System.out.println(d.removeLast());
        System.out.println(d.size());

    }
}
