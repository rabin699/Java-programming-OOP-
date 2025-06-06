
//Write a program to read number and identify whether the given number is a prime number or not.
import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        System.out.print("Enter a number:");
        Scanner scn = new Scanner(System.in);
        int num, i;
        num = scn.nextInt();
        scn.close();
        for (i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                System.out.println("It is composite");
                return;
            }
        }
        System.out.println("It is prime");
    }
}
