package com.thanh.algorithms;

/**
 * @author thanh on 4/7/18
 */
public class QuickSort implements Sort {
    public void sort(int[] arr){
        if (arr == null || arr.length <= 0){
            return;
        }
        quickSort(arr, 0, arr.length - 1);
    }

    private void quickSort(int[] arr, int low, int high){
        if (low < high){
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);  // Before pi
            quickSort(arr, pi + 1, high); // After p
        }
    }

    private int partition(int[] arr, int low, int high){
        int pivot = arr[high];
        int i = low - 1;
        int temp;
        for (int j = low; j <= high - 1; j++){
            if (arr[j] <= pivot){
                i++;
                // Swap
                temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        temp = arr[i+1];
        arr[i+1] = pivot;
        arr[high] = temp;
        return i + 1;
    }
}
