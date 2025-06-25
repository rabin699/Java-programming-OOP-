import java.util.*;

public class Number1 {
    public static void main() {
        int num;
        Scanner scn = new Scanner(System.in);
        System.out.print("Welcome to the program\n");
        System.out.print("Enter a number:");
        num = scn.nextInt();
        scn.close();
        Number checknum = new Number(num);
        if (checknum.isPrime() == true)
            System.out.println(num + " is prime");
        else
            System.out.println(num + " is not prime");
        if (checknum.isEven() == true)
            System.out.println(num + " is even");
        else
            System.out.println(num + " is not even");
        if (checknum.isFibo() == true)
            System.out.print(num + " is Fibonacci number!");
        else
            System.out.print(num + " is not a Fibonacci number!");
    }
}
