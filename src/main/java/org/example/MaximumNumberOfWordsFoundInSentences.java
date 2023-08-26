package org.example;

public class MaximumNumberOfWordsFoundInSentences {
    public static void main(String[] args) {
        String[] sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};

        int count = 0;
        int cds = 0;
        for (String c : sentences) {
            for (char ch : c.toCharArray()) {
                if (ch == ' ') {
                    count++;
                }
            }
            if (count > cds) {
                cds = count;
            }
        }
    }
    public static int mostWordsFound(String[] sentences) {
        int count = 0;
        int cds = 0;

        for (String c : sentences) {
            for (char ch : c.toCharArray()) {
                if (ch == ' ') {
                    count++;
                }
            }
            count++;
            if (count > cds) {
                cds = count;
            }
        }
        return cds;
    }
}
