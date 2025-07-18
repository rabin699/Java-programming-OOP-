import java.util.*;

public class Gcd1 {
    public static void main(String args[]) {
        int a, b;
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter two numbers:");
        a = scn.nextInt();
        b = scn.nextInt();
        int gcd = findGcd(a, b);
        System.out.print("The gcd of two numbers " + a + " , " + b + " is " + gcd);
        scn.close();
    }

    public static int findGcd(int a, int b) {
        int gcd = 0;
        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0)
                gcd = i;
        }
        return gcd;
    }
}
