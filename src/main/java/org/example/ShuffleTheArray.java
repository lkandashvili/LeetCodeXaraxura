package org.example;

import java.util.Arrays;

public class ShuffleTheArray {
    public static void main(String[] args) {
        int[] nums = {1,1,2,2};
        int n = 2;
        System.out.println(Arrays.toString(shuffle(nums, n)));
    }
    public static int[] shuffle(int[] nums, int n) {
        int[] answer = new int[2*n];
        int k=0;
        int l=0;

        for (int i=0; i < nums.length; i++) {
            if (i==0 || i % 2 ==0) {
                answer[k] = nums[l];
                k++;
                l++;
            }else {
                answer[k] = nums[n];
                n++;
                k++;
            }
        }
        return answer;
    }
}