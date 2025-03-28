package Strings;


public class Performance {
    
    public static void main(String[] args) {
        String series = "";
        for(int i=0;i<26;i++){
            char ch = (char)('a'+i);
            series = series + ch;
        }
        System.out.println(series);
    }

    //here wastage of  space is happening,means understand through example:
    // when loop runs, in 1st iteration , it will add 'a' to series then in 2nd iteration it will add 'b' to series and series become 'ab' and a is not pointed by any variable , because of which it wasting the space.

    // so to avoid this we can use StringBuilder class which is mutable and it will not create new string object
}
