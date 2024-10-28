public class OrderAgnosticBS {
    public static void main(String[] args) {

    }

    public int binarySearch(int[] arr, int target, int start, int end) {

        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }

        }

        return -1;
    }
}
