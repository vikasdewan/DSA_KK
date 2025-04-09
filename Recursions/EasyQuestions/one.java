package Recursions.EasyQuestions;

import java.util.*;

public class one {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number upto which you want to print the number: ");
        int n = sc.nextInt();
        // nTo1(n);
        // oneToN(n);
        oneToNAndNToOne(n);
    }

    static void nTo1(int n){
        if(n==0){
            return ;
        }
        System.out.print(n + " ");
        nTo1(n-1);
    }

    static void oneToN(int n){
        if(n==0){
            return;
        }
        oneToN(n-1);
        System.out.print(n + " ");
    }

    static void oneToNAndNToOne(int n){
        if(n==0){
            return;
        }
        System.out.print(n + " ");
        oneToNAndNToOne(n-1);
        System.out.print(n + " ");
    }

}

