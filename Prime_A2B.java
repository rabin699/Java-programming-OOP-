
//Write a program to read two numbers and print all the prime numbers between them.
import java.util.Scanner;

public class Prime_A2B {
    public static void main(String[] args) {
        int a, b, i, j;
        boolean isPrime;
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter two numbers:");
        a = scn.nextInt();
        b = scn.nextInt();
        scn.close();
        if (a > b) {
            a = a * b;
            b = a / b;
            a = a / b;
        }
        for (i = a; i <= b; i++) {
            if (i < 2)
                continue;
            isPrime = true; // reset for each i
            for (j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
    }
}