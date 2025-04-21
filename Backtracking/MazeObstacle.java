package Backtracking;

import java.util.ArrayList;

public class MazeObstacle {
    
    public static void main(String[] args) {
        boolean[][] maze = { 
        {true, true, true}, 
        {true, false, true}, 
         {true, true, true} 
        };
        pathRestrications("", maze, 0, 0);
       System.out.println(pathRestricationsList("", maze, 0, 0)); 
    }

    static void pathRestrications(String p,boolean[][] maze, int r, int c) {

        if(r==maze.length-1 && c==maze[0].length-1){
            System.out.println(p);
            return;
        }
        if(!maze[r][c]){
            return;
        }
        if(c<maze[0].length-1){
            pathRestrications(p+ "R",maze,r,c+1);
        }
        if(r<maze.length-1){
            pathRestrications(p + "D",maze, r + 1, c);
        }

         
    }

    static ArrayList<String> pathRestricationsList(String p,boolean[][] maze, int r, int c) {

        if(r==maze.length-1 && c==maze[0].length-1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
          
            return list;
        }
        if(maze[r][c] == false){
            return new ArrayList<>();
        }
        ArrayList<String> list = new ArrayList<>();
        if(c<maze[0].length-1){
            list.addAll(pathRestricationsList(p+ "R",maze,r,c+1));
        }
        if(r<maze.length-1){
            list.addAll(pathRestricationsList(p + "D",maze, r + 1, c));
        }

        return list;
         
    }

} 
