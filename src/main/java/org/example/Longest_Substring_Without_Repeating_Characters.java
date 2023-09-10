package org.example;


import java.util.*;

public class Longest_Substring_Without_Repeating_Characters {

    public static void main(String[] args) {

        String s = "pwwkew";


        System.out.println(lengthOfLongestSubstring(s));
    }

    public static int lengthOfLongestSubstring(String s) {

        int max = 0;
        StringBuilder stringBuilder = new StringBuilder();
        HashSet<Character> hashSet = new HashSet<>();

        for (Character c : s.toCharArray()) {
            if (hashSet.contains(c)) {
                max = Math.max(max,hashSet.size());
                hashSet.clear();
            }else {
                max++;
            }
            hashSet.add(c);
        }
        return max;
    }

}
