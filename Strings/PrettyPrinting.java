package Strings;
import java.util.*;

public class PrettyPrinting {
    
    public static void main(String[] args) {
        
        float a = 143.1274f;

        System.out.printf("approx. value of a upto 2 decimal number is : %.2f",a);
        //here i am using printf not println , note that, f means formatted.
        System.out.println();
        // System.out.printf("%.5f",Math.PI);
        System.out.printf("hello my name is %s and i am %s years old","vikas","22");
    }
}
