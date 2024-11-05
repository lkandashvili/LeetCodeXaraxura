package org.example;

public class Rotate_String {
    public static void main(String[] args) {
        System.out.println(rotateString("abcde", "abced"));
    }

    public static boolean rotateString(String s, String goal) {
        if ( s.length() != goal.length()) {
            return false;
        }
        return (s+s).contains(goal);
    }
}
