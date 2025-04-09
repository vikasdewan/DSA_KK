package Recursions.EasyQuestions;

import java.util.*;
public class SumOfDigit {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the digit : ");
        int n = sc.nextInt();
        int ans = digitSum(n);
        System.out.println(ans);
    }

    static int digitSum( int n ){
        if( n==0 ) {
            return 0;
        }
        return ( n  % 10 ) + digitSum( n/10 );
    }
}
