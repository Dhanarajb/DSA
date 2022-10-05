package Trees.DFS;

import java.util.Stack;

class Node {
    int data;
    Node left, right;

    public Node(int key) {
        data = key;
        left = right = null;
    }
}

class Main {
    public static void InOrderIterative(Node root) {
        Stack<Node> st = new Stack<>(); // create empty stacl
        Node curr = root; // start from the root node

        while (!st.empty() || curr != null) { // loop till stack is empty and curr is empty
            if (curr != null) { // if curr is not equal to null
                st.push(curr);
                curr = curr.left;
            } else {
                curr = st.pop();
                System.out.print(curr.data + " ");
                curr = curr.right;
            }
        }
    }

    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.right.left = new Node(5);
        root.right.right = new Node(6);
        root.right.left.left = new Node(7);
        root.right.left.right = new Node(8);

        InOrderIterative(root);
    }
}
