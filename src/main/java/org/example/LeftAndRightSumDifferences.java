package org.example;

public class LeftAndRightSumDifferences {
    public int[] leftRightDifference(int[] nums) {

        int[] answer = new int[nums.length];

        if (nums.length > 1) {

            for (int i=0; i < nums.length; i++) {
                for (int j=0; j < nums.length; j++) {
                    answer[i] = nums[i];
                }
            }

        }else {
            return new int[0];
        }


        return answer;
    }
}
