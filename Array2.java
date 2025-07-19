
//Find the maximum & minimum number in an array of integers. 
import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the number of elements you want to store:");
        int n = scn.nextInt();
        System.out.println("Enter the elements(Integers):");
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = scn.nextInt();
        }
        int Max = array[0];
        int Min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > Max) {
                Max = array[i];
            }
            if (array[i] < Min) {
                Min = array[i];
            }
        }
        System.out.println("The maximum value of array is " + Max);
        System.out.println("The minimum value of array is " + Min);
        scn.close();
    }
}
