import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n;
        System.out.println("Enter the size of the array:");
        n = scn.nextInt();
        int array[] = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scn.nextInt();
        }
        scn.close();

        for (int i = 0; i < n; i++) {
            int smallest = array[i];
            for (int j = i + 1; j < n; j++) {
                if (array[j] < smallest) {
                    smallest = array[j];
                    int temp = array[i];
                    array[i] = smallest;
                    array[j] = temp;
                }
            }
        }
        System.out.println("Elements in ascending order is:");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
