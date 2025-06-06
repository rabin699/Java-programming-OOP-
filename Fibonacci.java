import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int num, first = 0, second = 1, third, i = 1;
        Scanner scn = new Scanner(System.in);
        System.out.printf("How many terms??");
        num = scn.nextInt();
        do {
            System.out.print(" " + first);
            third = first + second;
            first = second;
            second = third;
            i++;
        } while (i != num);
        scn.close();
    }
}
