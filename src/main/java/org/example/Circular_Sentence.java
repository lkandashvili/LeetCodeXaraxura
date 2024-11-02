package org.example;

public class Circular_Sentence {
    public static void main(String[] args) {

        String rame = "Leetcode is cool";
        System.out.println(isCircularSentence(rame));

    }

    public static boolean isCircularSentence(String sentence) {

        char c = sentence.charAt(0);
        if (c != sentence.charAt(sentence.length() - 1)) {
            return false;
        }

        for (int i = 1; i < sentence.length(); i++) {

         if (sentence.charAt(i) == ' '){
             if (sentence.charAt(i-1) != sentence.charAt(i+1)){
                 return false;
             }
         }
        }
        return true;

    }
}
