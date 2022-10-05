// package Trees;

// public class Node {
// int data;
// Node right, left;

// public Node(int key) {
// data = key;
// right = left = null;
// }
// }

// class Main {
// Node root;

// public static int isBalnced(Node root) {
// if (root == null)
// return 0;
// int lh = isBalnced(root.left);
// if (lh == -1)
// return -1;
// int rh = isBalnced(root.right);
// if (rh == -1)
// return -1;
// if (Math.abs(lh - rh) > 1)
// return -1;
// else
// return Math.max(lh, rh) + 1;
// }

// public static void main(String[] args) {
// Node root = new Node(1);
// root.left = new Node(2);
// root.right = new Node(3);
// root.left.left = new Node(4);
// root.right.left = new Node(5);
// root.right.right = new Node(6);
// if (isBalnced(root) > 0)
// System.out.print("Balanced");
// else
// System.out.print("Not Balanced");
// }
// }
