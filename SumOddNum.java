import java.util.*;

public class SumOddNum {
    public static void main(String[] args) {
        int num, sum = 0;
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a number:");
        num = scn.nextInt();
        scn.close();
        sum = sumOdds(num);
        System.out.print("The sum of odd numbers up to " + num + " is " + sum);
    }

    public static int sumOdds(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        return sum;
    }
}
