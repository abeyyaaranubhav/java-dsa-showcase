package searching;

/**
 * Binary Search - Efficient search on a sorted array.
 * Time Complexity: O(log n)
 * Space Complexity: O(1) iterative
 */
public class BinarySearch {

    /**
     * @return index of target in arr, or -1 if not found. Array must be sorted.
     */
    public static int search(int[] arr, int target) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void demo() {
        int[] arr = {2, 5, 8, 12, 16, 23, 38, 45, 56, 72, 91};
        int target = 23;
        int result = search(arr, target);
        System.out.println("Array: " + java.util.Arrays.toString(arr));
        if (result != -1) {
            System.out.println("Element " + target + " found at index " + result);
        } else {
            System.out.println("Element " + target + " not found");
        }
    }
}
