package org.example;

public class SubstractTheProductAndSumOfDigitsOfAnInteger {
    public static void main(String[] args) {

        System.out.println(subtractProductAndSum(234));

        int n = 234;

        int product = 1;
        int sum = 0;
        int x = 5;


//        while (n % (Math.pow(10,x)) != 0) {
//
//        }
    }
        public static int subtractProductAndSum(int n) {
            int product = 1;
            int sum = 0;
            int x = 1;

            while (n % ((int) Math.pow(10,x)) != 0 && n % ((int) Math.pow(10,x)) < n) {
                product = (int) (product * n % (Math.pow(10,x)));
                sum = (int) (sum + n % (Math.pow(10,x)));
                x++;
            }
            return product - sum;
        }
}

