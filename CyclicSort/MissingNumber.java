//https://leetcode.com/problems/missing-number/

package CyclicSort;

public class MissingNumber {
    

    public static void main(String[] args) {
        int[] arr = {3,0,1};
        System.out.println(missingNumber(arr));
    }

      static  public int missingNumber(int[] nums) {
        int i=0;
            while(i<nums.length){
                int correctIdx = nums[i];
                if(nums[i]<nums.length && nums[i] != nums[correctIdx]  ){
                    int temp = nums[i];
                    nums[i] = nums[correctIdx];
                    nums[correctIdx] = temp;
                }else{ 
                    i++;
                }
            }
    
            for( i=0;i<nums.length;i++){
                if(nums[i] != i){
                    return i;
                }
            }
    
        return nums.length;
        }
    
    }

