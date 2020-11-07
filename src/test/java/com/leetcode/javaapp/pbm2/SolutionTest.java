package com.leetcode.javaapp.pbm2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SolutionTest {

    Solution solution;
    ListNode listNode1;
    ListNode listNode2;
    ListNode output;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void example1() {
        listNode1 = new ListNode(2);
        listNode1.next = new ListNode(4);
        listNode1.next.next = new ListNode(3);

        listNode2 = new ListNode(5);
        listNode2.next = new ListNode(6);
        listNode2.next.next = new ListNode(4);

        output = new ListNode(7);
        output.next = new ListNode(0);
        output.next.next = new ListNode(8);

        ListNode outputNode = solution.addTwoNumbers(listNode1, listNode2);
        while (outputNode != null && output != null) {
            Assertions.assertEquals(outputNode.val, output.val);
            outputNode = outputNode.next;
            output = output.next;
        }
    }

    @Test
    void example2() {
        listNode1 = new ListNode(0);

        listNode2 = new ListNode(0);

        output = new ListNode(0);

        ListNode outputNode = solution.addTwoNumbers(listNode1, listNode2);
        while (outputNode != null && output != null) {
            Assertions.assertEquals(outputNode.val, output.val);
            outputNode = outputNode.next;
            output = output.next;
        }
    }

    @Test
    void example3() {
        listNode1 = new ListNode(9);
        listNode1.next = new ListNode(9);
        listNode1.next.next = new ListNode(9);
        listNode1.next.next.next = new ListNode(9);
        listNode1.next.next.next.next = new ListNode(9);
        listNode1.next.next.next.next.next = new ListNode(9);
        listNode1.next.next.next.next.next.next = new ListNode(9);

        listNode2 = new ListNode(9);
        listNode2.next = new ListNode(9);
        listNode2.next.next = new ListNode(9);
        listNode2.next.next.next = new ListNode(9);

        output = new ListNode(8);
        output.next = new ListNode(9);
        output.next.next = new ListNode(9);
        output.next.next.next = new ListNode(9);
        output.next.next.next.next = new ListNode(0);
        output.next.next.next.next.next = new ListNode(0);
        output.next.next.next.next.next.next = new ListNode(0);
        output.next.next.next.next.next.next.next = new ListNode(1);

        ListNode outputNode = solution.addTwoNumbers(listNode1, listNode2);
        while (outputNode != null && output != null) {
            Assertions.assertEquals(outputNode.val, output.val);
            outputNode = outputNode.next;
            output = output.next;
        }
    }
}