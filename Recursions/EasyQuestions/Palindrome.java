package Recursions.EasyQuestions;

import java.util.Scanner;

public class Palindrome {
    
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num : ");
        int n = sc.nextInt();
        if(isPalindrome(n)){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }

    }

    static int NumRev(int n,int rev){

        if(n==0){
            return rev;
        }
        int rem = n % 10;
        rev = rev * 10 + rem;

        return  NumRev(n/10,rev);
    }

    static boolean isPalindrome(int n){
        return (n == NumRev(n,0));
    }
}



