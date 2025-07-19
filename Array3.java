//Take an array of numbers as input and check if it is an array sorted in ascending order.
//Eg : { 1, 2, 4, 7 } is sorted in ascending order.
//     {3, 4, 6, 2} is not sorted in ascending order.

import java.util.Scanner;

public class Array3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the no of elements:");
        int n = scn.nextInt();
        scn.nextLine();
        int[] array = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < array.length; i++) {
            array[i] = scn.nextInt();
        }
        boolean isAscending = true;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                isAscending = false;
                break;
            }
        }
        if (isAscending) {
            System.out.println("The elements are in ascending order!");

        } else {
            System.out.println("The elements are not in ascending order!");
        }
        scn.close();
    }
}
