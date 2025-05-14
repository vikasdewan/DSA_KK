package StriversDSA.Arrays;

public class CheckArraySorted {
    
    public static void main(String[] args) {
        
        int[] arr = {7,8,9,10,1,2,3,4,5,6};
        boolean isSorted = checkSorted(arr);
        if(isSorted){
            System.out.println("The array is sorted.");
        } else {
            System.out.println("The array is not sorted.");
        }
    }
    
    public static boolean checkSorted(int[] arr){
        //for rotated sorted array

        int count = 0;
        int n = arr.length;
        for(int i = 0; i < arr.length; i++){
            // %n because whenever it goes at end index then 6 % 5 = 1 will start from index 1.
            // and will not throw Array Index out of bound
            if(arr[i] > arr[(i + 1) % n]){
                count++;
            }
            if(count > 1){
                return false;
            }
        }
        return true;
    }
}
