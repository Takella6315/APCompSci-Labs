/**
 * 
 * This program uses binary and linear search to find the Key in the array. It then prints out the elapsed time. 
 * @author Teja Akella
 */
import java.util.Arrays;

public class Unit15Lab1Part2 {
    
    public static void main(String[] args) {
        int[] array = generateSortedArray(50000000);
        
        System.out.println("Case 1:Random key existing in an array");
        // Test case 1: key exists in the array
        int key1 = array[2345678];
        long startTime = System.nanoTime();
        int linearResult = linearSearch(array, key1);
        long elapsedTime = System.nanoTime() - startTime;
        System.out.printf(" Linear search completed in: %d nanoseconds\n", elapsedTime);
        
        startTime = System.nanoTime();
        int binaryResult = binarySearch(array, key1);
        elapsedTime = System.nanoTime() - startTime;
        System.out.printf(" Binary search completed in: %d nanoseconds\n", elapsedTime);
        
        System.out.println("Testing search on a sorted array with 100000000 elements");
        // Test case 2: key does not exist in the array
        int key2 = -1234;
        startTime = System.nanoTime();
        linearResult = linearSearch(array, key2);
        elapsedTime = System.nanoTime() - startTime;
        System.out.printf(" Linear search completed in: %d nanoseconds\n", elapsedTime);
        
        startTime = System.nanoTime();
        binaryResult = binarySearch(array, key2);
        elapsedTime = System.nanoTime() - startTime;
        System.out.printf(" Binary search completed in: %d nanoseconds\n", elapsedTime);
    }
    
    public static int[] generateSortedArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        Arrays.sort(array);
        return array;
    }
    
    public static int linearSearch(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i;
            }
        }
        return -1;
    }
    
    public static int binarySearch(int[] array, int key) {
        int low = 0;
        int high = array.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (array[mid] == key) {
                return mid;
            } else if (array[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}
