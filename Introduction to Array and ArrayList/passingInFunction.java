import java.util.Arrays;

public class passingInFunction {
    public static void main(String[] args) {
        int[] nums = {1,2,4,5};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
        
    }   
    
    static void change(int[] arr){
        arr[3] = 2342;
    }
}
