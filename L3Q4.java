//Write a program for matrix multiplication. The user will provide dimensions and elements of both matrices. 
//Verify if both matrices are multipliable or not before asking for elements.

import java.util.Scanner;

public class L3Q4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the size of matrix[1]: ");
        int r1 = scn.nextInt();
        int c1 = scn.nextInt();
        System.out.print("Enter the size of matrix[2]: ");
        int r2 = scn.nextInt();
        int c2 = scn.nextInt();

        if (c1 != r2) {
            System.out.print("You can't multiply the matrices!");
            scn.close();
            return;
        }

        int[][] M1 = inputMatrix(scn, r1, c1, "M1");
        int[][] M2 = inputMatrix(scn, r2, c2, "M2");
        int[][] M3 = multiplyMatrix(M1, M2, r1, c1, c2);

        System.out.println("The multiplied matrix is:");
        printMatrix(M3, r1, c2);

        scn.close();
    }

    public static int[][] inputMatrix(Scanner scn, int rows, int cols, String name) {
        int[][] mat = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("Matrix [%s][%d][%d] = ", name, i + 1, j + 1);
                mat[i][j] = scn.nextInt();
            }
        }
        return mat;
    }

    public static int[][] multiplyMatrix(int[][] M1, int[][] M2, int r1, int c1, int c2) {
        int[][] M3 = new int[r1][c2];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                M3[i][j] = 0;
                for (int k = 0; k < c1; k++) {
                    M3[i][j] += M1[i][k] * M2[k][j];
                }
            }
        }
        return M3;
    }

    public static void printMatrix(int[][] mat, int rows, int cols) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
