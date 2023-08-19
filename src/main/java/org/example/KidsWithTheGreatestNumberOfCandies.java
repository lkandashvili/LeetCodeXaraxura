package org.example;

import java.util.ArrayList;
import java.util.List;

public class KidsWithTheGreatestNumberOfCandies {

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> out = new ArrayList<>();
        int greatest = candies[0];
        for (int i=0; i < candies.length -1; i++) {
            for (int j=1; j < candies.length; j++) {

                if (candies[i] + candies[j] + extraCandies >= greatest) {
                    out.add(true);
                } else {
                    out.add(false);
                }
            }
        }

        return out;
    }
}
