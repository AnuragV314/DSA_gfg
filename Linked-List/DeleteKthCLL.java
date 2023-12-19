/**
 * Delete Kth of a Circular Linked List
 */
class Node {
    int data;
    Node next;

    Node(int item) {
        data = item;
        next = null;
    }
}

public class DeleteKthCLL {

    static Node deleteKthNode(Node head, int k) {
        if (head == null)
            return null;
        if (k == 1)
            return deleteHead(head);

        Node curr = head;

        for (int i = 0; i < k - 2; i++) {
            curr = curr.next;
        }
        curr.next = curr.next.next;

        return head;

    }

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
        head.next.next.next = new Node(40);
        head.next.next.next.next = head;

        head = deleteKthNode(head, 2);
        Node curr = head;
        while (curr.next != head) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.print(curr.data + " ");
    }
}
