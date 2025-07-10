import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String args[]) {
        int num;
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number please:");
        num = scn.nextInt();
        scn.close();
        tablePrint(num);
    }

    public static void tablePrint(int num) {
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d X %d = %d\n", num, i, num * i);
        }
    }
}
