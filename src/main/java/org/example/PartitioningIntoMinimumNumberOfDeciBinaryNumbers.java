package org.example;

public class PartitioningIntoMinimumNumberOfDeciBinaryNumbers {
    public static void main(String[] args) {
        String n = "928";
        int ans = Integer.parseInt(String.valueOf(n.charAt(0)));
        System.out.println(ans);
    }
    public int minPartitions(String n) {
        int ans = Integer.parseInt(String.valueOf(n.charAt(0)));

        for (int i=0; i < n.length() ; i++) {
            if (Integer.parseInt(String.valueOf(n.charAt(i))) > ans) {
                ans = Integer.parseInt(String.valueOf(n.charAt(i)));
            }
        }

        return ans;
    }
}
