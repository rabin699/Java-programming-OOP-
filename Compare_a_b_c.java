
//compariing the three values a,b,c
import java.util.Scanner;

public class Compare_a_b_c {
    public static void main() {
        Scanner scn = new Scanner(System.in);
        int a, b, c;
        System.out.println("Enter three numbers:");
        a = scn.nextInt();
        b = scn.nextInt();
        c = scn.nextInt();
        if (a > b && a > c)
            System.out.println(a + " is greater");
        else if (b > c)
            System.out.println(b + " is greater");
        else
            System.out.println(c + " is greater");
        scn.close();
    }
}