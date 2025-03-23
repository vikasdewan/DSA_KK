package SelectionSort;

import java.util.Arrays;

public class BasicSelectionSort {
    
    public static void main(String[] args) {
        
        int[] arr = {4,5,1,2,3};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }


    static void selectionSort(int[] arr){
        int n = arr.length;

        for(int i=0;i<n;i++){
            //find max item in the array
            int lastIdx = arr.length-i-1;
            int maxIdx = getMaxIndex(arr,0,lastIdx); 
             
            swap(arr,maxIdx,lastIdx);
        }
    }

    static void swap(int[] arr,int first ,int second){
        int temp = arr[first];
         arr[first]= arr[second];
        arr[second] = temp;
    }


    private static int getMaxIndex(int[] arr,int start , int end){
        int max = start;
        for(int i=start;i<=end;i++){
            if(arr[max]<arr[i]){
                max = i;
            }
        }
        return max;
    }
}
