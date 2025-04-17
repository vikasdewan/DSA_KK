package Recursions;

import java.util.*;

 
public class Permutaion {
 
    public static void main(String[] args) {
        // permutations("", "abc");
        ArrayList<String> ans = permutationList("", "abc");
        System.out.println(ans);
    }

    static void permutations(String p , String unP){
        if(unP.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = unP.charAt(0);

        for(int i =0 ;i<=p.length();i++){
            String f = p.substring(0, i);
            String s = p.substring(i,p.length());

            permutations(f+ch+s, unP.substring(1));
        }
    }

    static ArrayList<String> permutationList(String p , String unP){
        if(unP.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = unP.charAt(0);
        ArrayList<String> ans = new ArrayList<>();
        for(int i=0 ;i<p.length();i++){
            String f = p.substring(0, i);
            String s = p.substring(i,p.length());
            ans.addAll(permutationList(f+ch+s, unP.substring(1)));
        }
        return ans;
    }
}
