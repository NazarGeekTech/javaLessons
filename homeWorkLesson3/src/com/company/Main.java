package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    //    declared global array that can access from everywhere;
    static double[] has15Elements = {12.34, 34.34, -34.4, 23.32, 89.90, -56.65, 95.89, -1233.45, 577.45, 2346.34, 387.23, 52.43, 3234.23, 245.64, 236.78};

    public static void main(String[] args) {
        // write your code here
        double positiveCount = 0;
        for (double i : has15Elements) {
            if (i < 0) {
                positiveCount++;
                continue;
            }
            System.out.println(positiveCount += i);
        }
        System.out.println("Here are average numbers of positive down below ");
        System.out.println(positiveCount / 12);

        // additional homeWork
        Arrays.sort(has15Elements);
        System.out.println(Arrays.toString(has15Elements));
    }


}
