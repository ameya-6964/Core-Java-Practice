package Challenges;
/*
Solve Following Patterns
1)

*
* *
* * *
* * * *
* * * * *

2)
* * * * *
* * * *
* * *
* *
*
 */
public class Challenge1 {
    static void printRegularStar(int number){
        for (int i = 0;i<number;i++){
            for (int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void printReverseStar(int number) {
        for (int i = number;i>0;i--){
            for (int j=0;j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printRegularStar(5);
        printReverseStar(5);
    }
}
