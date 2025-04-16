package Recursions.SubSets;

import java.util.*;

public class subSequencewithAscii {
    
    public static void main(String[] args) {
        String str = "abc";
        subSeqAscii("", str);
       System.out.println(printSubseqAsciiArrayList("",str));
    }

    static void subSeqAscii(String p,String unP){

            if(unP.isEmpty()){
                System.out.print( p + " ");  
                return;
            }

            char ch = unP.charAt(0);
            subSeqAscii(p + ch, unP.substring(1));
            subSeqAscii(p+ (ch+0), unP.substring(1));
            subSeqAscii(p, unP.substring(1));
    }

     static ArrayList<String> printSubseqAsciiArrayList(String p,String unP){//p- proccessed and unP- unProcessed
        if(unP.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = unP.charAt(0);
        ArrayList<String> Part1 = printSubseqAsciiArrayList( p + ch , unP.substring(1));
        ArrayList<String> Part2 = printSubseqAsciiArrayList(p, unP.substring(1));
        ArrayList<String> Part3 = printSubseqAsciiArrayList(p + (ch + 0), unP.substring(1));
        
       Part1.addAll(Part2);
       Part1.addAll(Part3);


        return Part1;
    }
}
