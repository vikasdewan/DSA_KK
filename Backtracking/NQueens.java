package Backtracking;

import java.util.*;



public class NQueens{
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        System.out.println(queens(board,0));

    }

    public static int queens(boolean[][] board, int row){
        if(row == board.length){
            display(board);
            return 1;
        }
        int count = 0;
        for(int col = 0; col< board.length;col++){
            if(isSafe(board,row ,col)){
                board[row][col] = true;
                count += queens(board,row+1);
                board[row][col] = false;
            }
        }
    return count;
    }

    public static boolean isSafe(boolean[][] board , int row , int col){
        
        for(int i=0;i<row;i++){
            if(board[i][col]){
                return false;
            }
        }

        //left diagonal
        for(int i=row , j = col ; i>=0 && j>=0 ;i-- , j--){
            if(board[i][j]){
                return false;
            }
        }

        //right diagonal
        for(int i=row , j = col ; i>=0 && j<board.length ;i-- , j++){
            if(board[i][j]){
                return false;
            }
        }

        return true;
        }

    public static void display(boolean[][] board){
        for(boolean[] arr : board){
            for(boolean ele : arr){
                if(ele){
                    System.out.print("Q ");
                }else{
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
    }


