//https://leetcode.com/problems/set-mismatch/description/

package CyclicSort;
import java.util.*;
public class SetMisMatch {
    
    public static void main(String[] args) {
         
        int[] nums = {1,2,2,4};
        System.out.println(Arrays.toString(findErrorNums(nums)));
    }

   public static int[] findErrorNums(int[] nums) {
    int i=0;
        while(i<nums.length) {  
            int correctIdx = nums[i] -1;
            if(nums[i]!=nums[correctIdx] ){
                swap(nums,i,correctIdx);
            }else{
                i++;
            }
        }    
    
    
    int[] ans = new int[2];
        for(i=0;i<nums.length;i++){
            if(nums[i] != i+1){
               ans[0]=nums[i];
               ans[1]=i+1;
            }
        }
        return ans;
        
    }

    static void swap(int[] nums , int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] =  temp;
    }
}
    



    

