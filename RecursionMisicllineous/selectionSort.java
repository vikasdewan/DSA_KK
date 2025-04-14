package RecursionMisicllineous;

import java.util.Arrays;

public class selectionSort {

    public static void main(String[] args) {
        int[] arr = { 4, 3, 2, 1 };
        sort(arr, 4, 0, 0);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr, int r, int c, int max) {
        if (r == 0) {
            return;
        }   

        if (c < r) {
            if (arr[max] < arr[c]) {
                sort(arr, r, c + 1, c);
            } else {
                sort(arr, r, c + 1, max);
            }
        } else {
            int temp = arr[max];
            arr[max] = arr[r - 1];
            arr[r - 1] = temp;

            sort(arr, r - 1, 0, 0);
        }
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }
}
