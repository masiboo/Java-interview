package org.example;

class Node {
    public int value;
    public Node left, right;

    public Node(int value, Node left, Node right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }
}

public class BinarySearchTree {
    public static boolean contains(Node root, int value) {
        boolean retVal = false;
        if (root == null) {
            return false;
        }
        if (root.value == value) {
            retVal = true;
        } else if (value <= root.value) {
            retVal = contains(root.left, value);
        } else {
            retVal = contains(root.right, value);
        }
        return retVal;
    }

    public static void main(String[] args) {
        Node n1 = new Node(1, null, null);
        Node n3 = new Node(3, null, null);
        Node n2 = new Node(2, n1, n3);

        System.out.println(contains(n2, 3));
    }
}