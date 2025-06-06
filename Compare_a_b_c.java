
// compariing the three values a,b,c
import java.util.Scanner;

public class Compare_a_b_c {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = scn.nextInt();
        System.out.print("Enter second number: ");
        int b = scn.nextInt();
        System.out.print("Enter third number: ");
        int c = scn.nextInt();

        if (a > b && a > c) {
            System.out.println("a is the largest: " + a);
        } else if (b > a && b > c) {
            System.out.println("b is the largest: " + b);
        } else {
            System.out.println("c is the largest: " + c);
        }

        scn.close();
    }
}
