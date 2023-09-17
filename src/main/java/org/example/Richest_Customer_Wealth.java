package org.example;

public class Richest_Customer_Wealth {
    public static int maximumWealth(int[][] accounts) {
        int res = 0;

        for (int i=0; i < accounts.length; i++) {
            int m = 0;
            for (int j=0; j < accounts[i].length; j++) {
                m = m + accounts[i][j];
            }
            if (m > res) {
                res = m;
            }
        }
        return res;
    }
}
