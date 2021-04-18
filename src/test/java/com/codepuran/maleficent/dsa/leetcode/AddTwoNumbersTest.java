package com.codepuran.maleficent.dsa.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AddTwoNumbersTest {

    private AddTwoNumbers addTwoNumbers = new AddTwoNumbers();

    @Test
    public void addTwoNumbersTest_1() {

        ListNode list_1 = new ListNode(2, new ListNode(4, new ListNode(3)));

        ListNode list_2 = new ListNode(5, new ListNode(6, new ListNode(4)));

        ListNode output = addTwoNumbers.addTwoNumbers(list_1,list_2);

        ListNode result = new ListNode(7, new ListNode(0, new ListNode(8)));
        Assertions.assertEquals(result.val,output.val);
    }

    @Test
    public void addTwoNumbersTest_2() {

    }

    @Test
    public void addTwoNumbersTest_3() {

    }

    @Test
    public void addTwoNumbersTest_4() {

    }

}
