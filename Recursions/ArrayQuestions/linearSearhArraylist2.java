package Recursions.ArrayQuestions;

import java.util.ArrayList;
import java.util.Scanner;

public class linearSearhArraylist2 {
    
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int[] arr = {1,3,5,8,11,15};
        int[] arr2 = {1,3,5,6,7,7,3,6,11};
       System.out.println("enter the target : ");
       int target = sc.nextInt();

       System.out.println(search3(arr2, target, 0));
    }


    static ArrayList<Integer> search3(int[] arr,int target, int idx){
        ArrayList<Integer> list = new ArrayList<>();
        if(idx == arr.length){
            return list;
        }
        if(arr[idx] == target){
            list.add(idx);
        }

        ArrayList<Integer> ansFromBelowCalls = search3(arr, target, idx+1);
        list.addAll(ansFromBelowCalls);
        return list;
    }

}
