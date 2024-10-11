// given an array nums of intergers, return how many of them contain an even number of digits

public class array {
   
   static int evenNumDigitArray(int [] arr){
    int ans = 0;
    for(int i =0;i<arr.length;i++){
        int count = 0;
        while(arr[i] != 0){
            arr[i] = arr[i]/10;
           count++;
        }
        if(count%2 == 0){
            ans++;
        }
    }
    return ans;
   };
   
   
    public static void main(String[] args) {
     int [] arr = {1,231,1231,11,2,34,-87};
     System.out.println(evenNumDigitArray(arr));   
    
    }
}

    