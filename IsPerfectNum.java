
//Write a program to identify whether the given number
// is a perfect number or not. [28 is a perfect number as 28=1+2+4+7+14].
import java.util.Scanner;

public class IsPerfectNum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num, sum = 0;
        System.out.println("Enter a number");
        num = scn.nextInt();
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        if (sum == num) {
            System.out.println("It is a Perfect number!");
        } else {
            System.out.println("It is not a Perfect number!");
        }
        scn.close();
    }
}
