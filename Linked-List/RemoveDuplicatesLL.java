/**
 * Remove duplicates from a sorted Singly Linked List.
 */

class Node{
    int data;
    Node next;

    Node(int item){
        data = item;
        next = null;
    }
}

public class RemoveDuplicatesLL {
    static void removeDuplicates(Node head){
        Node curr = head;
        while (curr!=null && curr.next!=null ) {
            if(curr.data == curr.next.data){
                curr.next = curr.next.next;
            }
            else
                curr = curr.next;
        }
    }
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(20);
        head.next.next.next = new Node(30);

        removeDuplicates(head);

        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }
}
