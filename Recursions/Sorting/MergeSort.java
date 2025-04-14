package Recursions.Sorting;

import java.util.*;

public class MergeSort {
    

    public static void main(String[] args) {
        
        int[] arr = {4,3,1,12,6,2,10};
        int[] sortedArr = mergeSort(arr);
        System.out.println(Arrays.toString(sortedArr));
    }

    static int[] mergeSort(int[] arr){
    if(arr.length <= 1){
        return arr;
    }
     int mid = arr.length/2;
     int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
     int[] right = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));

     return merge(left,right);

     
    }

    static int[] merge(int[] arr1 , int[] arr2){
        int[] merged = new int[arr1.length + arr2.length];
        int leftIndex = 0, rightIndex = 0, mergedIndex = 0;
        while(leftIndex < arr1.length && rightIndex < arr2.length){
            if(arr1[leftIndex]<arr2[rightIndex]){
                merged[mergedIndex++] = arr1[leftIndex];
                leftIndex++;
            }else{
                merged[mergedIndex++] = arr2[rightIndex];
                rightIndex++;
            }
        }

        while(leftIndex<arr1.length){
            merged[mergedIndex++] = arr1[leftIndex];
            leftIndex++;
        }
        while(rightIndex<arr2.length){
            merged[mergedIndex++] = arr2[rightIndex];
            rightIndex++;
        }

        return merged;

    }
}

