package Recursions.ArrayQuestions;

import java.util.*;



public class linearSearch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,3,5,8,11,15};
        int[] arr2 = {1,3,5,6,7,7,3,6,7,11};
       System.out.println("enter the target : ");
       int target = sc.nextInt();
        if(search(arr,0,target) == -1){
            System.out.println("target not found");
        }else{
            System.out.println("element found at index : " + search(arr,0,target));
        }
       
       System.out.println(searchAll(arr2, 0, target,new ArrayList<>()));
        
         
    }

    private static void searchAll(int[] arr2, int idx, int target, int i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'searchAll'");
    }

    static int search(int[] arr,int ptr,int target){
        if(ptr == arr.length){
            return -1;
        }
        if(arr[ptr] == target ){
            return ptr;
        }
        return search(arr,ptr+1,target);
    }

    //for multiple occernce of the targeted element.
 
  static ArrayList<Integer> searchAll(int[] arr,int idx,int target,ArrayList<Integer> list){
        if(idx == arr.length){
            return list;
        }
        if(arr[idx] == target ){
           list.add(idx);
        }
       return searchAll(arr, idx+1, target,list);
    }
}
