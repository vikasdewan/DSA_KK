package InsertionSort;

import java.util.Arrays;

public class basic {
    public static void main(String[] args) {
        
        int[] arr = {3,2,6,4,9,23};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void insertion(int[] arr){

        for(int i=0;i<=arr.length-2;i++){ // i is less then n-2 because if suppose i=4 then j=i+1=5 which is out of bound situation , that's why i<=n-2
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    swap(arr, j, j-1);
                }else{
                    break;
                }
            }
        }
    }

    static void swap(int[] arr,int first ,int second){
        int temp = arr[first];
         arr[first]= arr[second];
        arr[second] = temp;
    }
}
