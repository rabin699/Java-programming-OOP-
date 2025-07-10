import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        int a, b;
        System.out.print("Enter two numbers ");
        Scanner scn = new Scanner(System.in);
        a = scn.nextInt();
        b = scn.nextInt();
        scn.close();
        System.out.printf("The lcm of %d and %d is %d", a, b, giveLcm(a, b));

    }

    public static int giveLcm(int a, int b) {
        int lcm = 0;
        if (a > b) {
            a = a + b;
            b = a - b;
            a = a - b;
        }
        for (int i = a; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                lcm = i;
            }
        }
        return lcm;
    }
}
