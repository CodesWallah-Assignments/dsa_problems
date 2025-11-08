package com.codeswallah.dsa.matrix.tictactoe;

import com.codeswallah.dsa.matrix.utils.MatrixUtility;

public class TicTacToeValidator {

    static final int[] WIN_MASKS = {
            0b000000111, // Row 0
            0b000111000, // Row 1
            0b111000000, // Row 2

            0b001001001, // Col 1
            0b010010010, // Col 2
            0b100100100, // Col 3

            0b100010001, // Diagonal
            0b001010100, // Anti diagonal
    };

    public static void main(String[] args) {
        char[][] board = {
                {'O', 'O', 'X'},
                {'X', 'X', ' '},
                {' ', 'X', ' '}
        };

        MatrixUtility.print(board);
        System.out.println(checkWinner(board));
    }

    public static String checkWinner(char [][] board) {
        int xMask = 0, oMask = 0;

        for (int i=0; i < 3; ++i) {
            for (int j=0; j < 3; ++j) {
                int bit = 1 << (i * 3 + j);
                if (board[i][j] == 'X')
                    xMask = xMask | bit;
                else if (board[i][j] == 'O')
                    oMask = oMask | bit;
            }
        }

        for (int winning_mask : WIN_MASKS) {
            if ((xMask & winning_mask) == winning_mask)
                return "X wins";
            else if ((oMask & winning_mask) == winning_mask)
                return "O wins";
        }

        for (char[] vals : board) {
            for (char val : vals) {
                if (val == ' ')
                    return "Game ongoing";
            }
        }
        return "Draw";
    }
}
