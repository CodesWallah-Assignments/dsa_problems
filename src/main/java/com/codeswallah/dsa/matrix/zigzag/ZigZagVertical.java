package com.codeswallah.dsa.matrix.zigzag;

import com.codeswallah.dsa.matrix.utils.MatrixUtility;

import java.util.ArrayList;
import java.util.List;

public class ZigZagVertical {
    public static void main(String[] args) {
        int[][] mat1 = new int[][]{{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        int[][] matrix = new int[][]{
                {0, 1, 2, 0},
                {3, 4, 5, 2},
                {1, 3, 1, 5}
        };

        MatrixUtility.print(matrix);
        List<Integer> result = zigZagVertical(matrix);
        System.out.println(result);
    }

    public static List<Integer> zigZagVertical(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        List<Integer> traversed = new ArrayList<>();
        for (int j = 0; j < n; ++j) {
            if (j % 2 == 0) {
                for (int i = 0; i < m; ++i) {
                    traversed.add(matrix[i][j]);
                }
            } else {
                for (int i = m - 1; i >= 0; --i) {
                    traversed.add(matrix[i][j]);
                }
            }
        }
        return traversed;
    }
}
