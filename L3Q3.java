//Write a program to evaluate transpose of n-by-n matrix

import java.util.Scanner;

public class L3Q3 {
    public static void main(String[] args) {
        int n, i, j;
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the size of square matrix:");
        n = scn.nextInt();
        int matrix[][] = new int[n][n];
        int transpose[][] = new int[n][n];
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                System.out.printf("Matrix[%d] [%d]=", i + 1, j + 1);
                matrix[i][j] = scn.nextInt();
            }
        }
        scn.close();
        System.out.println("The transpose of matrix is :");
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                transpose[i][j] = matrix[j][i];
                System.out.print("  " + transpose[i][j]);
            }
            System.out.println();
        }

    }
}
