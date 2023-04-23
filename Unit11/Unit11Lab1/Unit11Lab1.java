
/**
 * The ArrayTools class provides a set of static methods operating on int arrays.
 * @author Teja Akella
 */
package Unit11.Unit11Lab1;

import java.util.Arrays;
import java.util.Random;

public class Unit11Lab1 {


    public static void main(String[] args) {

        
        Random rand = new Random();
        int n = 6;
        int[] data = new int[n];
        for (int i = 0; i < n; i++) {
            data[i] = rand.nextInt(11);
        }
        System.out.println("Array to be tested: " + Arrays.toString(data));
        System.out.println("minimum: " + minimum(data));
        System.out.println("maximum: " + maximum(data));
        System.out.println("minimumAt: " + minimumAt(data));
        System.out.println("maximumAt: " + maximumAt(data));
        System.out.println("average: " + average(data));
        int x = 7;
        int index = find(data, x);
        System.out.println("find " + x + ": " + index);
        shiftLeft(data);
        System.out.println("after shiftLeft " + Arrays.toString(data));
        shiftRight(data);
        System.out.println("after shiftRight " + Arrays.toString(data));
        int[] otherData = {2, 3, 2, 10, 0, 4};
        System.out.println("equals to " + Arrays.toString(otherData) + ": " + equals(data, otherData));
    }

    /**
     * Returns the minimum element of the given array.
     *
     * Complexity: this method iterates over the entire array, hence it requires
     * time proportional to the size of the array.
     *
     * @param data array whose minimum element is to be determined.
     * @return the minimum element of the given array.
     * @throws IllegalArgumentException if data contains no elements.
     */
    public static int minimum(int[] data) {
        if (data.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }
        int min = data[0];
        for (int i = 1; i < data.length; i++) {
            if (data[i] < min) {
                min = data[i];
            }
        }
        return min;
    }

    /**
     * Returns the maximum element of the given array.
     *
     * Complexity: this method iterates over the entire array, hence it requires
     * time proportional to the size of the array.
     *
     * @param data array whose maximum element is to be determined.
     * @return the maximum element of the given array.
     * @throws IllegalArgumentException if data contains no elements.
     */
    public static int maximum(int[] data) {
        if (data.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }
        int max = data[0];
        for (int i = 1; i < data.length; i++) {
            if (data[i] > max) {
                max = data[i];
            }
        }
        return max;
    }

    /**
     * Returns the index of the minimum element of the given array.
     *
     * Complexity: this method iterates over the entire array, hence it requires
     * time proportional to the size of the array.
     *
     * @param data array whose index of minimum element is to be determined.
     * @return the index of the minimum element of the given array.
     * @throws IllegalArgumentException if data contains no elements.
     */
    public static int minimumAt(int[] data) {
        if (data.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }
        int minIndex = 0;
        for (int i = 1; i < data.length; i++) {
            if (data[i] < data[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }

    /**
     * Returns the index of the maximum element of the given array.
     *
     * Complexity: this method iterates over the entire array, hence it requires
     * time proportional to the size of the array.
     *
     * @param data array whose index of maximum element is to be determined.
     * @return the index of the maximum element of the given array.
     * @throws IllegalArgumentException if data contains no elements.
     */
    public static int maximumAt(int[] data) {
        if (data.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }
        int maxIndex = 0;
        for (int i = 1; i < data.length; i++) {
            if (data[i] > data[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }
    
    /**
     * Returns the average of the elements in the given array.
     *
     * Complexity: this method iterates over the entire array, hence it requires
     * time proportional to the size of the array.
     *
     * @param data the array of integers whose average is to be calculated.
     * @return the average of the elements in the given array, or 0 if the array is empty.
     * Precondition: data is not null.
     */
    public static double average(int[] data) {
        if (data.length == 0) {
            return 0.0;
        }
        double sum = 0;
        for (int i = 0; i < data.length; i++) {
            sum += data[i];
        }
        return sum / data.length;
    }
    /**
     * Returns the index of the first occurrence of the given value in the array,
     * or -1 if the value is not found.
     *
     * Complexity: this method iterates over the entire array, hence it requires
     * time proportional to the size of the array.
     *
     * @param data the array of integers to search in.
     * @param value the value to search for.
     * @return the index of the first occurrence of the given value in the array,
     *         or -1 if the value is not found.
     * Precondition: data is not null.
     */
    public static int find(int[] data, int value) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == value) {
                return i;
            }
        }
        return -1;
    }
    /**
     * Shifts the elements in the given array one position to the left.
     *
     * Complexity: this method iterates over the entire array, hence it requires
     * time proportional to the size of the array.
     *
     * @param data the array of integers to shift.
     * Precondition: data is not null.
     */
    public static void shiftLeft(int[] data) {
        if (data.length > 1) {
            int first = data[0];
            for (int i = 1; i < data.length; i++) {
                data[i - 1] = data[i];
            }
            data[data.length - 1] = first;
        }
    }

    /**
     * Shifts the elements in the given array one position to the right.
     *
     * Complexity: this method iterates over the entire array, hence it requires
     * time proportional to the size of the array.
     *
     * @param data the array of integers to shift.
     * Precondition: data is not null.
     */
    public static void shiftRight(int[] data) {
        if (data.length > 1) {
            int last = data[data.length - 1];
            for (int i = data.length - 1; i > 0; i--) {
                data[i] = data[i - 1];
            }
            data[0] = last;
        }
    }
    /**
     * Compares two arrays of integers and returns true if they have the same elements in the same order.
     *
     * Complexity: this method iterates over the entire arrays, hence it requires
     * time proportional to the size of the arrays.
     *
     * @param a the first array of integers to compare.
     * @param b the second array of integers to compare.
     * @return true if the arrays have the same elements in the same order, false otherwise.
     * Precondition: a and b are not null.
     */
    public static boolean equals(int[] a, int[] b) {
        if (a.length != b.length) {
            return false;
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }

}
