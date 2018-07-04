package com.thanh.algorithms;

import org.junit.Assert;
import org.junit.Test;

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
        Assert.assertEquals(arr.length, expected.length);
        for (int i = 0; i < arr.length; i++){
            Assert.assertEquals(arr[i], expected[i]);
        }
    }
}
