import java.util.Scanner;

public class methods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Q: enter two no. from user and print the sum of no. utill
        // user say stop");
        // sum();
        System.out.println("enter your age : ");
        int age = sc.nextInt();
        System.out.println(vote(age));

    }

    static void sum() {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the first no. ");
        int a = sc.nextInt();
        System.out.println("enter the Second no. ");
        int b = sc.nextInt();
        int c = a + b;
        System.out.println("sum is : " + c);
    }

    static String vote(int age) {
        if (age >= 18) {
            return "You can vote";
        } else {
            return "You cannot vote";
        }
    }
}
