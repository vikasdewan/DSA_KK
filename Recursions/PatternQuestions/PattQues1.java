package Recursions.PatternQuestions;

public class PattQues1 {
    
    public static void main(String[] args) {
        

        System.out.println("pattern");
        p1(4);
    }
    
    static void p1(int r){
        if(r==0){
            return;
        }

        for(int i=0;i<r;i++){
            System.out.print("* ");
        }
        System.out.println();
        p1(r-1);
    }
}
