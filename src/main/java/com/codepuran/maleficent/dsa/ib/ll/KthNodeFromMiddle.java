package com.codepuran.maleficent.dsa.ib.ll;

public class KthNodeFromMiddle {

    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);
        head.next.next.next.next.next.next = new ListNode(7);
        head.next.next.next.next.next.next.next = new ListNode(8);
        head.next.next.next.next.next.next.next.next = new ListNode(9);
        head.next.next.next.next.next.next.next.next.next = new ListNode(10);
        var o = new KthNodeFromMiddle();
        int r = o.solve(head,1);
        System.out.println("Result: "+ r);
    }

    public int solve(ListNode A, int B) {

        int length = 0;

        if(A.next != null) {
            length = 1;
        } else {
            return - 1;
        }

        ListNode curr = A;
        while (curr.next != null) {
            ++length;
            ListNode temp = curr.next;
            curr = temp;
        }

        int middle = (length/2) + 1;
        int positionToGet = middle - B;
        if(positionToGet <= 0) {
            return  -1;
        } else {
            curr = A;
            for(int i= 1; i< positionToGet ; i++) {
                ListNode temp = curr.next;
                curr = temp;
            }
            return curr.val;
        }
    }
}
