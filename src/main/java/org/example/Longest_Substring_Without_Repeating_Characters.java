package org.example;


import java.util.ArrayList;
import java.util.List;

public class Longest_Substring_Without_Repeating_Characters {

    public static void main(String[] args) {
        List<Character> chars = new ArrayList<>();
        if (!chars.isEmpty()) {
            System.out.println(m);
        }
    }

    public static int lengthOfLongestSubstring(String s) {
        int ans = 0;

        List<Character> chars = new ArrayList<>();

        for(Character c : s.toCharArray()) {
            if (!chars.isEmpty()) {
                chars.add(c);

            }
        }

        return ans;
    }

}
