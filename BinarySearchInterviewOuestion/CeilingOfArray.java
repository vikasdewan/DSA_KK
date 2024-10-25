import java.util.*;



public class CeilingOfArray {


    public static int binarySearch(int [] arr,int target){
        int start=0;
        int end = arr.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid]== target){
                return mid;
            }
            else if(arr[mid]>target){
                end = mid-1;
            }

            else if(arr[mid]<target){
                start = mid+1;
            }
        }
        return start;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {1,3,6,7,9,12,15,20};


        
        System.out.println("enter the target to search ");
        int  target = sc.nextInt();
        
        int ans = binarySearch(arr, target);
        System.out.println("ceiling of the target element " + target + " is  found at index " + ans);

         

        sc.close();
    }
}
