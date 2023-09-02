package org.example;


import java.util.*;

public class Longest_Substring_Without_Repeating_Characters {

    public static void main(String[] args) {

        String s = "pwwkew";
        int count = 0;

        Map<Character, Integer> map = new HashMap<>();

        for (Character c : s.toCharArray()) {
            if (map.containsKey(c)) {
                System.out.println(map.size());;
                break;
            }
            map.put(c, count);
        }

    }

    public static int lengthOfLongestSubstring(String s) {

        Set<Character> chars = new HashSet<>();

        for(Character c : s.toCharArray()) {
            chars.add(c);
        }

        return chars.size();
    }

}
