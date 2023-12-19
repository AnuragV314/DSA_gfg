// Nth Node from end of Linked List

class Node {
    int data;
    Node next;

    Node(int item) {
        data = item;
        next = null;
    }
}

public class NthNodeEndLL {

    static void printNthFromEnd(Node head, int n) {
        int len = 1;
        Node curr = head;
        while (curr.next != null) {
            len++;
            curr = curr.next;
        }

        Node nthNode = head;
        if (n > len)
            return;
        for (int i = 0; i < len - n; i++) {
            nthNode = nthNode.next;
        }
        System.out.println(nthNode.data);
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);

        printNthFromEnd(head, 3);

    }

}
