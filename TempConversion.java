//Write a program to convert centigrade to Fahrenheit. [F = 9/5 * C + 32] 

import java.util.Scanner;

public class TempConversion {
    public static void main(String[] args) {
        float centrigrade;
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the temp in centrigrade");
        centrigrade = scn.nextFloat();
        float f = 9 / 5F * centrigrade + 32;
        System.out.println("The temperature in Fahrenheit is " + f);
        scn.close();
    }

}
