package org.example;

import java.util.ArrayList;
import java.util.List;

public class DefangingAnIPAddress {


    public static void main(String[] args) {
        String address = "1.1.1.1";
        StringBuffer formattedAddress = new StringBuffer(address);
        List<Integer> arr = new ArrayList<>();
        int n = 0;

        System.out.println(address);

        for (int i=0; i < address.length() ; i++) {
            if ( address.toCharArray()[i] == '.') {
                formattedAddress.insert((i)+n,'[');
                n = n+1;
                formattedAddress.insert((i+1)+n,']');
                n = n+1;

            }
        }

        System.out.println(formattedAddress);
    }
    public String defangIPaddr(String address) {
        StringBuilder formattedAddress = new StringBuilder(address);
        int n=0;

        for (int i=0; i < address.length(); i++) {
            if (address.toCharArray()[i] == '.') {
                formattedAddress.insert(i+n, '[');
                n++;
                formattedAddress.insert((i+1)+n, ']');
                n++;
            }
        }
        return formattedAddress.toString();
    }
}
