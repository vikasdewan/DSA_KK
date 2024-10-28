import java.util.*;

public class CeilingOfArray {

    public static int CeilingbinarySearch(int[] arr, int target) {

        if (target > arr[arr.length - 1]) {
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
        return start;
    }

    public int[] searchRange(int[] nums, int target) {

        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (target == nums[mid]) {
                if (target == nums[mid - 1]) {
                    return new int[] { mid - 1, mid };
                } else if (target == nums[mid + 1]) {
                    return new int[] { mid, mid + 1 };
                }
            }

            else if (target < nums[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return new int[] { -1, -1 };
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = { 1, 3, 6, 7, 9, 12, 15, 20 };

        System.out.println("enter the target to search ");
        int target = sc.nextInt();

        int ans = CeilingbinarySearch(arr, target);

        if (ans == -1) {
            System.out.println(" target element(or ceiling) " + target + " is not found");
        } else {
            System.out.println(" target element(ceiling) " + target + " is  found at index " + ans);
        }

        sc.close();
    }
}
