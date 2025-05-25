//Write a program to read the percentage and prints the 
//equivalent grade using only switch statement. 
//[Assume your own grading system.] 

import java.util.Scanner;

public class GradeCalcu {
    public static void main(String args[]) {
        float percen;
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your percentage");
        percen = scn.nextFloat();
        switch ((int) percen / 10) {
            case 0:
            case 1:
            case 2:
            case 3:
                System.out.println("Grade D(fail)");
                break;
            case 4:
                System.out.println("Grade C");
                break;
            case 5:
                System.out.println("Grade C+");
                break;
            case 6:
                System.out.println("Grade B");
                break;
            case 7:
                System.out.println("Grade B+");
                break;
            case 8:
                System.out.println("Grade A");
                break;
            case 9:
                System.out.println("Grade A+");
                break;
            default:
                System.out.println("Incorrect value");
        }
        scn.close();
    }
}
