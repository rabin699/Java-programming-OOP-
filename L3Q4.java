//Write a program for matrix multiplication. The user will provide dimensions and elements of both matrices. 
//Verify if both matrices are multipliable or not before asking for elements.

import java.util.Scanner;

public class L3Q4 {
    public static void main(String[] args) {
        int r1, c1, r2, c2, i, j;
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the size of matrix[1]:");
        r1 = scn.nextInt();
        c1 = scn.nextInt();
        System.out.print("Enter the size of matrix[2]:");
        r2 = scn.nextInt();
        c2 = scn.nextInt();
        if (c1 != r2) {
            System.out.print("You cant multiply the matrices!");
            return;
        }
        int M1[][] = new int[r1][c1];
        int M2[][] = new int[r2][c2];
        int M3[][] = new int[r1][c2];
        for (i = 0; i < r1; i++) {
            for (j = 0; j < c1; j++) {
                System.out.printf("Matrix [M1] [%d] [%d]=", i + 1, j + 1);
                M1[i][j] = scn.nextInt();
            }
        }
        System.out.println();
        for (i = 0; i < r2; i++) {
            for (j = 0; j < c2; j++) {
                System.out.printf("Matrix [M2] [%d] [%d]=", i + 1, j + 1);
                M2[i][j] = scn.nextInt();
            }
        }
        for (i = 0; i < r1; i++) {
            for (j = 0; j < c2; j++) {
                M3[i][j] = 0;
                for (int k = 0; k < r2; k++) {
                    M3[i][j] += M1[i][k] * M2[k][j];
                }
            }
        }
        System.out.println("The multiplied matrix is :");
        for (i = 0; i < r2; i++) {
            for (j = 0; j < c2; j++) {
                System.out.printf(" " + M3[i][j]);
            }
            System.out.println();
        }
        scn.close();
    }
}
