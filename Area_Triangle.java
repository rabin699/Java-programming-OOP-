
//Write a program that calculates the area of a triangle. 
import java.util.Scanner;

public class Area_Triangle {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        float a, b, c;
        System.out.println("Enter there numbers a,b,c");
        a = scn.nextFloat();
        b = scn.nextFloat();
        c = scn.nextFloat();
        float s = a + b + c / 2F;
        float area = (float) Math.sqrt(s);
        System.out.println("The area of triangle is " + area);
        scn.close();
    }
}