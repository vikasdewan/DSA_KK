package functions;
import java.util.*;


//variable length argument

public class VarArgs{
    public static void main(String[] args) {
        fun(1,2,3,5,3,3,32,2,3,222,3,2232,2232);
        multiple(3,2,"vikas","pratik","shubham","Yash","Abhishek");
    }

    static void multiple(int a, int b ,String ...v){
        System.out.println(Arrays.toString(v));
        System.out.println(a + b);
    }


    static void fun(int ...v){ // ...v : variable lenght argument should use as last argument when there is more than one argument.
        System.out.println(Arrays.toString(v));
    }
}