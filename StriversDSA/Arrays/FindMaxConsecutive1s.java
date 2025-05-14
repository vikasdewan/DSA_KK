package StriversDSA.Arrays;

public class FindMaxConsecutive1s {
    
    public static void main(String[] args) {
     
        int[] nums = {1,1,0,1,1,1};
        int result = findMaxConsecutiveOnes(nums);
        System.out.println("Maximum consecutive 1s: " + result);
    }

    public static int findMaxConsecutiveOnes(int[] nums){
        int maxCount = 0;
        int currentCount = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1){
                currentCount++;
            } else {
                maxCount = Math.max(maxCount, currentCount);
                currentCount = 0;
            }
        }
        return Math.max(maxCount, currentCount);
    }
}
