package org.example;

import java.util.ArrayList;
import java.util.List;

public class SubstractTheProductAndSumOfDigitsOfAnInteger {
    public static void main(String[] args) {

        System.out.println(subtractProductAndSum(234));



    }
        public static int subtractProductAndSum(int n) {
            List<Integer> productList = new ArrayList<>();
            int product = 1;
            int sum = 0;

            while (n > 0) {
                int x = n % 10;
                productList.add(x);
                sum = sum + x;
                n = n / 10;
            }
            while (productList.size() != 0) {
                product = product * productList.get(productList.size() - 1);
                productList.remove(productList.size() - 1);
            }
            return product - sum;
        }
}

