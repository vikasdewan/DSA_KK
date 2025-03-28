package Strings;

import java.util.Arrays;

public class Methods {
    
    public static void main(String[] args) {
        
        String name = "vikas Dewangan";
        String name2 = "  shubham Dewangan   ";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        System.out.println(name.length());
        System.out.println(name.substring(0, 5));
        System.out.println(name.replace("D", "d"));
        System.out.println(name.contains("D"));
        System.out.println(name.startsWith("V"));
        System.out.println(name.endsWith("n"));
        System.out.println(name2.strip());
        System.out.println(Arrays.toString(name.split(" ")));
    }

}
