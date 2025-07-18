import java.util.Scanner;

public class Power {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a number:");
        int a = scn.nextInt();
        System.out.print("Enter the power to be raised:");
        int b = scn.nextInt();
        int pow = power(a, b);
        System.out.println("The power of " + a + " raised to " + b + " is " + pow);
        scn.close();
    }

    public static int power(int a, int b) {
        int pow = 1;
        for (int i = 0; i < b; i++) {
            pow *= a;
        }
        return pow;
    }
}
