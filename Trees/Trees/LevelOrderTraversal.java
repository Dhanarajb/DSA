package Trees;

import java.util.LinkedList;
import java.util.Queue;

class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = null;
        right = null;
    }
}

class BinaryTree {
    Node root;

    void printLevelOrder() {
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node currEle = queue.poll();
            System.out.print(currEle.data + " ");

            if (currEle.left != null) {
                queue.add(currEle.left);
            }
            if (currEle.right != null) {
                queue.add(currEle.right);
            }
        }

    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(5);
        tree.root.left = new Node(1);
        tree.root.right = new Node(7);
        tree.root.left.left = new Node(2);
        tree.root.left.right = new Node(4);
        tree.root.left.right.left = new Node(3);
        tree.root.left.right.right = new Node(6);

        tree.printLevelOrder();
    }
}
