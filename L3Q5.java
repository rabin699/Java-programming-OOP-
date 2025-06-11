
//Write a program to arrange the numbers (array) in ascending order using bubble sort.
import java.util.Scanner;

public class L3Q5 {
    public static void main() {
        Scanner scn = new Scanner(System.in);
        int n;
        System.out.print("Enter the size of the array:");
        n = scn.nextInt();
        int array[] = new int[n];
        System.out.print("Enter the integers in an array:");
        for (int i = 0; i < n; i++) {
            array[i] = scn.nextInt();
        }
        scn.close();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.println("Arranging in ascending order....");
        for (int i = 0; i < n; i++) {
            System.out.print(" " + array[i]);
        }
    }
}
