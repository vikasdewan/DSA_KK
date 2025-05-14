package Backtracking;

public class SudukuSolver {
    
    public static void main(String[] args) {
        
     
        int[][] board = {
            {5, 3, 0, 0, 7, 0, 0, 0, 0},
            {6, 0, 0, 1, 9, 5, 0, 0, 0},
            {0, 9, 8, 0, 0, 0, 0, 6, 0},
            {8, 0, 0, 0, 6, 0, 0, 0, 3},
            {4, 0, 0, 8, 0, 3, 0, 0, 1},
            {7, 0, 0, 0, 2, 0, 0, 0, 6},
            {0 ,6 ,0 ,0 ,0 ,2 ,8 ,0 ,0},
            {0 ,0 ,4 ,1 ,9 ,5 ,0 ,0 ,8},
            {0 ,8 ,3 ,4 ,2 ,6 ,7 ,9 ,5}
        };

        if(solveSuduku(board)){
            System.out.println("Sudoku solved successfully");
        }else{
            System.out.println("No solution exists");
        }
    }

    static boolean solveSuduku(int[][] board){
        int n = board.length;
        int row = -1;
        int col = -1;

         
        boolean emptyLeft = true;
        for(int i=0; i<n ; i++){
            for(int j=0;j<n ;j++){
                if(board[i][j]==0){
                    row = i;
                    col = j;
                    emptyLeft = false;
                    break;
                }
            }
            //if we found empty cell then we can break the loop
            if(!emptyLeft){
                break;
            }
        }

        //if we have not found any empty cell then we can return true
        if(emptyLeft){
            return true;
        }
      
        //backtracking
        for(int num = 1; num<=n ; num++){
            if(isSafe(board , row , col , num)){
                board[row][col] = num;
                if(solveSuduku(board)){
                    display(board);
                    return true;
                }
                //backtrack
                board[row][col] = 0;
            }
        }

        //if we have tried all the numbers and none of them worked then we can return false
        return false;
    }

    private static void display(int[][] board) {
        for(int i=0; i<board.length ; i++){
            for(int j=0; j<board.length ; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    static boolean isSafe(int[][] board , int row , int col , int num){
        for(int i=0; i<board.length ; i++){
            if(board[i][col]== num){
                return false;
            }
        }
        
        for(int[] nums : board){
            if(nums[col] == num){
                return false;
            }
        }

        int sqrt = (int)Math.sqrt(board.length);
        int startRow = row - row % sqrt;
        int startCol = col - col % sqrt;
        for(int i = 0; i< sqrt ; i++){// we can also start i from startRow and end it to startRow + sqrt.
            for(int j = 0; j< sqrt ; j++){
                if(board[i + startRow][j + startCol] == num){
                    return false;
                }
            }
        }
         
     
        return true;
    }

    static void display(String[][] board){
        
    }

}
 