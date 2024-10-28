//https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/

public class posOfElementInSortedInfiniteArray {

    static int ans(int[] arr, int target) {

        // first find the range
        // first start with box size of 2
        int start = 0;
        int end = 1;

        // condition for the target to lie in the range

        while (target > arr[end]) {
            int temp = end + 1; // this is my new start
            end = end + (end - start + 1) * 2;
            start = temp;
        }

        return binarySearch(arr, target, start, end);
    }

    static int binarySearch(int[] arr, int target, int start, int end) {

        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == target) {

                return mid;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }

        return -1;
    }

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 23, 64, 67, 89, 233, 543, 666, 776, 876, 978 };

        int target = 10;

        int mainAns = ans(arr, target);

        if (mainAns != -1) {
            System.out.println("element found at index " + mainAns);
        } else {
            System.out.println("element not found");
        }

    }
}
