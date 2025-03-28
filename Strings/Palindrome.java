package Strings;

public class Palindrome {
    
    public static void main(String[] args) {
            
        String str = "madam";
        System.out.println(isPalindrome(str));

    }

    static boolean isPalindrome(String str){

        StringBuilder SB = new StringBuilder(str);
        int start = 0;
        int end = str.length()-1;

        while(end>=start){
            if(SB.charAt(start) == SB.charAt(end)){
                start++;
                end--;
            }else{
                break;
            }

        }

        if(end<start){
            return true;
        }

        return false;
    }
}
