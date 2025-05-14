package StriversDSA.Arrays;

public class CheckArraySorted {
    
    public static void main(String[] args) {
        
        int[] arr = {1, 2, 3, 4, 5};
        boolean isSorted = checkSorted(arr);
        if(isSorted){
            System.out.println("The array is sorted.");
        } else {
            System.out.println("The array is not sorted.");
        }
    }
    
    public static boolean checkSorted(int[] arr){
        int n = arr.length;
        int pointer = 0;
        while(pointer < n-1){
            if(arr[pointer] > arr[pointer + 1]){
                return false;
            }
            pointer++;
        }
        return true;
    }
}
