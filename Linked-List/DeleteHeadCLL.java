/**
 * Delete Head of Circular Linked List
 */
class Node {
    int data;
    Node next;

    Node(int item) {
        data = item;
        next = null;
    }
}

public class DeleteHeadCLL {

    static Node deleteHead(Node head) {
        if (head == null)
            return null;
        if (head.next == null) {
            return null;
        } else {
            Node curr = head;
            while (curr.next != head) {
                curr = curr.next;
            }
            curr.next = head.next;
            head = head.next;
        }
        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = head;

        head = deleteHead(head);
        Node curr = head;
        while (curr.next != head) {
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
        System.out.print(curr.data+" ");

    }
}
