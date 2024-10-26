import java.util.Scanner;

public class floorOfArray {

    public static int CeilingbinarySearch(int[] arr, int target) {

        if (target < arr[0]) {
            return -1;
        }

        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                end = mid - 1;
            }

            else if (arr[mid] < target) {
                start = mid + 1;
            }
        }
        return end;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = { 2, 3, 6, 7, 9, 12, 15, 20 };

        System.out.println("enter the target to search ");
        int target = sc.nextInt();

        int ans = CeilingbinarySearch(arr, target);
        if (ans == -1) {
            System.out.println("target element (or Floor of that target element) " + target + " is  not found ");
        } else {
            System.out.println(
                    " target element(or floor of that target element) " + target + " is  found at index " + ans);
        }

        sc.close();
    }
}
