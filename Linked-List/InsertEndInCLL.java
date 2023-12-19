/**
 * Insert at the end of Circular Linked List.
 */

class Node {
    int data;
    Node next;

    Node(int item) {
        data = item;
        next = null;
    }
}

public class InsertEndInCLL {
    static Node insertEnd(Node head, int x) {
        Node newNode = new Node(x);
        if (head == null)
            return newNode;
        if (head.next == head) {
            head.next = newNode;
            newNode.next = head;
        } else {
            Node curr = head;
            while (curr.next != head) {
                curr = curr.next;
            }
            curr.next = newNode;
            newNode.next = head;
        }
        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = head;

        head = insertEnd(head, 40);
        Node r = head;
        while (r.next != head) {
            System.out.print(r.data + " ");
            r = r.next;
        }
        System.out.print(r.data + " ");
    }
}
