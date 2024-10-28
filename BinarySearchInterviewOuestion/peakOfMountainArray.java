//https://leetcode.com/problems/find-peak-element/description/

public class peakOfMountainArray {

    public static void main(String[] args) {

    }

    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) {
                // you are in dec part of mountain array
                // this may be a ans but we need to check for other part of array
                // that is why end != mid-1;
                // because we don't no that mid-1 element is small or greater than mid;
                end = mid;
            } else {
                start = mid + 1; // because we know that mid element is less than mid+1 element
            }
            // in the end start == end , pointing to the peak element
        }
        return end;
    }
}
