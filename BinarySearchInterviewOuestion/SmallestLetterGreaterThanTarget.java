public class SmallestLetterGreaterThanTarget {

    public static char nextGreatestLetter(char[] arr, char target) {
        int start = 0;
        int end = arr.length - 1;

        // If the target is greater than or equal to the last element
        if (target >= arr[end]) {
            return arr[0]; // Wrap around to the first element
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1; // Move left
            } else {
                start = mid + 1; // Move right
            }
        }
        return arr[start % arr.length]; // Return the next greatest character
    }
}
