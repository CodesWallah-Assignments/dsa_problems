package com.codeswallah.dsa.matrix.zigzag;

import com.codeswallah.dsa.matrix.utils.MatrixUtility;

public class RotateImageBy90Degree {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{
                {0, 1, 2},
                {3, 4, 5},
                {1, 3, 1}
        };
        MatrixUtility.print(matrix);
        rotateBy90(matrix);
        MatrixUtility.print(matrix);
    }

    public static void rotateBy90(int[][] matrix) {
        int n = matrix.length;

        // rotateBy90 = transpose + swap columns

        //Transpose of a matrix.
        for (int i=0; i < n; ++i) {
            for (int j=i; j < n; ++j) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        System.out.println("After transpose : ");
        MatrixUtility.print(matrix);

        for (int i=0; i < n; ++i) {
            int left = 0, right = n - 1;
            while (left < right) {
                int temp = matrix[i][right];
                matrix[i][right] = matrix[i][left];
                matrix[i][left] = temp;

                left++;
                right--;
            }
        }
    }
}
