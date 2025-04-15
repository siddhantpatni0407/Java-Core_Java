/**
 * Leetcode Problem 1 : Add Two Numbers
 * Link : https://leetcode.com/problems/add-two-numbers/
 * <p>
 * You are given two non-empty linked lists representing two non-negative
 * integers. The digits are stored in reverse order and each of their nodes
 * contain a single digit. Add the two numbers and return it as a linked list.
 * <p>
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 */

package com.sid.leetcode.medium;

/**
 * Definition for singly-linked list.
 */
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class AddTwoNumbers_2 {

    /**
     * Adds two numbers represented as linked lists (digits stored in reverse order).
     *
     * @param l1 First number as linked list
     * @param l2 Second number as linked list
     * @return Sum as a linked list in reverse order
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry;

            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            carry = sum / 10;
            current.next = new ListNode(sum % 10);
            current = current.next;
        }

        return dummyHead.next;
    }

    // Utility: Create a list from digits
    public static ListNode createList(int[] digits) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        for (int digit : digits) {
            current.next = new ListNode(digit);
            current = current.next;
        }
        return dummy.next;
    }

    // Utility: Print a linked list
    public static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val);
            node = node.next;
            if (node != null) System.out.print(" -> ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        AddTwoNumbers_2 adder = new AddTwoNumbers_2();

        System.out.println("Test Case 1: (2 -> 4 -> 3) + (5 -> 6 -> 4)");
        printList(adder.addTwoNumbers(createList(new int[]{2, 4, 3}), createList(new int[]{5, 6, 4}))); // 7 -> 0 -> 8

        System.out.println("Test Case 2: (0) + (0)");
        printList(adder.addTwoNumbers(createList(new int[]{0}), createList(new int[]{0}))); // 0

        System.out.println("Test Case 3: (9 -> 9 -> 9 -> 9 -> 9 -> 9 -> 9) + (9 -> 9 -> 9 -> 9)");
        printList(adder.addTwoNumbers(
                createList(new int[]{9, 9, 9, 9, 9, 9, 9}),
                createList(new int[]{9, 9, 9, 9})
        )); // 8 -> 9 -> 9 -> 9 -> 0 -> 0 -> 0 -> 1

        System.out.println("Test Case 4: (1 -> 8) + (0)");
        printList(adder.addTwoNumbers(
                createList(new int[]{1, 8}),
                createList(new int[]{0})
        )); // 1 -> 8

        System.out.println("Test Case 5: (9) + (1)");
        printList(adder.addTwoNumbers(
                createList(new int[]{9}),
                createList(new int[]{1})
        )); // 0 -> 1
    }

}