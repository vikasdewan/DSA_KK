package Recursions;

public class BinarySearch {
    
    public static void main(String[] args) {
        
        int arr[] = {2,6,9,13,14};
        int target = 11;
        int result = BS(arr, 0, arr.length-1, target);

        if(result==-1){System.out.println("element not found");}
        else{
            System.out.println("Element found at index "+result);
        }
    }

    static int BS(int[] arr, int left ,int right , int target){
        if(left > right) return -1;
        int mid = (left + right) / 2;
        if(arr[mid] == target){
            return mid;
        }
        else if(arr[mid] > target){
            return BS(arr,left,mid-1,target);
        }
        else if(arr[mid] < target){
            return BS(arr,mid+1,right,target);
        }

        return -1;
    }
}
