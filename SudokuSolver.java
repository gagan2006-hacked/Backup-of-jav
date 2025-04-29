package Videos.COD_ASSIGN;

import java.util.Arrays;

public class SudokuSolver {
    public static void main(String[] args) {
        int[][] sudokuGrid = {
                {5, 3, 0, 0, 7, 0, 0, 0, 0},
                {6, 0, 0, 1, 9, 5, 0, 0, 0},
                {0, 9, 8, 0, 0, 0, 0, 6, 0},
                {8, 0, 0, 0, 6, 0, 0, 0, 3},
                {4, 0, 0, 8, 0, 3, 0, 0, 1},
                {7, 0, 0, 0, 2, 0, 0, 0, 6},
                {0, 6, 0, 0, 0, 0, 2, 8, 0},
                {0, 0, 0, 4, 1, 9, 0, 0, 5},
                {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };
        if (solver(sudokuGrid)){
            display(sudokuGrid);
        }else {
            System.out.println("not solve able");
        }
    }
    public static boolean solver(int [][]board){
        int n=board.length;
        int row=-1;
        int col=-1;
        boolean emptyPlace=true;
        for (int i =0;i<n;i++){
            if (!emptyPlace){
                break;
            }
            for (int j = 0; j<n ; j++) {
                if (board[i][j]==0){
                    row=i;
                    col=j;
                    emptyPlace=false;
                    break;
                }
            }
        }
        if (emptyPlace){
            return true;
        }
//        back tracking
        for (int i = 1; i <=9; i++) {
            if (isSafeToKeep(board,row,col,i)){
                board[row][col]=i;
                if (solver(board)) {
                    return true;
                }
                else {
                    board[row][col]=0;
                }
            }

        }
       return false;
    }
    private static void display(int[][]board){
        for (int[] row:board) {
            System.out.println(Arrays.toString(row));
        }
    }
    public static boolean isSafeToKeep(int[][]board,int row,int col,int num){
        if (numAlreadyPresentInRow(board,row,num) || numAlreadyPresentInCol(board,col,num)){
            return false;
        }
        if (gridCorrect(board,row-row%3,col-col%3,num)){
            return false;
        }
        return true;
    }

    private static boolean numAlreadyPresentInCol(int[][] board, int col, int num) {
        if (col>=0 && col<board.length){
            for (int row = 0; row < board.length; row++) {
                if (board[row][col]==num){
                    return true;
                }

            }
        }
        return false;
    }

    private static boolean numAlreadyPresentInRow(int[][] board, int row, int num) {
       if (row>=0 && row<board.length)
        for (int i = 0; i <board[row].length; i++) {
            if (board[row][i]==num){
                return true;
            }
        }
        return false;
    }
    public static boolean gridCorrect(int[][]board,int r,int c,int num){
        for (int i =r; i <r+3; i++) {
            for (int j =c; j <c+3;j++) {
                if (board[i][j]==num){
                    return true;
                }
            }

        }
        return false;
    }


}
