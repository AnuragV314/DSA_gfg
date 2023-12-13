/**
 * Simple Linked List Implementation
 */

// class Node {
// int data;
// Node next;

// Node(int item) {
// data = item;
// next = null;
// }
// }

class Node {
    int data;
    Node next;

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
}

public class SimpleLLlmplementation {

    static void travalLL(Node head) {
        if (head == null) {
            return;
        }
        System.out.print(head.data + " ");
        travalLL(head.next);
    }

    public static void main(String[] args) {
        Node head = new Node(1, new Node(2, new Node(3, null)));
        // while (head.next != null) {
        // System.out.print(head.data + " ");
        // head = head.next;
        // }
        // System.out.print(head.data);
        // System.out.println();

        travalLL(head);
    }
}