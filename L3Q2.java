
//Write a program to convert a user given binary number to decimal. 
import java.util.Scanner;

public class L3Q2 {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        int binary = scn.nextInt();
        scn.close();

        int decimal = binaryToDecimal(binary);
        System.out.printf("The decimal is %d", decimal);
    }

    public static int binaryToDecimal(int binary) {
        int decimal = 0;
        int i = 0;
        while (binary != 0) {
            int digit = binary % 10;
            decimal += digit * Math.pow(2, i);
            binary /= 10;
            i++;
        }
        return decimal;
    }
}
