package LinkedList;

class InserNodetFirst {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public void insertFi(int d) {
        Node newNode = new Node(d);
        newNode.next = head;
        head = newNode;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        InserNodetFirst list = new InserNodetFirst();
        list.insertFi(12);
        list.insertFi(3);
        list.insertFi(9);
        list.insertFi(54);
        list.insertFi(99);
        list.printList();
    }
}
