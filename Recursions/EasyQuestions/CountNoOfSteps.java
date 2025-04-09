//https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/description/

package Recursions.EasyQuestions;

public class CountNoOfSteps {
    

    public static void main(String[] args) {
        
        System.out.println(numberOfSteps(14));
    }


    static int numberOfSteps(int num) {
       
        return helper(num  , 0);
    }

   static int helper(int num , int count){
     if(num == 0){
            return count;
        }

        if(num % 2 == 0 ){
            num = num/2;
            count++;
        }else{
            num--;
            count++;
        }
        return helper(num,count);
   }
}
