import java.util.*;

// here the 2d matrix is sorted in row wise and column wise i.e  arr {{1,2,3} , {4,5,6},{7,8,9}};

public class SearchIn2DMatrix {

    public static int[] Searching(int[][] arr, int target) {
        int j = arr.length - 1;
        int i = 0;
        while (j != -1 && i < arr.length) {

            if (arr[i][j] == target) {
                return new int[] { i, j };
            } else if (arr[i][j] > target) {
                j--;
            } else {
                i++;
            }
        }
        return new int[] { -1, -1 };
    }

    public static void main(String[] args) {
        int[][] arr = {
                { 10, 20, 30, 40},
                { 15, 25, 36, 45},
                { 27, 28, 39, 49},
                { 33, 34, 38, 50}
        };
        int target = 49;
        int[] targetIndex = Searching(arr, target);

        if (targetIndex[0] != -1) {
            System.out.println(
                    "Target = " + target + " found at index = [" + targetIndex[0] + "," + targetIndex[1] + "]");
        } else {
            System.out.println("Target = " + target + " not found in the array");
        }
    }
}