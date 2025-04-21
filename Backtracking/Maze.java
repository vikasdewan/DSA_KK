package Backtracking;

import java.util.ArrayList;

public class Maze {

    public static void main(String[] args) {
       System.out.println("Number of Paths: " + count(3,3));  
       path("", 3, 3);
       System.out.println(pathList("", 3, 3));
       System.out.println(pathListDigaonal("", 3, 3));
    }

    static int count(int r, int c) {

        if(r==1 || c==1){
            return 1;
        }

        return count(r-1,c) + count(r,c-1);
         
    }


    static void path(String p, int r, int c) {

        if(r==1 && c==1){
            System.out.println(p);
            return;
        }

        if(c>0){
            path(p+ "R",r,c-1);
        }
        if(r>0){
            path(p + "D", r - 1, c);
        }

         
    }

    static ArrayList<String> pathList(String p, int r, int c) {

        if(r==1 && c==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();
        if(c>0){
          list.addAll(pathList(p+ "R",r,c-1));
        }
        if(r>0){
            list.addAll(pathList(p+ "D",r-1,c));
        }

        return list;
    }
    static ArrayList<String> pathListDigaonal(String p, int r, int c) {

        if(r==1 && c==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();
        if(c>1){
          list.addAll(pathListDigaonal(p+ "R",r,c-1));
        }
        if(r>1){
            list.addAll(pathListDigaonal(p+ "D",r-1,c));
        }
        if(r>1 && c>1){
            list.addAll(pathListDigaonal( p + "Dig", r-1, c-1));
        }

        return list;
    }

}
