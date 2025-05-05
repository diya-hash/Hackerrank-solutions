package dataStructures.trees;

import java.util.Stack;

class Node {
    int data;
    Node left, right;

    Node(int value) {
        data = value;
        left = right = null;
    }
}

public class preorderTraversal {
    public static void printpreorder(Node root) {
        Node curr = root;
        Stack<Node> stack = new Stack<>();
        stack.push(curr);

        while (!stack.isEmpty()) {
            curr = stack.pop();
            System.out.print(curr.data + " ");
            if (curr.right != null) {
                stack.push(curr.right);
            }
            if (curr.left != null) {
                stack.push(curr.left);
            }
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        printpreorder(root);
    }
}
