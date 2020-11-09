package com.codepuran.maleficent.dsa.ib.ll;

public class KReverseLinkedList {

    public static void main(String[] args) {

    }



    public ListNode reverseList(ListNode A, int B) {

        if (A == null || A.next == null) {
            return A;
        }

        if(B == 1) {
            return A;
        }

        ListNode veryFirst = null;

        ListNode prev = A;
        ListNode current = A.next;
        prev.next = null;
        ListNode third;
        ListNode prevLast = A;
        ListNode nextFirst;
        ListNode prePrevLast = null;

        int i = 1;
        while (true) {
            third = current.next;
            current.next = prev;
            prev = current;

            if(i == B - 1) {
                if(veryFirst == null) {
                    veryFirst = current;
                } else {
                    nextFirst = current;
                    prePrevLast.next = nextFirst;
                }
                i = 0;
                prePrevLast = prevLast;
                prevLast = third;
            } else {
                i = i + 1;
            }
            current = third;
            if(third == null && veryFirst != null) {
                if(prePrevLast != null)
                    prePrevLast.next = current;
                break;
            }
        }
        if(veryFirst == null) {
            current.next = prev;
            veryFirst = current;
        }
        return veryFirst;
    }


}
