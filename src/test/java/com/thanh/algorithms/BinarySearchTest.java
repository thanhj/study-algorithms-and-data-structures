package com.thanh.algorithms;

import org.junit.Assert;
import org.junit.Test;

public class BinarySearchTest {

    private BinarySearch search = new BinarySearch();

    @Test
    public void test_binaryRecursiveSearch(){
        int[] array = new int[]{1,4,5,6,7,10,100,102,288,300};
        int x = 102;
        Assert.assertEquals(search.binaryRecursiveSearch(array, x), 7);
    }

    @Test
    public void test_binaryIterativeSearch(){
        int[] array = new int[]{1,4,5,6,7,10,100,102,288,300};
        int x = 102;
        Assert.assertEquals(search.binaryIterativeSearch(array, x), 7);
    }

}
