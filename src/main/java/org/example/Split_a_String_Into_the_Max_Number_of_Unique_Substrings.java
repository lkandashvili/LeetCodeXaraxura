package org.example;

import java.util.HashSet;
import java.util.Set;

public class Split_a_String_Into_the_Max_Number_of_Unique_Substrings {
    public static void main(String[] args) {

        Set<Character> s = new HashSet<>();
        s.add('d');
        s.add('b');
        s.add('t');
        System.out.println(s.size());
        System.out.println(maxUniqueSplit("dbtb"));

    }

    public static int maxUniqueSplit(String s) {
        int res = 0;
        int duplicate = 0;
        Set<Character> set = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            set.add(s.charAt(i));
            if(set.contains(s.charAt(i))){
                duplicate++;
            }
            if (duplicate == 2) {
                if ( i != s.length() - 1) {
                    res++;
                }
                duplicate = 0;
            }
        }

        res += set.size() - 1;
        return res;
    }
}
