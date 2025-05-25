//Write a program that reads the marks in each subject and calculates the percentage. 

import java.util.Scanner;

public class MarksCal {
    public static void main(String[] args) {
        float sum = 0;
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter how many subjects are there:");
        int n = scn.nextInt();
        float array[] = new float[n];
        System.out.println("Enter the marks of all subjects");
        for (int i = 0; i < n; i++) {
            array[i] = scn.nextFloat();
            sum += array[i];
        }
        float percen = (float) sum / n;
        System.out.println("The percentage of the marks is " + percen);
        scn.close();
    }
}