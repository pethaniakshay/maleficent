package com.codepuran.maleficent.dsa.ib.ll;

import java.util.LinkedList;
import java.util.List;

public class CustomLinkedList {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

    }

    /*public ListNode reverseList(ListNode A) {
        if (A == null || A.next == null) {
            return A;
        }
        ListNode prev = A;
        ListNode current = A.next;
        prev.next = null;
        ListNode third;
        while (current.next != null) {
            third = current.next;
            current.next = prev;
            prev = current;
            current = third;
        }
        current.next = prev;
        return current;
    }*/

    public ListNode reverseList(ListNode A) {
        if(A == null) {
            return A;
        }
        if(A.next == null) {
            return A;
        }
        ListNode newHeadNode = reverseList(A.next);
        A.next.next = A;
        A.next = null;
        return newHeadNode;
    }
}


