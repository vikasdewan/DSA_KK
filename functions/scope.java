package functions;

import java.util.*;

public class scope {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int  a = 10;
            int b= 20;

            //block scope
            {
 //               int a = 40;// Error : cannot define again a variable which is already define in the funciotn
                             //can make changes in the declared variables;          
                   int c = 50;//c is only known inside this block only;
            }
              //  System.out.println(c);///give error: c's scope is only inside the block.

                
            //below line give error as num not defined by the main function
          //  System.out.println(num);
    }
    static void random(){
        int num = 30;
      //  System.out.println(a);//give error as a is not defined in the random() function.
        


    }
}
