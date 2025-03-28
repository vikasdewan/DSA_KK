package Operators;

import java.util.*;

public class basics {
    
    public static void main(String[] args) {
        System.out.println('a'+'b');//ASCII value of a-97 b-98.
        System.out.println("a" +"b");//ab
        System.out.println((char)('a' + 3));//a-97 + 3 =100 (d)
        System.out.println('a' + 3);// 100


        //note : when an integer is concatenated  with a string , then it is converted to it's wrapper class Integer.
        System.out.println("a" + 1);


        System.out.println("vikas" + new ArrayList<>());
        System.out.println("vikas" + new Integer(56));

        // System.out.println(new Integer(15) + new ArrayList<>());  //give error
        System.out.println(new Integer(15) + "" + new ArrayList<>());  //do not give error 
        //note : if we are using + operator with two objects then it will give compilation error.
        // but if we are using + operator with one object and one string then it will not give compilation error


        
    }
}
