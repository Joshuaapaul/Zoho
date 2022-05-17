package com.zoho;

import java.util.Scanner;

public class matrixArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter numbers rows for matrix1");
        int rowMatrix1 = input.nextInt();
        System.out.println("Enter numbers columns for matrix1");
        int columnMatrix1 = input.nextInt();
        System.out.println("Enter numbers rows for matrix2");
        int rowMatrix2 = input.nextInt();
        System.out.println("Enter numbers columns for matrix2");
        int columnMatrix2 = input.nextInt();

        int matrix1[][] = new int[rowMatrix1][columnMatrix1];
        int matrix2[][] = new int[rowMatrix2][columnMatrix2];
        int matrix3[][] = new int[rowMatrix1][columnMatrix2];

        if (columnMatrix1 == rowMatrix2) {

            for (int i = 0; i < rowMatrix1; i++) {
                for (int j = 0; j < columnMatrix1; j++) {
                    System.out.println("Enter value for matrix1 [i][j]");
                    matrix1[i][j] = input.nextInt();

                }
            }
            for (int i = 0; i < rowMatrix2; i++) {
                for (int j = 0; j < columnMatrix2; j++) {
                    System.out.println("Enter value for matrix2 [i][j]");
                    matrix2[i][j] = input.nextInt();
                }
            }

            for (int i = 0; i < rowMatrix1; i++) {
                for (int j = 0; j < columnMatrix2; j++) {
                    for (int k = 0; k < rowMatrix2; k++) {
                        matrix3[i][j] = matrix3[i][j] + (matrix1[i][k] * matrix2[k][j]);

                    }
                    System.out.print(matrix3[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
