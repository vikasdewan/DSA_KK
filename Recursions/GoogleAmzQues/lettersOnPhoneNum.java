//https://leetcode.com/problems/letter-combinations-of-a-phone-number/
package Recursions.GoogleAmzQues;

import java.util.*;
public class lettersOnPhoneNum {
    
    public static void main(String[] args) {
 
      letterCombo("", "12");   
      System.out.println(letterComboList("", "12"));   
      System.out.println(letterComboCount("", "12"));   
        
    }

    static void letterCombo(String p , String unP  ){

        if(unP.isEmpty()){
            System.out.print(p + " ");
            return;
        }
        int digit = unP.charAt(0) - '0';// convert '1' into 1;

        for(int i = ((digit-1)*3) ;i<(digit*3);i++){
            char ch = (char)('a' + i); // if we have 0 then it give ch = 'a', if 1 then ch = 'b';
            letterCombo( p + ch , unP.substring(1) );
        }

         
    }
    static ArrayList<String> letterComboList(String p , String unP){

        if(unP.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit = unP.charAt(0) - '0';// convert '1' into 1;
        ArrayList<String> list = new ArrayList<>(); //local for a particular call

        for(int i = ((digit-1)*3) ;i<(digit*3);i++){
            char ch = (char)('a' + i); // if we have 0 then it give ch = 'a', if 1 then ch = 'b';
            list.addAll(letterComboList( p + ch , unP.substring(1)));
        }

        return list;

         
    }


    static int letterComboCount(String p , String unP  ){

        if(unP.isEmpty()){
            return 1;
        }
        int count = 0;
        int digit = unP.charAt(0) - '0';// convert '1' into 1;


        for(int i = ((digit-1)*3) ;i<(digit*3);i++){
            char ch = (char)('a' + i); // if we have 0 then it give ch = 'a', if 1 then ch = 'b';
           count = count + letterComboCount( p + ch , unP.substring(1) );
        }

         return count;
    }
}
