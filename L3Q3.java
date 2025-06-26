//Write a program to evaluate transpose of n-by-n matrix

import java.util.Scanner;

public class L3Q3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the size of square matrix: ");
        int n = scn.nextInt();
        int[][] matrix = inputMatrix(scn, n);
        int[][] transpose = transposeMatrix(matrix, n);
        System.out.println("The transpose of matrix is:");
        printMatrix(transpose, n);
        scn.close();
    }

    public static int[][] inputMatrix(Scanner scn, int n) {
        int[][] mat = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("Matrix[%d][%d] = ", i + 1, j + 1);
                mat[i][j] = scn.nextInt();
            }
        }
        return mat;
    }

    public static int[][] transposeMatrix(int[][] matrix, int n) {
        int[][] trans = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                trans[i][j] = matrix[j][i];
            }
        }
        return trans;
    }

    public static void printMatrix(int[][] mat, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
