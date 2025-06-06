
//Write a program to evaluate GCD of two given integers. Use function that returns GCD.
import java.util.Scanner;

public class Gcd {
    public static void main(String[] args) {
        int num1, num2;
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter first number: ");
        num1 = scn.nextInt();
        System.out.print("Enter second number: ");
        num2 = scn.nextInt();
        scn.close();
        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd(num1, num2));

    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}