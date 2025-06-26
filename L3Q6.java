//Write a program which asks the user to input ‘n’ words. 
//Now Display the words in dictionary order.

import java.util.Scanner;

public class L3Q6 {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = scn.nextInt();
        scn.nextLine(); // consume leftover newline
        String array[] = new String[n];
        System.out.println("Enter the strings/words in an array:");
        for (int i = 0; i < n; i++) {
            array[i] = scn.nextLine();
        }
        scn.close();

        bubbleSortStrings(array);

        System.out.println("Arranging in dictionary order....");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void bubbleSortStrings(String[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j].compareTo(array[j + 1]) > 0) {
                    String temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
