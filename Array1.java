//Take an array of names as input from the user and print them on the screen.

import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the no of name you want to store:");
        int n = scn.nextInt();
        scn.nextLine();
        String[] array = new String[n];
        System.out.print("Enter the names: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = scn.nextLine();
        }
        System.out.println("The names are given below:");
        for (int i = 0; i < array.length; i++) {

            System.out.print(array[i] + " ");
        }
        scn.close();

    }
}
