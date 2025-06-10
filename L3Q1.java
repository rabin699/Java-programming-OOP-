
//Write a program to store ‘n’ numbers in a one-dimensional array and calculate its mean and mode.
import java.util.Scanner;

public class L3Q1 {
    public static void main(String args[]) {
        int n, i, sum = 0;
        float mean;
        System.out.print("Enter size of data:");
        Scanner scn = new Scanner(System.in);
        n = scn.nextInt();
        int array[] = new int[n];
        System.out.print("Enter the data:");
        for (i = 0; i < n; i++) {
            array[i] = scn.nextInt();
            sum += array[i];
        }
        scn.close();
        mean = sum / n;
        System.out.printf("The mean of the data is :%.2f", mean);
        int maxCount = 0;
        int mode = 0;
        for (i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (array[i] == array[j]) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                mode = array[i];
            }
        }
        System.out.println("\nThe mode of the data is :" + mode);

    }
}
