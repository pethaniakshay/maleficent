package com.codepuran.maleficent.dsa.leetcode;

import java.util.List;

public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        l1 = reverseList(l1);
        l2 = reverseList(l2);
        ListNode resultList = new ListNode();
        ListNode r = resultList;
        boolean l1Done = false;
        boolean l2Done = false;
        int f = l1.val;
        int s = l2.val;
        l1 = l1.next;
        l2 = l2.next;
        int carry = 0;

        while (true) {
            int sum = f + s + carry;

            if(l1.next != null) {
                f = l1.val;
                l1 = l1.next;
            }

            if(l2.next != null) {
                f = l2.val;
                l2 = l2.next;
            }

            if (sum >= 10) {
                carry = 1;
                resultList.val = sum - 10;
            } else {
                carry = 0;
            }

            if(l1.next == null && l2.next == null) {
                if(carry == 1) {
                    resultList.next = new ListNode();
                    resultList = resultList.next;
                    resultList.val = 1;
                }
                break;
            }
            resultList.next = new ListNode();
            resultList = resultList.next;
        }
        return r;
    }

    ListNode reverseList(ListNode listNode) {
        ListNode current = listNode.next;
        ListNode prev = listNode;
        while (current.next != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        current.next = prev;
        return current;
    }
}

