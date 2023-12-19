// Circular Linked List
class Node {
    int data;
    Node next;

    Node(int item) {
        data = item;
        next = null;
    }
}

public class CircularLL {
    static void printlist(Node head) {
        if (head == null)
            return;
        Node r = head;
        do {
            System.out.print(r.data + " ");
            r = r.next;
        } while (r != head);
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = head;

        System.out.print(head.data + " ");
        for (Node i = head.next; i != head; i = i.next) {
            System.out.print(i.data + " ");
        }
        System.out.println();

        printlist(head);

        System.out.println();

        Node r = head;
        while (r.next != head) {
            System.out.print(r.data + " ");
            r = r.next;
        }
        System.out.print(r.data + " ");
    }
}
