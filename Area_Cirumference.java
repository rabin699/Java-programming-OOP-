//Write a program that calculates the area of a circle and circumference. 

import java.util.Scanner;

public class Area_Cirumference {
    public static void main(String[] args) {
        float radi;
        final float PI = 3.14F;
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter radious of a circle");
        radi = scn.nextFloat();
        float area = PI * radi * radi;
        float circum = 2 * PI * radi;
        System.out.println("The circumference of circle is " + circum);
        System.out.println("The area of the circle is " + area);
        scn.close();
    }
}
