package Strings;

public class Comparision{

    public static void main(String[] args) {
        
        String a = "vikas";
        String b = "vikas";
        String c = new String("vikas");
        String d = new String("vikas");
        String e = new String(" vikas ");

        System.out.println(a==b);
        System.out.println(a==c);
        System.out.println(a==d);
        System.out.println(c==d);
        System.out.println(c.equals(d));
        System.out.println(c.equals(e));

        System.out.println(a.charAt(2));

        
    }
}