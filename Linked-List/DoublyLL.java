/**
 * Doubly Linked List 
 */


class Node{
    int data;
    Node prev, next;
    Node(int item){
        data = item;
        prev = null;
        next = null;
    }
}


public class DoublyLL {
    public static void main(String[] args) {
        Node head = new Node(10);

        head.next = new Node(20);
        head.next.prev = head;

        head.next.next = new Node(30);
        head.next.next.prev = head.next ;


        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
        System.out.println();

    }
}
