//https://leetcode.com/problems/find-the-duplicate-number/


package CyclicSort;
import java.util.*;



public class FindTheDuplicateNumber {
    

    public static void main(String[] args) {
        int[] nums = {3,1,3,4,2};
        System.out.println(findDuplicate(nums));
    }

    public static int findDuplicate(int[] nums){
        int i=0;
        while(i<nums.length){
            int correctIdx = nums[i]-1;
            if(nums[i] != nums[correctIdx]){
                swap(nums,i,correctIdx);
            }else{
                i++;
            }
        }

        for(int idx = 0;idx<nums.length;idx++){
            if(nums[idx] != idx+1){
                return nums[idx];
            }
        }
        return -1;
    }

    static void swap(int[] nums , int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] =  temp;
    }
}
