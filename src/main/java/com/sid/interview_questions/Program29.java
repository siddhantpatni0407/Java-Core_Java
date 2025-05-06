/**
 * Write a Java program to construct a binary tree using a Node class and print the tree
 * level-by-level (each level on a new line).
 * Input:		             5
 *                          /   \
 *                         4     8
 *                        /     / \
 *                       2     7   9
 * <p>
 * Output:		        5
 *                      4 8
 *                      2 7 9
 */

package com.sid.interview_questions;

import java.util.LinkedList;
import java.util.Queue;

// Node class representing each element of the binary tree
class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}

public class Program29 {
    // Approach 1: Iterative Level Order using Queue
    static void printLevelOrderUsingQueue(Node root) {
        System.out.println("Approach 1: Level Order using Queue:");
        if (root == null) return;

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size(); // Number of nodes in current level
            for (int i = 0; i < levelSize; i++) {
                Node current = queue.poll();
                System.out.print(current.data + " ");

                if (current.left != null) queue.offer(current.left);
                if (current.right != null) queue.offer(current.right);
            }
            System.out.println(); // Move to next line after printing a level
        }
    }

    // Helper to get height of tree
    static int height(Node root) {
        if (root == null)
            return 0;
        return 1 + Math.max(height(root.left), height(root.right));
    }

    // Approach 2: Recursive Level Order
    static void printLevelOrderUsingRecursion(Node root) {
        System.out.println("\nApproach 2: Level Order using Recursion:");
        int h = height(root);
        for (int i = 1; i <= h; i++) {
            printGivenLevel(root, i);
            System.out.println();
        }
    }

    // Print nodes at a given level
    static void printGivenLevel(Node root, int level) {
        if (root == null) return;

        if (level == 1) {
            System.out.print(root.data + " ");
        } else {
            printGivenLevel(root.left, level - 1);
            printGivenLevel(root.right, level - 1);
        }
    }

    public static void main(String[] args) {
        /*
         Input Tree:
                 5
               /   \
              4     8
             /     / \
            2     7   9
        */
        Node root = new Node(5);
        root.left = new Node(4);
        root.right = new Node(8);
        root.left.left = new Node(2);
        root.right.left = new Node(7);
        root.right.right = new Node(9);

        // Call both approaches
        printLevelOrderUsingQueue(root);
        printLevelOrderUsingRecursion(root);
    }

}