package CodingProblems;
import java.util.Scanner;
public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println("The Area Is " +  String.format( "%.2f",Area(number)));

    }
    public static double Area(int n){
        double pie = Math.PI;
        float radius = (float)n / 2;
        double area = pie * radius * radius;
        return area;
    }
}
