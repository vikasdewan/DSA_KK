package functions;
import java.util.*;

public class changaValue {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(arr));
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int[] nums){
        nums[0] = 6;//if you make change to the object via this reference variable,same object will be change

    }
}
