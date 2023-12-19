/**
 * Middle of linked list
 */

class Node {
    int data;
    Node next;

    Node(int item) {
        data = item;
        next = null;
    }
}

public class MiddleofLL {
    static int middleofLL (Node head){
        int count=0;
        Node curr = head;
        while (curr.next != null) {
            count++;
            curr = curr.next;
        }

        Node mid = head;
        for(int i=0; i<count/2; i++){
            mid = mid.next;
        }
        return mid.data;
    }
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);

        System.out.println(middleofLL(head));
    }
}
