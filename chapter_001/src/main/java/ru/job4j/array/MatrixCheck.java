package ru.job4j.array;

/**
 * 6.7. Квадратный массив заполнен true или false по диагоналям.[#159298]
 *
 * @author Stanislav Kufarev (91raykard@gmail.com)
 * @version 1
 * @since 09.09.2019
 */
public class MatrixCheck {
    public static boolean isWin(char[][] board) {
        boolean result = false;
        int horTrue = 0;
        int verTrue = 0;
        //проверим по горизонтали
        for (int row = 0; row < board.length; row++) {
            for (int cell = 0; cell < board.length; cell++) {
                if (board[row][cell] == 'X') {
                    horTrue++;
                }
                else {
                    break;
                }
            }
            if (horTrue == board.length) {
                result = true;
                break;
            }
        }
        //проверим по вертикали
        for (int cell = 0; cell < board.length; cell++) {
            for (int row = 0; row < board.length; row++) {
                if (board[row][cell] == 'X') {
                    verTrue++;
                }
                else {
                    break;
                }
            }
            if (verTrue == board.length) {
                result = true;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        char[][] hasWinVertical = {
                {'_', '_', 'X', '_', '_'},
                {'_', '_', 'X', '_', '_'},
                {'_', '_', 'X', '_', '_'},
                {'_', '_', 'X', '_', '_'},
                {'_', '_', 'X', '_', '_'},
        };
        boolean win = isWin(hasWinVertical);
        System.out.println("A board has a winner : " + win);
        System.out.println();
        char[][] hasWinHor = {
                {'_', '_', '_', '_', '_'},
                {'X', 'X', 'X', 'X', 'X'},
                {'_', '_', '_', '_', '_'},
                {'_', '_', '_', '_', '_'},
                {'_', '_', '_', '_', '_'},
        };
        boolean winHor = isWin(hasWinHor);
        System.out.println("A board has a winner : " + winHor);
        System.out.println();
        char[][] notWin = {
                {'_', '_', 'X', '_', '_'},
                {'_', '_', 'X', '_', '_'},
                {'_', 'X', '_', '_', '_'},
                {'_', '_', 'X', '_', '_'},
                {'_', '_', 'X', '_', '_'},
        };
        boolean lose = isWin(notWin);
        System.out.println("A board has a winner : " + lose);
    }
}
