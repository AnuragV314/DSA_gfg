class Node {
    int data;
    Node next;

    Node(int item) {
        data = item;
        next = null;
    }
}

public class DeleteFirstNode {

    static Node deleteFirst(Node head) {
        if (head == null)
            return null;

        else
            return head.next;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);

        head = deleteFirst(head);

        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }

    }
}
