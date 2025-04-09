package Recursions.EasyQuestions;

import java.util.Scanner;

public class ProductOfDigit {
    
     public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the digit : ");
        int n = sc.nextInt();
        int ans = digitProduct(n);
        System.out.println(ans);
    }

    static int digitProduct( int n ){
        if( n%10 == n ) {
            return n;
        }

        return ( n  % 10 ) * digitProduct( n/10 );
    }
}
