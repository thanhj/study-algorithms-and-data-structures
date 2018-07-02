package com.thanh;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] pingPong(int[][] arr){
        int[] result = new int[] {0, 0};
        if (arr == null || arr.length <= 0){
            return result;
        }
        int numberOfPeople =  arr.length;
        int START_TIME = 9, END_TIME = 18;
        for (int i = START_TIME; i < END_TIME; i++){
            int numberOfAvailable = 0;
            for (int[] person : arr) {
                if (person.length == 2 && person[0] <= i && person[1] > i){
                    numberOfAvailable++;
                }
            }
            if (numberOfAvailable > 1 && numberOfAvailable <= 3){
                result[0]++;
            } else if (numberOfAvailable > 3){
                result[1]++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] arr = new int[][]{
                {9, 11}
                , {12, 14}
                , {13, 15}
                , {11, 18}
                , {14, 18}
                , {10, 14}
                , {15, 18}
        };
        int[] result = pingPong(arr);
        System.out.println("Result: " + result[0] + "," + result[1]);
    }
}
