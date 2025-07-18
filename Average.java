
//wap to enter 3 numbers and find its avg using function
import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a, b, c;
        System.out.print("Enter three numbers:");
        a = scn.nextInt();
        b = scn.nextInt();
        c = scn.nextInt();
        scn.close();
        float avg = average(a, b, c);
        System.out.println("The average of the numbers is :" + avg);
    }

    public static float average(int a, int b, int c) {
        return (a + b + c) / 3;
    }
}
