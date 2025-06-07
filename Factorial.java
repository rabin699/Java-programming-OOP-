import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.printf("Enter a number:");
        int fact = 1, num;
        num = scn.nextInt();
        scn.close();
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        System.out.printf("The factorial of %d! is %d", num, fact);
    }
}
