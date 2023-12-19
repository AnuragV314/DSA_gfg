/**
 * Circular Doubly Linked List
 */
class Node {
    int data;
    Node next, prev;

    Node(int item) {
        data = item;
        next = null;
        prev = null;
    }
}

public class CircularDLL {
    static Node insertAtHead(Node head, int x) {
        Node newNode = new Node(x);
        if (head == null) {
            newNode.next = newNode;
            newNode.prev = newNode;
            return newNode;
        }
        newNode.next = head.prev;
        newNode.next = head;
        head.prev.next = newNode;
        head.prev = newNode;

        return newNode;

    }

    public static void main(String[] args) {
        Node head = new Node(10);
        Node temp1 = new Node(20);
        Node temp2 = new Node(30);
        head.next = temp1;
        temp1.next = temp2;
        temp2.next = head;
        temp2.prev = temp1;
        temp1.prev = head;
        head.prev = temp2;
        head = insertAtHead(head, 5);
        Node curr = head;
        while (curr.next != head) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.print(curr.data + " ");
    }
}
