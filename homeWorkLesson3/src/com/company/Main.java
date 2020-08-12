package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    //    declared global array that can access from everywhere;


    public static void main(String[] args) {
        // write your code here
        double[] has15Elements = {12.34, 34.34, -34.4, 23.32, 89.90, -56.65, 95.89, -1233.45, 577.45, 2346.34, 387.23, 52.43, 3234.23, 245.64, 236.78};
        boolean facedNegative = false;

        double summeryOfPositive = 0;
        int count = 0;
        double avarageSum = 0;

        for (double a : has15Elements) {
            if (a < 0) {
                facedNegative = true;
                continue;
            } else if (facedNegative && a > 0) {
                summeryOfPositive += a;
                count++;
            }
            avarageSum = summeryOfPositive / count;
        }
        System.out.println("here is the summery " + summeryOfPositive);
        System.out.println("here is a count  positive number " + count);
        System.out.println("here is a average number of out array " + avarageSum);


//        additional home Work
        for (int i = 0; i < has15Elements.length; i++) {
            double onTheTruck = has15Elements[i];
            int a = i - 1;
            while (a >= 0 && onTheTruck < has15Elements[a]) {
                has15Elements[a + 1] = has15Elements[a];
                a--;
            }
            has15Elements[a + 1] = onTheTruck;
            System.out.println(Arrays.toString(has15Elements));
        }


    }
}
