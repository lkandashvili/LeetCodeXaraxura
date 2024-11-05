package org.example;

public class Minimum_Number_Of_Changes_To_Make_Binary_String_Beautiful {
    public static void main(String[] args) {

        System.out.println(minChanges("0000"));
    }

    public static int minChanges(String s) {

        int res = 0;

        for (int i = 0; i < s.length() -1 ; i += 2) {
            if (s.charAt(i) != s.charAt(i+1)) {
                res++;
            }
        }

        return res;
    }
}
