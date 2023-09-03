package org.example;


import java.util.*;

public class Longest_Substring_Without_Repeating_Characters {

    public static void main(String[] args) {

        String s = "bbbbb";
        System.out.println(lengthOfLongestSubstring(s));
    }

    public static int lengthOfLongestSubstring(String s) {
        // dvdf //
        int ans = 0;
        int max = 0;

        HashSet<Character> hashSet = new HashSet<>();
        char[] arr = s.toCharArray();

        for (int i=0; i < s.length(); i++) {
            if (!hashSet.contains(arr[i])) {
                hashSet.add(arr[i]);
            }else {
                if (max < hashSet.size()) {
                    max = hashSet.size();
                }
                i--;
                hashSet.clear();
            }
        }
        return max;
    }

}
