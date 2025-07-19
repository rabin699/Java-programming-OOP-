import java.util.Scanner;

public class Array4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int size = scn.nextInt();
        scn.nextLine();
        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scn.nextInt();
        }
        System.out.println("What number you want to search for:");
        int search = scn.nextInt();
        for (int i = 0; i < size; i++) {
            if (array[i] == search) {
                System.out.println("The index of the array is:" + i);
            }
        }
        scn.close();
    }
}
