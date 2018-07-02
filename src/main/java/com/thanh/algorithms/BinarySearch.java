package com.thanh.algorithms;

import java.io.IOException;

/**
 *
 */
public class BinarySearch {

    /**
     *
     * @param array: must be in sorted form.
     * @param x: search value
     * @return
     */
    public int binaryRecursiveSearch(int[] array, int x){
        return binaryRecursiveSearch(array, 0, array.length - 1, x);
    }

    /**
     *
     * @param array: must be in sorted form.
     * @param left
     * @param right
     * @param x: search value
     * @return
     */
    private int binaryRecursiveSearch(int[] array, int left, int right, int x) {
        if (right >= left){
            int midIndex = (right + left) / 2;
            if (x == array[midIndex]){
                return midIndex;
            } else if (x > array[midIndex]){
                return this.binaryRecursiveSearch(array, midIndex + 1, right, x);
            } else {
                return this.binaryRecursiveSearch(array, left, midIndex - 1, x);
            }
        }
        return -1;
    }

    public int binaryIterativeSearch(int[] array, int x){
        int length = array.length, left = 0, right = length - 1;
        while (right >= left){
            int mid = (right + left) / 2;
            if (x == array[mid]){
                return mid;
            } else if (x > array[mid]){
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return  -1;
    }
}
