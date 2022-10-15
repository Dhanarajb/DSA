// package Trees;

// class Node {
// int data;
// Node right, left;

// public Node(int key) {
// data = key;
// right = left = null;
// }

// }

// class Main {
// Node root;

// int MaxDept(Node root) {
// if (root == null)
// return 0;

// int lh = MaxDept(root.left);
// int rh = MaxDept(root.right);
// return 1 + Math.max(lh, rh);

// }

// public static void main(String[] args) {
// Main st = new Main();
// st.root = new Node(1);
// st.root.left = new Node(2);
// st.root.right = new Node(3);
// st.root.right.left = new Node(4);
// st.root.right.left.left = new Node(5);
// st.root.right.right = new Node(6);
// System.out.println(st.MaxDept(st.root));
// }
// }
