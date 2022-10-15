package Trees.DFS;

import DFS.Node;

// tree node class
public class Node {
    int data;
    Node right, left;

    public Node(int item) {
        data = item;
        right = left = null;
    }
}

class BinaryTree {
    Node root; // main root

    // BinaryTree() {
    // root = null;
    // }

    void preOrder(Node node) {
        if (node == null)
            return;
        System.out.print(node.data + " ");// traverse root
        preOrder(node.left); // traverse left
        preOrder(node.right); // traverse right
    }

    void inOrder(Node node) {
        if (node == null)
            return;
        inOrder(node.left);
        System.out.print(node.data + " ");
        inOrder(node.right);
    }

    void postOrder(Node node) {
        if (node == null)
            return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.data + " ");
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.left.right.left = new Node(6);
        tree.root.right.left = new Node(7);
        tree.root.right.right = new Node(8);
        tree.root.right.right.left = new Node(9);
        tree.root.right.right.right = new Node(10);

        System.out.println("preOrder");
        tree.preOrder(tree.root);
        System.out.println("\nInorder");
        tree.inOrder(tree.root);
        System.out.println("\npostOrder");
        tree.postOrder(tree.root);

    }

}
