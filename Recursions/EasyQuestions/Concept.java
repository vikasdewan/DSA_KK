package Recursions.EasyQuestions;

public class Concept {
    
    public static void main(String[] args) {
        
        // fun(5);
        fun1(5);
    }

    static void fun(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        fun(n--);// here when we are doing n--, it means that first value is going for the call or execution and then when it return it will gonna decrease the value of n.

        //means this will make a infinite call recursively.

        //n-- and --n are not same.
        
    }
    static void fun1(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        fun1(--n); // here when we are doing --n, it means that first value is going to decrease and then it will go for the call or execution.
    }

}
