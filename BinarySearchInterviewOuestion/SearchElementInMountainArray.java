//https://leetcode.com/problems/find-in-mountain-array/description/
//not submitted now as it require some modification related to interface
//change it later when learned OOP


public class SearchElementInMountainArray {
    public static void main(String[] args) {
        
    }

    int search(int[] arr,int target){
        int peak = peakIndexInMountainArray(arr);
        int firstTry = oderAgnosticBS(arr, target, 0, peak);
        if(firstTry !=-1){
            return firstTry;
        }

        //try in second half
        return oderAgnosticBS(arr, target, peak+1, firstTry);
    }

    public  int peakIndexInMountainArray(int [] arr){
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


    static int oderAgnosticBS(int[] arr, int target, int start, int end) {

        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = (start + end) / 2;

             
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
