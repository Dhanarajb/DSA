package Trees;

import java.util.Scanner;

public class BasicTree { // BasicTree is node
    int data;
    BasicTree left, right;

    public BasicTree(int item) {
        data = item;
        left = null;
        right = null;
    }

    static Scanner sc = null;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        BasicTree root = createTree();
        inOrder(root);
        System.out.println();
        preOrder(root);
        System.out.println();
        postOrder(root);
        System.out.println();

    }

    static BasicTree createTree() {
        BasicTree root = null;
        System.out.println("Enter data: ");
        int data = sc.nextInt();
        if (data == -1)
            return null;
        root = new BasicTree(data);

        System.out.println("Enter left for " + data);
        root.left = createTree();
        System.out.println("Enter right for " + data);
        root.right = createTree();
        return root;

    }

    static void inOrder(BasicTree root) {
        if (root == null)
            return;
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    static void preOrder(BasicTree root) {
        if (root == null)
            return;
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    static void postOrder(BasicTree root) {
        if (root == null)
            return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");

    }

}
