package Trees;

class Node {
    int data;
    Node right, left;

    public Node(int key) {
        data = key;
        right = left = null;
    }

}

class Main {
    public static int getDiameter(Node root) {
        height(root);
        return res;
    }

    static int res = 0;

    public static int height(Node root) {
        if (root == null)
            return 0;

        int lh = height(root.left);
        int rh = height(root.right);
        res = Math.max(res, lh + rh);
        return Math.max(lh, rh) + 1;

    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.right = new Node(4);
        root.right.left = new Node(5);
        root.right.right = new Node(6);
        root.right.left.left = new Node(7);
        root.right.left.right = new Node(8);

        System.out.print("The diameter of the tree is " + getDiameter(root));
    }
}
