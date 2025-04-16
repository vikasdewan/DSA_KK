package Recursions.Strings;

public class Stream {
    
    public static void main(String[] args) {
        
        String str = "bacacdab";
        skip("", str);
        String ans = skip(str);
        String ans2 = skipApple("helloApplefadsfasdgas");
        String ans3 = skipAppButNotApple("helloapphowareyouapple");
        System.out.println(ans);
        System.out.println(ans2);
        System.out.println(ans3);
    }

    static void skip(String p, String unP){
        if(unP.isEmpty()){
            System.out.println(p);
            return ;
        }

        char ch = unP.charAt(0);
        if(ch == 'a'){
            skip(p, unP.substring(1));
        }else{
            skip(p + ch, unP.substring(1));
        }
    }

    static String skip( String unP){
        if(unP.isEmpty()){
             return "";
        }
        
        char ch = unP.charAt(0);
        if(ch == 'a'){
         return skip( unP.substring(1));

        }else{
         return ch + skip( unP.substring(1));
        }
        
    }

    static String skipApple( String unP){
        if(unP.isEmpty()){
             return "";
        }
        if(unP.startsWith("Apple")){
         return skipApple( unP.substring(5));

        }else{
         return unP.charAt(0) + skipApple( unP.substring(1));
        }
        
    }

    static String skipAppButNotApple( String unP){
        if(unP.isEmpty()){
             return "";
        }
        if(unP.startsWith("app") && !unP.startsWith("apple")){
         return skipAppButNotApple( unP.substring(3));

        }else{
         return unP.charAt(0) + skipAppButNotApple( unP.substring(1));
        }
        
    }
}
