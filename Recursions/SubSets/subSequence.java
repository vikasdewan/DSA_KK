//if we have "abc" then print "a" , "b" , "c" , "ab" , "bc", "ac", "abc"

package Recursions.SubSets;

import java.util.ArrayList;

public class subSequence {
    
    public static void main(String[] args) {
        String str = "abc";
        // printSubseq("", str);
       ArrayList<String> ans =  printSubseqArrayList("", str);
       System.out.println(ans);
    }

    static void printSubseq(String p,String unP){//p- proccessed and unP- unProcessed
        if(unP.isEmpty()){
            System.out.print(p +" ");
            return;
        }
        char ch = unP.charAt(0);
        printSubseq(p + ch , unP.substring(1));
        printSubseq(p, unP.substring(1));
    }


    static ArrayList<String> printSubseqArrayList(String p,String unP){//p- proccessed and unP- unProcessed
        if(unP.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = unP.charAt(0);
        ArrayList<String> left = printSubseqArrayList( p + ch , unP.substring(1));
        ArrayList<String> right = printSubseqArrayList(p, unP.substring(1));
        
        left.addAll(right);


        return left;
    }

}
