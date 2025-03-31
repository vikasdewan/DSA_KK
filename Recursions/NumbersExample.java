package Recursions;

public class NumbersExample {
    
 public static void main(String[] args) {
    
    //write a function that takes a number as input and print it
    //print first 5 numbers 1 2 3 4 5
    printNum(5);
 }  
 
    static void printNum(int n){
        if(n==0){
            return;
        }
        printNum(n-1);
        System.out.print(n + " ");
    }

}
