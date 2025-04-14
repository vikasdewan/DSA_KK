package RecursionMisicllineous;

import java.lang.reflect.Array;
import java.util.Arrays;

public class bubbleSort {

    public static void main(String[] args) {

        int[] arr = { 4, 3, 2, 1 };
        System.out.println(Arrays.toString(sort(arr, 3, 0)));

    }

    static int[] sort(int[] arr, int r, int c) {
        if (r < 0) {
            return arr;
        }
        if (c < r) {
            if (arr[c] > arr[c + 1]) {
                int temp = arr[c];
                arr[c] = arr[c + 1];
                arr[c + 1] = temp;
            }
            return sort(arr, r, c + 1);
        } else {
            return sort(arr, r - 1, 0);
        }

    }
}
