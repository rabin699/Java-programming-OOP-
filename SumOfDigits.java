import java.util.*;

public class SumOfDigits {
    public static void main(String args[]) {
        int num;
        System.out.print("Enter a number:");
        Scanner scn = new Scanner(System.in);
        num = scn.nextInt();
        scn.close();
        System.out.print("The sum of digits of " + num + " is " + sum(num));

    }

    public static int sum(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
