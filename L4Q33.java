import java.util.Scanner;

public class L4Q33 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter two numbers:");
        int n = scn.nextInt();
        int n1 = scn.nextInt();
        L4Q3 calculator = new L4Q3(n, n1);
        calculator.sum();
        calculator.difference();
        calculator.product();
        calculator.quotient();
        scn.close();
    }
}
