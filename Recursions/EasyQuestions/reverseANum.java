package Recursions.EasyQuestions;

import java.util.Scanner;

 

public class reverseANum {
 
   

    static int NumRev(int n,int rev){

        if(n==0){
            return rev;
        }
        int rem = n % 10;
        rev = rev * 10 + rem;

        return  NumRev(n/10,rev);
    }

    
    static int NumRev2(int n ){

        if(n%10 == n){
            return n;
        }
        return  ((n%10)*helper(n)) + NumRev2(n/10);
    }

    static int helper(int n){
        if(n==0){
            return 1;
        }
        int count = 0;
        while(n>0){
            n = n/10;
            count++;
        }
        int mul = 1;
        for (int i = 1; i < count; i++) {
            mul = mul *10;

        }
        return mul;
    }


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
       System.out.print("Enter the num : ");
       int n = sc.nextInt();

    //    System.out.println(NumRev(n,0));
       System.out.println(NumRev2(n));
   }
}
