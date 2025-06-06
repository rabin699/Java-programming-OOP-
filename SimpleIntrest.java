
//Write a program to take principle, time and rate from the user and display the interest.
import java.util.Scanner;

public class SimpleIntrest {
    public static void main(String[] args) {
        float principle, rate;
        int time;
        System.out.printf("Enter the principle:");
        Scanner scn = new Scanner(System.in);
        principle = scn.nextFloat();
        System.out.print("Enter the time:");
        time = scn.nextInt();
        System.out.print("Enter the rate:");
        rate = scn.nextFloat();
        float interest = principle * time * rate * 0.01F;
        System.out.printf("The interest is %.2f", interest);
        scn.close();
    }
}
