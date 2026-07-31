package sorting;

/**
 * Quick Sort - Divide and Conquer sorting algorithm using a pivot.
 * Time Complexity: O(n log n) average, O(n^2) worst case
 * Space Complexity: O(log n) due to recursion stack
 */
public class QuickSort {

    public static void sort(int[] arr) {
        if (arr == null || arr.length < 2) return;
        quickSort(arr, 0, arr.length - 1);
    }

    private static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return i + 1;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void demo() {
        int[] arr = {10, 7, 8, 9, 1, 5};
        System.out.println("Before: " + java.util.Arrays.toString(arr));
        sort(arr);
        System.out.println("After:  " + java.util.Arrays.toString(arr));
    }
}
