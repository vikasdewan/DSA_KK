package functions;

import java.util.Scanner;

public class basics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your name :");
        char a = '1';
        char b = '2';

        System.out.println("a is " + a + " and b is " + b);
        swap(a,b);
        System.out.println("a is " + a + " and b is " + b);

    }
     static void swap(char a,char b){
        char c=a;
        a=b;
        b=c;
        System.out.println("a is " + a + " and b is " + b);
    }

}