// Insert at Begin of Doubly Linked List

class Node {
    int data;
    Node prev, next;

    Node(int item) {
        data = item;
        prev = null;
        next = null;
    }
}

public class InsertBeginDLL {

    static Node insertBegain(Node head, int data){
        Node temp = new Node(data);
        head.prev = temp;
        if(head != null ) temp.next = head;
        return temp;
    }
    public static void main(String[] args) {
        Node head = new Node(10);

        head.next = new Node(20);
        head.next.prev = head;

        head.next.next = new Node(30);
        head.next.next.prev = head.next ;


        Node curr = insertBegain(head, 155);
        while (curr != null) {
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
        System.out.println();

    }
}
