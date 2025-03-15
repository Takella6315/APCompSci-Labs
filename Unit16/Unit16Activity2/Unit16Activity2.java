/**
 * This program uses recursion to sort through different sets of arrays. 
 * @author Teja Akella
 * 
 */
package Unit16.Unit16Activity2;

import java.util.Arrays;

public class Unit16Activity2 {
    public static void main(String[] args) {
        int[] arr1 = {5, 2, 5, 0, 5, 3, 1, 4, 5, 9};
        System.out.println("Before sorting: " + Arrays.toString(arr1));
        insertionSortRecursive(arr1, arr1.length);
        System.out.println("After sorting: " + Arrays.toString(arr1));

        int[] arr2 = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        System.out.println("Before sorting: " + Arrays.toString(arr2));
        insertionSortRecursive(arr2, arr2.length);
        System.out.println("After sorting: " + Arrays.toString(arr2));

        int[] arr3 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Before sorting: " + Arrays.toString(arr3));
        insertionSortRecursive(arr3, arr3.length);
        System.out.println("After sorting: " + Arrays.toString(arr3));

        int[] arr4 = {7, 9, 9, 2, 5, 8, 8, 10, 8, 9, 1, 5, 10, 8, 10};
        System.out.println("Before sorting: " + Arrays.toString(arr4));
        insertionSortRecursive(arr4, arr4.length);
        System.out.println("After sorting: " + Arrays.toString(arr4));

        int[] arr5 = {15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        System.out.println("Before sorting: " + Arrays.toString(arr5));
        insertionSortRecursive(arr5, arr5.length);
        System.out.println("After sorting: " + Arrays.toString(arr5));

        int[] arr6 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
        System.out.println("Before sorting: " + Arrays.toString(arr6));
        insertionSortRecursive(arr6, arr6.length);
        System.out.println("After sorting: " + Arrays.toString(arr6));
    }

    public static void insertionSortRecursive(int[] arr, int n) {
        // Base case
        if (n <= 1) {
            return;
        }
 
        // Sort first n-1 elements recursively
        insertionSortRecursive(arr, n-1);

        // Insert the last element at its correct position
        int last = arr[n-1];
        int j = n-2;
        while (j >= 0 && arr[j] > last) {
            arr[j+1] = arr[j];
            j--;
        }
        arr[j+1] = last;

    }
}
