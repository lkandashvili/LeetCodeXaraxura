package org.example;

import java.util.ArrayList;
import java.util.List;

public class AddTwoNumbers {
//    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//        ListNode result;
//
//        int l1Num, l2Num;
//        List l2List = new ArrayList<>();
//        List l1List = new ArrayList<>();
//
//        while (l1.next != null) {
//            l1List.add(l1.val);
//        }
//        while (l2.next != null) {
//            l2List.add(l2.val);
//        }
//
//        l1List.sort();
//
//        return result;
//    }
}
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) {
        this.val = val;
    }
    ListNode(int val, ListNode next) {
        this.val = val; this.next = next;
    }
}
