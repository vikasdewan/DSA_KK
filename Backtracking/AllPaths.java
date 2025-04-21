package Backtracking;

import java.util.Arrays;

public class AllPaths {
   
    public static void main(String[] args) {
       
        boolean[][] maze = { 
        {true, true, true}, 
        {true, true, true}, 
         {true, true, true} 
        };
        // allPaths("", maze, 0, 0);
        int[][] path = new int[maze.length][maze[0].length];
        allPathsPrint("", maze, 0, 0,path,1 );
    }

    static void allPaths(String p,boolean[][] maze, int r, int c) {

        if(r==maze.length-1 && c==maze[0].length-1){
            System.out.println(p);
            return;
        }
        if(!maze[r][c]){
            return;
        }
        
        maze[r][c] = false; // Mark the cell as visited

        if(c<maze[0].length-1){
            allPaths(p+ "R",maze,r,c+1);
        }
        if(r<maze.length-1){
            allPaths(p + "D",maze, r + 1, c);
        }
        if(r>0){
            allPaths(p+ "U",maze, r - 1, c);
        }
        if(c>0){
            allPaths(p + "L",maze, r, c - 1);
        }

        maze[r][c] = true; // Backtrack and unmark the cell       
    }
    static void allPathsPrint(String p,boolean[][] maze, int r, int c, int[][] path,int step) {

        if(r==maze.length-1 && c==maze[0].length-1){
            path[r][c] = step; // last step.
          for(int[] arr : path){
            System.out.println(Arrays.toString(arr));
          }
          System.out.println(p);
          System.out.println();
            return;
        }
        if(!maze[r][c]){
            return;
        }
        
        maze[r][c] = false; // Mark the cell as visited
        path[r][c] = step; // Store the path taken

        if(c<maze[0].length-1){
            allPathsPrint(p+ "R",maze,r,c+1,path,step+1);
        }
        if(r<maze.length-1){
            allPathsPrint(p + "D",maze, r + 1,c,path,step+1);
        }
        if(r>0){
            allPathsPrint(p+ "U",maze, r - 1,c ,path,step+1);
        }
        if(c>0){
            allPathsPrint(p + "L",maze, r, c - 1,path,step+1);
        }

        maze[r][c] = true; // Backtrack and unmark the cell 
        path[r][c] = 0; // Unmark the path taken      
    }


}
