package Unit16.Unit16Activity1;

import java.util.Arrays;

public class Unit16Activity1 {
    
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }
    
    public static void merge(int[] arr, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];
        int i = left, j = mid + 1, k = 0;
        
        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }
        
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        
        while (j <= right) {
            temp[k++] = arr[j++];
        }
        
        for (int p = 0; p < temp.length; p++) {
            arr[left + p] = temp[p];
        }
    }
    
    public static void main(String[] args) {
        int[] arr1 = new int[10000];
        int[] arr2 = new int[10000];
        int[] arr3 = new int[10000];
        int[] arr4 = new int[20000];
        int[] arr5 = new int[20000];
        int[] arr6 = new int[20000];
        
        // Generate arrays with random data
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = (int) (Math.random() * 10000);
        }
        for (int i = 0; i < arr4.length; i++) {
            arr4[i] = (int) (Math.random() * 10000);
        }
        
        // Generate arrays with decreasing data
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = arr1.length - i;
        }
        for (int i = 0; i < arr5.length; i++) {
            arr5[i] = arr4.length - i;
        }
        
        // Generate arrays with increasing data
        for (int i = 0; i < arr3.length; i++) {
            arr3[i] = i;
        }
        for (int i = 0; i < arr6.length; i++) {
            arr6[i] = i;
        }
        
        System.out.println("Testing merge sort on array with 10000 elements");
        long startTime = System.nanoTime();
        mergeSort(arr1, 0, arr1.length - 1);
        long elapsedTime = System.nanoTime() - startTime;
        System.out.printf("Case: Random data\nMerge sort completed in: %d nanoseconds\n", elapsedTime);
        
        System.out.println("Testing merge sort on array with 10000 elements");
        startTime = System.nanoTime();
        mergeSort(arr2, 0, arr2.length - 1);
        elapsedTime = System.nanoTime() - startTime;
        System.out.printf("Case: Decreasing data\nMerge sort completed in: %d nanoseconds\n", elapsedTime);
        
        System.out.println("Testing merge sort on array with 10000 elements");
        startTime = System.nanoTime();
        mergeSort(arr3, 0, arr3.length - 1);
        elapsedTime = System.nanoTime() - startTime;
        System.out.printf("Case: Increasing data\nMerge sort completed in: %d nanoseconds\n", elapsedTime);

        System.out.println();
        System.out.println("Testing merge sort on array with 20000 elements");
        startTime = System.nanoTime();
        mergeSort(arr4, 0, arr4.length - 1);
        elapsedTime = System.nanoTime() - startTime;
        System.out.printf("Case: Random data\nMerge sort completed in: %d nanoseconds\n", elapsedTime);
        
        System.out.println("Testing merge sort on array with 20000 elements");
        startTime = System.nanoTime();
        mergeSort(arr5, 0, arr5.length - 1);
        elapsedTime = System.nanoTime() - startTime;
        System.out.printf("Case: Decreasing data\nMerge sort completed in: %d nanoseconds\n", elapsedTime);
        
        System.out.println("Testing merge sort on array with 20000 elements");
        startTime = System.nanoTime();
        mergeSort(arr6, 0, arr6.length - 1);
        elapsedTime = System.nanoTime() - startTime;
        System.out.printf("Case: Increasing data\nMerge sort completed in: %d nanoseconds\n", elapsedTime);

        
    }
}
