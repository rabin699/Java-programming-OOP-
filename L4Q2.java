//Write a program in java to input name of student and marks obtained in 5 subjects. 
//Calculate total, percentage and result. Here the Student is class with properties name and marks. 
//Create methods to find total, percentage, result and display (to display the information).

import java.util.Scanner;

public class L4Q2 {
    private String name;
    private int[] marks = new int[5];

    public void inputData() {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Name:");
        name = scn.nextLine();
        System.out.print("Enter the marks of five subjects:");
        for (int i = 0; i <= 5; i++) {
            marks[i] = scn.nextInt();
        }
        scn.close();
    }

    public int total() {
        int sum = 0;
        for (int m : marks)
            sum += m;
        return sum;
    }

    public double percentage() {
        return total() / 5.0;
    }

    public String result() {
        for (int m : marks) {
            if (m < 40)
                return "Fail";
        }
        return "pass";
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.print("Marks: ");
        for (int m : marks)
            System.out.print(m + " ");
        System.out.println("\nTotal: " + total());
        System.out.println("Percentage: " + percentage());
        System.out.println("Result: " + result());
    }
}
