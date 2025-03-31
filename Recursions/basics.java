package Recursions;

import Patterns.solutions;

public class basics {
    
    public static void main(String[] args) {
        
        message(5);
    }

    static void message(int n){

        if(n==0){
             return;
        }
        System.out.println("hello world"); 
         message(n-1);
    }
}
