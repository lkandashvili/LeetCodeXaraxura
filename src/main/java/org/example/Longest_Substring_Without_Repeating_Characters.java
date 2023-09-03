package org.example;


import java.util.*;

public class Longest_Substring_Without_Repeating_Characters {

    public static void main(String[] args) {

        String s = "pwwkew";
        System.out.println(lengthOfLongestSubstring(s));
    }

    public static int lengthOfLongestSubstring(String s) {
        // dvdf //
        int ans = 0;
        int max = 0;
        char[] arr = s.toCharArray();

        for (int i=0; i < s.length(); i++) {
            for (int j=1; j < s.length() & j < i; j++) {
                if (arr[i] == arr[j]) {
                    if (ans > max) {
                        max = ans;
                    }
                    ans = 0;
                    break;
                } else {
                    ans++;
                }
            }
        }
        return max;
    }

}
