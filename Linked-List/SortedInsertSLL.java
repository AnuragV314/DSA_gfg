/**
 * Sorted Insert in a Singly Linked List
 */
class Node {
    int data;
    Node next;

    Node(int item) {
        data = item;
        next = null;
    }
}

public class SortedInsertSLL {
    static Node sortedInsert(Node head, int x) {
        Node newNode = new Node(x);
        if (head == null)
            return newNode;
        if (x < head.data) {
            newNode.next = head;
            head = newNode;
            return newNode;
        }
        Node curr = head;
        while (curr.next != null && curr.next.data < x) {
            curr = curr.next;
        }
        newNode.next = curr.next;
        curr.next = newNode;

        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);

        sortedInsert(head, 25);
        while (head.next != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.print(head.data + " ");
    }
}
