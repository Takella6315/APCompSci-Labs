/**
 * 
 * This program uses selection sort and insertion sort to sort the arrays and then prints the elapsed times
 * @author Teja Akella
 */
import java.util.Arrays;

public class Unit15Lab1Part1 {

    public static void selectionSort(int[] arr) {
        
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void insertionSort(int[] arr) {
        
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {5, 2, 7, 3, 6, 1, 4};
        int[] arr2 = Arrays.copyOf(arr1, arr1.length);
        System.out.println("Case 1: Random data");
        // Sorting random data with selection sort
        long startTime = System.nanoTime();
        selectionSort(arr1);
        long elapsedTime = System.nanoTime() - startTime;
        System.out.printf(" Selection sort on random data completed in: %d nanoseconds\n", elapsedTime);

        // Sorting random data with insertion sort
        startTime = System.nanoTime();
        insertionSort(arr2);
        elapsedTime = System.nanoTime() - startTime;
        System.out.printf(" Insertion sort on random data completed in: %d nanoseconds\n", elapsedTime);

        System.out.println("Case 2: Decreasing data (100, 99, 98, ...)");
        // Sorting decreasing data with selection sort
        arr1 = new int[] {7, 6, 5, 4, 3, 2, 1};
        arr2 = Arrays.copyOf(arr1, arr1.length);
        startTime = System.nanoTime();
        selectionSort(arr1);
        elapsedTime = System.nanoTime() - startTime;
        System.out.printf(" Selection sort on decreasing data completed in: %d nanoseconds\n", elapsedTime);

        // Sorting decreasing data with insertion sort
        startTime = System.nanoTime();
        insertionSort(arr2);
        elapsedTime = System.nanoTime() - startTime;
        System.out.printf(" Insertion sort on decreasing data completed in: %d nanoseconds\n", elapsedTime);

        System.out.println("Case 3: Sorted data (1, 2, 3, ...)");
        // Sorting sorted data with selection sort
        arr1 = new int[] {1, 2, 3, 4, 5, 6, 7};
        arr2 = Arrays.copyOf(arr1, arr1.length);
        startTime = System.nanoTime();
        selectionSort(arr1);
        elapsedTime = System.nanoTime() - startTime;
        System.out.printf(" Selection sort on sorted data completed in: %d nanoseconds\n", elapsedTime);

        // Sorting sorted data with insertion sort
        startTime = System.nanoTime();
        insertionSort(arr2);
        elapsedTime = System.nanoTime() - startTime;
        System.out.printf(" Insertion sort on sorted data completed in: %d nanoseconds\n", elapsedTime);
    }
}
