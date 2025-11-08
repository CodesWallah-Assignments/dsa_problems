package com.codeswallah.dsa.matrix.zigzag;

import com.codeswallah.dsa.matrix.utils.MatrixUtility;

import java.util.ArrayList;
import java.util.List;

public class SpiralTraversal {
    public static void main(String[] args) {
        int[][] mat1 = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        MatrixUtility.print(mat1);
        List<Integer> traversed = spiralTraverse(mat1);
        System.out.println(traversed);
    }
    static List<Integer> spiralTraverse(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        List<Integer> traversed = new ArrayList<>();

        int top = 0, bottom = m - 1, left = 0, right = n - 1;

        while (top <= bottom && left <= right) {
            for (int j = left; j <= right; ++j)
                traversed.add(matrix[top][j]);
            top++; // shift the top boundary inwards

            for (int i = top; i <= bottom; ++i)
                traversed.add(matrix[i][right]);
            right--; // shift the right boundary inwards

            if (top <= bottom) {
                for (int j = right; j >= left; --j)
                    traversed.add(matrix[bottom][j]);
                bottom--; // shift the bottom boundary inwards
            }

            if (left <= right) {
                for (int i = bottom; i >= top; --i)
                    traversed.add(matrix[i][left]);
                left++; //shift the left boundary inwards
            }
        }
        return traversed;
    }
}
