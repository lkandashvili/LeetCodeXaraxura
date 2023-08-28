package org.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Minimum_Sum_Of_Four_Digit_Number_after_Splitting_Digits {
    public static void main(String[] args) {
        System.out.println(minimumSum(4009));
    }
    public static int minimumSum(int num) {
        int firstPair = 0;
        int secondPair = 0;
        List<Integer> list = new ArrayList<>();

        while (num > 0) {
            int x = num % 10;
            list.add(x);
            num = num / 10;
        }
        Collections.sort(list);

        firstPair = firstPair + (list.get(0) * 10) + list.get(3);
        secondPair = secondPair + (list.get(1) * 10) + list.get(2);

        return firstPair + secondPair;
    }
}
