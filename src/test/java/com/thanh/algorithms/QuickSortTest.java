package com.thanh.algorithms;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * @author thanh on 4/7/18
 */
public class QuickSortTest {
    Sort quickSort = new QuickSort();

    @Test
    public void test_1(){
        int[] arr = new int[]{1,4,7,2,3};
        quickSort.sort(arr);
        int[] expected = new int[]{1,2,3,4,7};
        assertEquals(arr.length, expected.length);
        for (int i = 0; i < arr.length; i++){
            assertEquals(arr[i], expected[i]);
        }
    }
}
