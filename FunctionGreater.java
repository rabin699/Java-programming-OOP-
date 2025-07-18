import java.util.Scanner;

public class FunctionGreater {
    public static void main(String... args) {
        Scanner scn = new Scanner(System.in);
        int a, b;
        System.out.print("Enter two numbers to compare:");
        a = scn.nextInt();
        b = scn.nextInt();
        scn.close();
        int greater = compare(a, b);
        System.out.println("The greater among two is " + greater);
    }

    public static int compare(int a, int b) {
        if (a > b)
            return a;
        else
            return b;
    }
}
