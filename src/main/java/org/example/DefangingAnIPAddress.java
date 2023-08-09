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
        String newIp = null;

        for (int i=0; i < address.length(); i++) {
            if (address.charAt(i) == '.') {
                address = address.substring(0,i-1) + '[' + address.substring(i-1);
            }
        }

        return newIp;
    }
}
