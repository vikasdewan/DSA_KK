package first;
import java.util.Scanner;

public class typecasting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //int to float
        // float b = sc.nextInt(); //give no error
        
        // float to int
        // int  a = sc.nextFloat(); //give error

        //To solve above problem we use TypeCasting


        //TypeCasting

        // int c = (int)(sc.nextFloat());//give no error
        // int d = (int)(67.343f);
        // System.out.println(c);

        //automatic type promotion in expressions

        // // int e = 257;
        // // byte f = (byte)(e);// max a byte can store is 256  so it's output will be 257%256 = 1;
        // // System.out.println(f); 

        // // byte g = 40;
        // // byte h = 50;
        // // byte i = 100;

        // // int j = g*h/i;  //here g*h is 2000 how 2000 is store in byte here on each bit system transfer that to int 
        // System.out.println(j);

        int num = 'a';//store the ascii value of 'a'
        System.out.println(num);



    }
}
