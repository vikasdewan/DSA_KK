package Recursions;

public class fibonaciNumber {
    
    public static void main(String[] args) {
        
        int n= 10;
        for (int i = 0; i < n; i++) {
            System.out.print(fiboSeries(i) + " ");
        }
    }


    static int fiboSeries(int n){
        if(n<=1){
            return n;
        }
        else{
            return fiboSeries(n-1) + fiboSeries(n-2); 
        }
    }
}
