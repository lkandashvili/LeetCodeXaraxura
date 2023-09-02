package org.example;


import java.util.*;

public class Longest_Substring_Without_Repeating_Characters {

    public static void main(String[] args) {

        String s = "bbbbb";
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
        // pwwkew //
        int count = 0;
        int n = 0;
        Map<Character, Integer> map = new HashMap<>();


        for(Character c : s.toCharArray()) {

            if (Character.isLetter(c)) {

                if (map.containsKey(c)) {
                    n = Math.max(n,count);
                    map.clear();
                    count = 0;
                    map.put(c,count);
                    count++;
                    continue;
                }

                map.put(c, count);
                count ++;
            }
        }
        return n;
    }

}
