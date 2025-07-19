//Write a program to create a variable 
//length argument method to add ‘n’ numbers.

import java.util.Scanner;

public class L4Q4 {
    public static int addNumbers(int... nums) {
        int sum = 0;
        for (int n : nums) {
            sum += n;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Tell me the nth terms :");
        int n = scn.nextInt();
        int[] array = new int[n];
        int odd = 1;
        for (int i = 0; i < n; i++) {
            array[i] = odd;
            odd += 2;
        }
        int result = addNumbers(array); // Example usage
        System.out.println("Sum is: " + result);
        scn.close();
    }
}
