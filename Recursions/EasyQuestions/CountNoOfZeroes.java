package Recursions.EasyQuestions;

import java.util.Scanner;

public class CountNoOfZeroes {
    
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num : ");
        int n = sc.nextInt();
        System.out.println(noOfZeroes(n,0));
    }

    static int noOfZeroes(int n , int count){
        if(n==0){
            return count;
        }
        int rem = n%10;
        if(rem == 0){
            count++;
        }
        return noOfZeroes(n/10,count);
    }
}
