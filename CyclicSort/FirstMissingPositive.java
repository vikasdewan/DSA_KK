//https://leetcode.com/problems/first-missing-positive/description/
package CyclicSort;
import java.util.*;
public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] nums = {1,2,0};
        System.out.println(firstMissingPositive(nums));
    }

    public static  int firstMissingPositive(int[] nums){
        int i=0;
        while(i<nums.length){
            int correctIdx = nums[i]-1;
            if(nums[i]<=nums.length  && nums[i] > 0 && nums[i] != nums[correctIdx]  ){
                swap(nums,i,correctIdx);
            }else{
                i++;
            }
        }

        for(int idx = 0;idx<nums.length;idx++){
            if(nums[idx] != idx+1){
                return idx+1;
            }
        }
        return nums.length + 1;
    }

     static void swap(int[] nums , int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] =  temp;
    }
}
