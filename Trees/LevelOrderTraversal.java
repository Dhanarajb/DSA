package Trees;

import java.util.LinkedList;
import java.util.Queue;

class LevelOrderTraversal {
    int data;
    LevelOrderTraversal left, right;

    public LevelOrderTraversal(int item) {
        data = item;
        left = null;
        right = null;
    }
}

class BinaryTree {
    LevelOrderTraversal root;

    void printLevelOrder() {
        Queue<LevelOrderTraversal> queue = new LinkedList<LevelOrderTraversal>();
        queue.add(root);
        while (!queue.isEmpty()) {
            LevelOrderTraversal currEle = queue.poll();
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
        tree.root = new LevelOrderTraversal(5);
        tree.root.left = new LevelOrderTraversal(1);
        tree.root.right = new LevelOrderTraversal(7);
        tree.root.left.left = new LevelOrderTraversal(2);
        tree.root.left.right = new LevelOrderTraversal(4);
        tree.root.left.right.left = new LevelOrderTraversal(3);
        tree.root.left.right.right = new LevelOrderTraversal(6);

        tree.printLevelOrder();
    }
}
