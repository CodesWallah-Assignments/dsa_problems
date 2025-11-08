package com.codeswallah.dsa.matrix.utils;

public class MatrixUtility {
    public static void print(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        System.out.println("------- Printing -------");
        for (int[] ints : matrix) {
            for (int j = 0; j < n; ++j) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
        System.out.println("----------------------------");
    }

    public static void print(char[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        System.out.println("------- Printing -------");
        for (char[] chars : matrix) {
            for (int j = 0; j < n; ++j) {
                System.out.print(chars[j] + " ");
            }
            System.out.println();
        }
        System.out.println("----------------------------");
    }
}
