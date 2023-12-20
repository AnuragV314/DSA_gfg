/**
 * Recursive reverse a linked list
 */
class Node {
    int data;
    Node next;

    Node(int item) {
        data = item;
        next = null;

    }

}

public class RecursiveReverseLL {
    static Node recRevL(Node head) {
        if (head == null || head.next == null)
            return head;
        Node restNode = recRevL(head.next);
        Node restTail = head.next;
        restTail.next = head;
        head.next = null;
        return restNode;
    }

    static void printlist(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        printlist(head);
        head = recRevL(head);
        printlist(head);
    }
}
