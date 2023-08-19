package org.example;

import java.util.ArrayList;
import java.util.List;

public class KidsWithTheGreatestNumberOfCandies {

    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        System.out.println(kidsWithCandies(candies, 3));
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> out = new ArrayList<>();
        int greatest = candies[0];

        for (int k : candies) {
            if (k > greatest) {
                greatest = k;
            }
        }

        for (int i=0; i < candies.length -1; i++) {

            if (candies[i] + extraCandies >= greatest) {
                out.add(true);
            } else {
                out.add(false);
            }

        }

        return out;

    }
}
