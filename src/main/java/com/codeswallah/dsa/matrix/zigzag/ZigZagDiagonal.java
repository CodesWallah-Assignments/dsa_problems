package com.codeswallah.dsa.matrix.zigzag;

import com.codeswallah.dsa.matrix.utils.MatrixUtility;

import java.util.ArrayList;
import java.util.List;

public class ZigZagDiagonal {
    public static void main(String[] args) {
        int[][] mat1 = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        MatrixUtility.print(mat1);
        List<Integer> traversed = diagonalZigZagTraversal(mat1);
        System.out.println(traversed);
    }
    public static List<Integer> diagonalZigZagTraversal(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if (matrix == null || matrix.length == 0) return result;

        int m = matrix.length;
        int n = matrix[0].length;
        int row = 0, col = 0;
        boolean goingUp = true;

        while (row < m && col < n) {
            result.add(matrix[row][col]);

            if (goingUp) {
                if (col == n - 1) {
                    row++;          // hit last column, move down
                    goingUp = false;
                } else if (row == 0) {
                    col++;          // hit first row, move right
                    goingUp = false;
                } else {
                    row--;
                    col++;          // move diagonally up-right
                }
            } else {
                if (row == m - 1) {
                    col++;          // hit last row, move right
                    goingUp = true;
                } else if (col == 0) {
                    row++;          // hit first column, move down
                    goingUp = true;
                } else {
                    row++;
                    col--;          // move diagonally down-left
                }
            }

            if (result.size() == m * n) break;  // covered all elements
        }

        return result;
    }
}
