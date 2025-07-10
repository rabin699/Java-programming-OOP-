import java.util.Scanner;

public class Factoial1 {
    public static void main(String args[]) {
        int num;
        System.out.printf("Enter a number:");
        Scanner scn = new Scanner(System.in);
        num = scn.nextInt();
        scn.close();
        System.out.print("The factorial of " + num + " is :" + fact(num));
    }

    public static int fact(int num) {
        int facto = 1;
        for (int i = 1; i <= num; i++) {
            facto *= i;
        }
        return facto;
    }
}
