package LinkedList;

class Main {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public void inserLastt(int d) {
        Node newNode = new Node(d);
        if (head == null) {
            head = new Node(d);
            return;
        }
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = newNode;
    }

    public static void main(String[] args) {
        Main Node = new Main();
        Node.inserLastt(1);
        Node.inserLastt(2);
        Node.inserLastt(3);
        Node.inserLastt(4);
        Node.inserLastt(5);
        Node.print();

    }
}
