import java.util.Scanner;

public class RecFactorial {
    public static void main(String args[]) {
        int num;
        Scanner scn = new Scanner(System.in);
        System.out.printf("Enter a number:");
        num = scn.nextInt();
        scn.close();
        System.out.printf("The factorial of %d is %d ", num, factorial(num));
    }

    public static int factorial(int a) {
        if (a != 0)
            return a * factorial(a - 1);
        else
            return 1;
    }
}
