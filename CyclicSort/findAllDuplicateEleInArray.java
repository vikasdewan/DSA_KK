//https://leetcode.com/problems/find-all-duplicates-in-an-array/description/

package CyclicSort;
import java.util.*;

public class findAllDuplicateEleInArray {
    
    public static void main(String[] args) {
         
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(findDuplicates(nums));
    }

    public static List<Integer> findDuplicates(int[] nums) {
        int i=0;
        while(i<nums.length) {  
            int correctIdx = nums[i] -1;
            if(nums[i]!=nums[correctIdx] ){
                swap(nums,i,correctIdx);
            }else{
                i++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        for(i=0;i<nums.length;i++){
            if(nums[i] != i+1){
                ans.add(nums[i]);
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
