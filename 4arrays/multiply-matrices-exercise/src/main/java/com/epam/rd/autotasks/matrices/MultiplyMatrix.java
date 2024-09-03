package com.epam.rd.autotasks.matrices;

import java.util.Arrays;

public class MultiplyMatrix {
    public static int[][] multiply(int[][] matrix1, int[][] matrix2) {
        int r1 = matrix1.length;
        int c1 = matrix1[0].length;
        int r2 = matrix2.length;
        int c2 = matrix2[0].length;
        // r1*c1 and r2*c2 given c1 is equal to r2
        // the final matrix has dimension r1 *c2

        int[][] prod = new int[r1][c2];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    prod[i][j] += (matrix1[i][k] * matrix2[k][j]);
                }
            }
        }
        return prod;

    }

    public static void main(String[] args) {

        System.out.println("Test your code here!\n");

        // Get a result of your code

        int[][] a = { { 1, 2, 3 },
                { 4, 5, 6 } };

        int[][] b = { { 7, 8 },
                { 9, 10 },
                { 11, 12 } };

        int[][] result = multiply(a, b);
        System.out.println(Arrays.deepToString(result).replace("],", "]\n"));
    }
}
