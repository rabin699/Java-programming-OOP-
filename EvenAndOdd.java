//Write a program that reads a number and identifies whether the given number is even or odd. 

import java.util.Scanner;

public class EvenAndOdd {
    public static void main(String args[]) {
        int num;
        System.out.print("Enter a number:");
        Scanner scn = new Scanner(System.in);
        num = scn.nextInt();
        if (num >= 1) {
            if (num % 2 == 0) {
                System.out.println("The number is even");
            } else {
                System.out.println("The number is odd");
            }
        } else {
            System.out.println("Neither odd nor even");
        }
        scn.close();
    }
}
