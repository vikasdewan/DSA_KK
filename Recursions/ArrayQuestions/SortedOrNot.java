package Recursions.ArrayQuestions;

public class SortedOrNot {
    
    public static void main(String[] args) {
        int[] arr = {1,3,7,9,11};
        int[] arr2 = {3,7,8,11,7,22};
        System.out.println(isSorted(arr, 0 ));
        System.out.println(isSorted(arr2, 0));
    }

    static boolean isSorted(int[] arr,int ptr){
        if(ptr==arr.length-1){
            return true;
        }
        if(arr[ptr]<arr[ptr+1]){
            return isSorted(arr,ptr+1);
        }

        return false;
    }
    
}
