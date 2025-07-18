import java.util.Scanner;

public class SumOddNum1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n;
        System.out.print("Enter the nth term:");
        n = scn.nextInt();
        scn.close();
        int sum = sumOdd(n);
        System.out.println("The sum of odd numbers up to " + n + " is " + sum + " .");

    }

    public static int sumOdd(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        return sum;
    }
}
