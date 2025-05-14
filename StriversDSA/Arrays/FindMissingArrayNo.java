package StriversDSA.Arrays;
import java.util.*;

public class FindMissingArrayNo {
    
    public static void main(String[] args) {
        
        int[] arr = {3,0,1};
        int result = findNum(arr);
        System.out.println("The missing number is: " + result);
    }

    public static int findNum(int[] arr){

        int n = arr.length;
        Arrays.sort(arr);
        for(int i= 0;i<n ;i++){
            if(arr[i] != i){
               return i;
            }
        }
        return n;
    }
}
