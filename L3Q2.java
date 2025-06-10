
//Write a program to convert a user given binary number to decimal. 
import java.util.Scanner;

public class L3Q2 {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int binary;
        System.out.print("Enter a binary number:");
        binary = scn.nextInt();
        scn.close();
        int decimal = 0;
        for (int i = 0; binary != 0; i++) {
            if (binary % 10 != 0)
                decimal += (int) Math.pow(2, i);
            binary /= 10;
        }
        System.out.printf("The decimal is %d", decimal);
    }
}
