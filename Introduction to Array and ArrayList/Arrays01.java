import java.util.*;
public class Arrays01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array elements");
        String [] arr = new String[5];
        for(int i=0;i<=4;i++){
            String inp = sc.next();
            arr[i] = inp;
        }

        System.out.println("array elements are : ");
        System.out.println(Arrays.toString(arr));
        // for(int i=0;i<4;i++){
        //   System.out.println(arr[i]);
        // }
        
    }
}
