//https://leetcode.com/problems/search-in-rotated-sorted-array/description/


public class SearchInRotatedArray {
    public static void main(String[] args) {
        
        int [] nums = {4,5,6,7,0,1,2};
        int target = 0;
        int ans =  search(nums, target);
        if(ans !=-1){
            System.out.println(ans);
        }
        else{
            System.out.println("element not found");
        }

    }


      static int search(int[] nums, int target) {
           
        int pivot = findPivot(nums);
        int start = 0;
        int end = nums.length-1;

        int firstTry = binarySearch(nums, target, start, pivot); //one half before pivot

        if(firstTry !=-1){
        return firstTry;
        }
        return  binarySearch(nums, target, pivot+1, end); //other half after pivot

    }

    //not work in duplicated elements in the array
    static  int findPivot(int [] arr){
        int start = 0;
        int end =  arr.length - 1;

        while(start<end){
            int mid = start + (end - start) / 2;

            if(arr[mid] > arr[mid+1]){
                //you are in dec part of mountain array
            //this may be a ans but  we need to check for other part of array
            // that is why end != mid-1;
            //because we don't no that mid-1 element is small or greater than mid;
                end = mid;
            }
            else{
                start = mid+1; //because we know that mid element is less than mid+1 element
            }
            //in the end start == end , pointing to the peak element 
        }
        return end;
    } 


    static int binarySearch(int[] arr,int target ,int start ,int end){
        
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

             
            if (arr[mid] == target) {
                return mid;
            }
            
            if(isAsc){
                if (target < arr[mid]) {
                   end = mid - 1;
               } else {
                   start = mid + 1;
               }
            }
            else{
                if(target> arr[mid]){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }

        }

        return -1;
    }
}
