
//Write a program to store ‘n’ numbers in a one-dimensional array and calculate its mean and mode.
import java.util.Scanner;

public class L3Q1 {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter size of data: ");
        int n = scn.nextInt();
        int array[] = new int[n];
        System.out.print("Enter the data: ");
        for (int i = 0; i < n; i++) {
            array[i] = scn.nextInt();
        }
        scn.close();

        float mean = calculateMean(array);
        int mode = calculateMode(array);

        System.out.printf("The mean of the data is : %.2f\n", mean);
        System.out.println("The mode of the data is : " + mode);
    }

    public static float calculateMean(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return (float) sum / array.length;
    }

    public static int calculateMode(int[] array) {
        int maxCount = 0, mode = array[0];
        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                mode = array[i];
            }
        }
        return mode;
    }
}
