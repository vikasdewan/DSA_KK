import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the name of any vegetable : ");
        String vegetables = sc.next();

        switch (vegetables) {
            case "carrot":
                System.out.println("red and sweet");
                break;
            case "tomato":
                System.out.println("red and sour");
                break;
            case "cabbage":
                System.out.println("green and fresh");
                break;
            default:
                System.out.println("not a vegetable");

        }

        System.out.println("enter the no. from 1 to 7 for day : ");
        int inp = sc.nextInt();

        switch (inp) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thurday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("enter a valid number");
        }

        switch (inp) {
            case 1, 2, 3, 4 -> System.out.println("weekdays");
            case 5, 6, 7 -> System.out.println("weekend");
            default -> System.out.println("enter a valid number");
        }

        // Nested Switch case

        System.out.println("enter the student id : ");
        int id = sc.nextInt();
        System.out.println("enter the brach of the student : ");
        String branch = sc.next();

        switch (id) {
            case 1:
                System.out.println("suraj kumar verma");
                break;
            case 2:
                System.out.println("ojaswat dixit");
                break;
            case 3:
                System.out.println("vikas dewangan");
                switch (branch) {
                    case "CSE":
                        System.out.println("CSE Department");
                        break;
                    case "IT":
                        System.out.println("IT Department");
                        break;
                    case "AI":
                        System.out.println("AI Department");
                        break;
                    case "DS":
                        System.out.println("DS Department");
                        break;
                    default:
                        System.out.println("department not mentioned");
                }
            default:
                System.out.println("enter the valid id of the student");
        }

    }

}
