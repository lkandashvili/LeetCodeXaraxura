package org.example;


import java.util.*;

public class Longest_Substring_Without_Repeating_Characters {

    public static void main(String[] args) {

        String s = "pwwkew";
        int count = 0;
        int n = 0;

        Map<Character, Integer> map = new HashMap<>();

        for (Character c : s.toCharArray()) {
            if (map.containsKey(c)) {
//                System.out.println(map.size());;
                break;
            }
            n++;
            map.put(c, count);
        }
        System.out.println(lengthOfLongestSubstring(s));

    }

    public static int lengthOfLongestSubstring(String s) {

        int count = 0;
        int n = 0;
        Map<Character, Integer> map = new HashMap<>();

        for(Character c : s.toCharArray()) {

            if (map.containsKey(c)) {
                continue;
            }

            map.put(c, count);
            n++;
            count ++;
        }

        return Math.max(n, count);
    }

}
