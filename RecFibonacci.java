
//Write a program to generate Fibonacci numbers up to ‘nth’ term using recursive method
import java.util.Scanner;

public class RecFibonacci {
    public static void main(String args[]) {
        int num;
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the no. of terms:");
        num = scn.nextInt();
        scn.close();
        for (int i = 0; i < num; i++) {
            System.out.print(" " + fibonacci(i));
        }
    }

    public static int fibonacci(int num) {
        if (num == 0)
            return 0;
        else if (num == 1)
            return 1;
        else
            return fibonacci(num - 1) + fibonacci(num - 2);
    }
}
