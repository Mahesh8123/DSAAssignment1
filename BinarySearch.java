public class BinarySearch {

    // Recursive method to perform binary search
    public static int binarySearch(int[] arr, int left, int right, int target) {
        // Base case: If the search range is invalid
        if (left > right) {
            return -1; // Target not found
        }

        // Find the middle element
        int mid = left + (right - left) / 2;

        // If the target is found at the middle
        if (arr[mid] == target) {
            return mid; // Return the index of the target
        }

        // If the target is smaller than the middle element, search in the left half
        if (arr[mid] > target) {
            return binarySearch(arr, left, mid - 1, target);
        }

        // If the target is larger than the middle element, search in the right half
        return binarySearch(arr, mid + 1, right, target);
    }
}
