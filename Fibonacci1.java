import java.util.Scanner;

public class Fibonacci1 {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter number of terms in Fibonacci Series:");
        int n = scn.nextInt();
        for (int i = 0; i <= n; i++) {
            System.out.print(Fibonacci(i) + " ");
        }
        scn.close();
    }

    public static int Fibonacci(int n) {
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else
            return Fibonacci(n - 1) + Fibonacci(n - 2);
    }
}
