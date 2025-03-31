package Patterns;

public class solutions {

    public static void main(String[] args) {

        // pattern1(4);
        // pattern2(4);
        // pattern3(5);
        // pattern4(5);
        // pattern5(5);
        // pattern6(5);
        // pattern7(5);
        pattern8(5);
        // pattern17(5);
        // pattern28(10);
        // pattern30(5);
        // pattern31(2);

    }

    static void pattern1(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern3(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern4(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    static void pattern5(int n) {
        for (int row = 1; row < 2 * n; row++) {
            int col = row <= n ? row : 2 * n - row;
            for (int j = 1; j <= col; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern6(int n) {
        for (int row = 0; row < n; row++) {
            int noOfSpaces = n - row - 1;
            for (int i = 1; i <= noOfSpaces; i++) {
                System.out.print(" ");
            }
            for (int col = 0; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern7(int n) {
        for (int row = 0; row < n; row++) {

            for (int i = row; i >= 0; i--) {
                System.out.print(" ");
            }
            for (int col = n-row; col >= 1; col--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern8(int n) {
        for(int row=1;row<=n;row++){
          int noOfSpaces = n-row;
          for (int i = 0; i < noOfSpaces; i++) {
             System.out.print(" ");
          }
          int col = 2*row-1;
          for (int j = 0; j<col; j++) {
             System.out.print("*");
          }
          System.out.println();
        }
     }
    static void pattern17(int n) {
        for (int row = 1; row <= 2 * n - 1; row++) {
            int totalColInRow = row <= n ? row : 2 * n - row;
            int noOfSpaces = row < n ? n - row : row - n;
            for (int i = 0; i < noOfSpaces; i++) {
                System.out.print("  ");
            }
            for (int col = totalColInRow; col >= 1; col--) {
                System.out.print(col + " ");
            }

            for (int col = 2; col <= totalColInRow; col++) {
                System.out.print(col + " ");
            }

            System.out.println();
        }
    }

    static void pattern28(int n) {
        for (int row = 1; row < 2 * n; row++) {
            int totalColInRow = row <= n ? row : 2 * n - row;
            int noOfSpaces = row <= n ? n - row : row - n;
            for (int i = 0; i < noOfSpaces; i++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= totalColInRow; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern30(int n) {
        for (int row = 1; row <= n; row++) {

            int noOfSpaces = n - row;
            for (int i = 0; i < noOfSpaces; i++) {
                System.out.print("  ");
            }
            for (int col = row; col >= 1; col--) {
                System.out.print(col + " ");
            }

            for (int col = 2; col <= row; col++) {
                System.out.print(col + " ");
            }

            System.out.println();
        }
    }

    static void pattern31(int n) {
        int N = 2 * n;
        for (int i = 0; i <= N; i++) {
            for (int j = 0; j <= N; j++) {
                int atEveryIndex = Math.max(Math.max(i, j), Math.max(N - i, N - j));
                System.out.print(atEveryIndex + " ");
            }
            System.out.println();
        }

    }
}
