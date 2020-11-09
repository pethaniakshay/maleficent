package com.codepuran.maleficent.dsa.ib.ll;

public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode A, ListNode B) {

        ListNode head;
        ListNode current;

        if(A.val < B.val) {
            head = A;
            current = A;
            A = A.next;
        } else {
            head = B;
            current = B;
            B = B.next;
        }

        while (A != null || B != null) {
            if(A == null) {
                current.next = B;
                break;
            } else if(B == null) {
                current.next = A;
                break;
            } else {
                if(A.val == B.val) {
                    current.next = A;
                    A = A.next;

                    current = current.next;

                    current.next = B;
                    B = B.next;

                } else if (A.val < B.val) {
                    current.next = A;
                    A = A.next;
                } else {
                    current.next = B;
                    B = B.next;
                }
            }
            current = current.next;
        }
        return head;
    }
}


