package org.example;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Longest_Substring_Without_Repeating_Characters {

    public static void main(String[] args) {

        String s = "pwwkew";

        Set<Character> chars = new HashSet<>();
        for (Character c : s.toCharArray()) {
            chars.add(c);
        }


        for (char g : chars) {
            System.out.println(g);
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
