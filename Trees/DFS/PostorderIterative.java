package Trees.DFS;

import java.util.Stack;

class Node {
    int data;
    Node right, left;

    public Node(int key) {
        data = key;
        right = left = null;
    }
}

class Main {
    public static void PostOrderInterative(Node root) {
        if (root == null) {
            return;
        }
        Stack<Node> st = new Stack<>();
        st.push(root);

        Stack<Integer> out = new Stack<>();

        while (!st.empty()) {
            Node curr = st.pop();
            out.push(curr.data);

            if (curr.left != null) {
                st.push(curr.left);
            }
            if (curr.right != null) {
                st.push(curr.right);
            }
        }
        while (!out.empty()) {
            System.out.print(out.pop() + " ");
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

        PostOrderInterative(root);
    }
}
