// Insert at End Doubly Linked List

class Node {
    int data;
    Node prev, next;

    Node(int item) {
        data = item;
        prev = null;
        next = null;
    }
}

public class InsertEndDLL {

    static Node insertEnd(Node head, int data){
        Node newNode = new Node(data);
        if(head == null) return newNode;

        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = newNode;
        newNode.prev = curr;

        return head;
    }
    public static void main(String[] args) {
        Node head = new Node(10);

        head.next = new Node(20);
        head.next.prev = head;

        head.next.next = new Node(30);
        head.next.next.prev = head.next ;


        Node curr = insertEnd(head, 155);

        while (curr != null) {
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
        System.out.println();

    }
}
