package com.codepuran.maleficent.dsa.ib.ll;

public class KReverseLinkedList {

    public static void main(String[] args) {

    }



    public ListNode reverseList(ListNode A, int B) {
        ListNode curr = A;
        int count = 0;
        ListNode prev = null, next=null;
        while(curr!= null && count < B){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            count++;
        }
        if(next!= null){
            ListNode ans = reverseList(next, B);
            A.next = ans;
        }
        return prev;
    }


}
