package com.codeswallah.dsa.matrix.setzeros;

import com.codeswallah.dsa.matrix.utils.MatrixUtility;

public class SetZeroSolver {
    public static void main(String[] args) {
        int[][] mat1 = new int[][]{{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        int[][] matrix = new int[][]{
                {0, 1, 2, 0},
                {3, 4, 5, 2},
                {1, 3, 1, 5}
        };
        MatrixUtility.print(matrix);
        setZeros(matrix);
        MatrixUtility.print(matrix);
    }

    public static void setZeros(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        boolean firstRowZero = false;
        boolean firstColZero = false;

        // Step 1: Mark zero rows and columns
        for (int i = 0; i < m; i++) {
            if (matrix[i][0] == 0) {
                firstColZero = true;
                break;
            }
        }
        for (int j = 0; j < n; j++) {
            if (matrix[0][j] == 0) {
                firstRowZero = true;
                break;
            }
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
        MatrixUtility.print(matrix);

        // Step 2: Use marks to set elements to zero
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        MatrixUtility.print(matrix);
        // Step 3: Handle first row and column
        if (firstColZero) {
            for (int i = 0; i < m; i++) {
                matrix[i][0] = 0;
            }
        }
        if (firstRowZero) {
            for (int j = 0; j < n; j++) {
                matrix[0][j] = 0;
            }
        }
    }
}
