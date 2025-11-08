package com.codeswallah.dsa.matrix.validsudoku;

import com.codeswallah.dsa.matrix.utils.MatrixUtility;

import java.util.HashSet;

public class SudokuValidator {
    public static void main(String[] args) {
        char[][] board = new char[][]{
                {'5', '3', '.',     '.', '7', '.',      '.', '.', '.'},
                {'6', '.', '.',     '1', '9', '5',      '.', '.', '.'},
                {'.', '9', '8',     '.', '.', '.',      '.', '6', '.'},

                {'8', '.', '.',     '.', '6', '.',      '.', '.', '3'},
                {'4', '.', '.',     '8', '.', '3',      '.', '.', '1'},
                {'7', '.', '.',     '.', '2', '.',      '.', '.', '6'},

                {'.', '6', '.',     '.', '.', '.',      '2', '8', '.'},
                {'.', '.', '.',     '4', '1', '9',      '.', '.', '5'},
                {'.', '.', '.',     '.', '8', '.',      '.', '7', '9'}
        };

        MatrixUtility.print(board);
        System.out.println(isValidSudoku(board));
    }

    /**
     * Using Builtin Data Structure - HashSet
     * @param board input 2-D sudoku board data.
     * @return true/false
     */
    public static boolean isValidSudoku(char[][] board) {
        // Invalid sudoku dimension
        if (board.length != 9 || board[0].length != 9) {
            return false;
        }

        for (int i = 0; i < 9; i++) {
            HashSet<Character> rows = new HashSet<>();
            HashSet<Character> cols = new HashSet<>();
            HashSet<Character> box = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                // Row check
                if (board[i][j] != '.' && !rows.add(board[i][j])) return false;
                // Column check
                if (board[j][i] != '.' && !cols.add(board[j][i])) return false;
                // Sub-box check
                int RowIndex = 3 * (i / 3) + j/3;
                int ColIndex = 3 * (i % 3) + j%3;
                char val = board[RowIndex][ColIndex];
                if (val != '.' && !box.add(val)) return false;
            }
        }
        return true;
    }
}
