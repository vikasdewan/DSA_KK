import java.util.*;

 public class basics{


    static void binarySearch(int[] arr, int target){
        int start = 0;
        int flag =0;
        int end = arr.length-1;

        while(start<= end){
            int mid = (start+end)/2;
            if(arr[mid] == target){
               flag = 1;
                System.out.println("element found at index " + mid);
                return ;
            }
            else if(target < arr[mid]){
                end = mid -1;
            }
            else if(target > arr[mid]){
                start = mid+1;
            }

        }
        if(flag == 0){
            System.out.println("element not found");
        }
         
        
    }

    public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int[] arr = {2,4,6,8,10,15,25,50,60,70};
            System.out.println("enter the target element");
            int target = sc.nextInt();
             binarySearch(arr,target);


             
    }
 }