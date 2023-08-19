package org.example;

public class NumberOfGoodPairs {

    public static int numIdenticalPairs(int[] nums) {
        int ans = 0;

        for (int i=0; i < nums.length - 1 ; i++) {

            for (int j=1; j < nums.length; j++) {
                if ( nums[i] == nums[j] && i < j) {
                    ans++;
                }
            }
        }
        return ans;
    }
}
