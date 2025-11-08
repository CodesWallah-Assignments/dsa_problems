package com.codeswallah.dsa.matrix.setzeros;

import com.codeswallah.dsa.matrix.utils.MatrixUtility;

import java.util.Arrays;

public class SetZeroApproach02 {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{
                {0, 1, 2, 0},
                {3, 4, 5, 2},
                {1, 3, 1, 5}
        };
        MatrixUtility.print(matrix);
        setZeros(matrix);
        MatrixUtility.print(matrix);
    }
    public static void print(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    public static void setZeros(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        int[] rows = new int[m];
        int[] cols = new int[n];

        Arrays.fill(rows, -1);
        Arrays.fill(cols, -1);

        System.out.print("rows : ");
        print(rows);
        System.out.print("cols : ");
        print(cols);

        for (int i=0; i < m; ++i) {
            for (int j=0; j < n; ++j) {
                if (matrix[i][j] == 0) {
                    rows[i] = 0;
                    cols[j] = 0;
                }
            }
        }

        System.out.println("After");
        System.out.print("rows : ");
        print(rows);
        System.out.print("cols : ");
        print(cols);


        for (int i=0; i < m; ++i) {
            for (int j=0; j < n; ++j) {
                if (rows[i] == 0 || cols[j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
