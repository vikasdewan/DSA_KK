package first;
import java.util.Scanner;


public class firstprog {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int num = 12_00_000;//by default
        System.out.println(num);
        char initials = 'v';
        float decimal = 23.32f;
        double bigfloat = 123124321341.343434;//by default
        long bigint = 123123123421342342L;
        System.out.println("enter the name :  ");
        String name = sc.nextLine();
        System.out.println("hello World \nmy name is " +name);
    }
}