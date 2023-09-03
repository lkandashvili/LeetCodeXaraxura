package org.example;


import java.util.*;

public class Longest_Substring_Without_Repeating_Characters {

    public static void main(String[] args) {

        String s = "dvdf";
        System.out.println(lengthOfLongestSubstring(s));
    }

    public static int lengthOfLongestSubstring(String s) {
        // dvdf //
        int ans = 0;
        char[] arr = s.toCharArray();

        for (int i=0; i < s.length(); i++) {
            for (int j=1; j < s.length(); j++) {
                if ( j < i) {
                    continue;
                }
                if (arr[i] != arr[j]) {
                    ans++;
                }
                j++;
            }
        }

        return ans;
    }

}
