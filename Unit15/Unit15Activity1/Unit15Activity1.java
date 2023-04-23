/**
 * This program uses insertion and selection sort to sort an array
 * 
 */
package Unit15.Unit15Activity1;

import java.util.Arrays;

public class Unit15Activity1 {
  
    public static void main(String[] args) {
        int[] arr = {6, 10, 1, 3, 2, 0};
        System.out.println("Array before sorting: " + Arrays.toString(arr));
        insertionSort(arr);
        System.out.println("Array after sorting with insertion sort: " + Arrays.toString(arr));
       
        int[] arr2 = {6, 10, 1, 3, 2, 0};

        System.out.println("Array before sorting: " + Arrays.toString(arr2));
        selectionSort(arr2);
        System.out.println("Array after sorting with selection sort: " + Arrays.toString(arr2));
    }
    
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }
    }    

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }
    

    
    

}
