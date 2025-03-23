package BubbleSort;

import java.util.Arrays;

public class basic {
    
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort(int[] arr){
        boolean swapped;
        //run the steps n-1 times
        for(int i = 0; i<arr.length;i++){
            swapped = false;
            //for each step the max item will come to end to respective index
            for(int j=1 ; j<=arr.length-i-1 ; j++){
                if(arr[j-1]>arr[j]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                    swapped = true;
                }

            }

            // if you did not swap for a particular iteration then it means the array is sorted , then break the program 
            if(!swapped){    // !false = true;
                break;
            }
        }
    }
}
