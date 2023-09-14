package org.example;

public class Jewels_And_Stones {
    public static int numJewelsInStones(String jewels, String stones) {
        int res = 0;

        for (Character c : stones.toCharArray()) {
            for (Character cJ : jewels.toCharArray()) {
                if (cJ == c) {
                    res++;
                }
            }
        }

        return res;
    }
}
