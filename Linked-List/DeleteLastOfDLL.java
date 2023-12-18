// Delete Last of a Doubly Linked List

class Node {
    int data;
    Node next, prev;

    Node(int item) {
        data = item;
        next = null;
        prev = null;
    }
}

public class DeleteLastOfDLL {
    static Node deleteENode(Node head){
        Node curr = head;
        if(curr == null) return null;
        if(curr.next == null) return null;

        while (curr.next.next != null) {
            curr = curr.next;
        }
        curr.next = null;
        return head;
    }
    public static void main(String[] args) {
        Node head=new Node(10);
    	Node temp1=new Node(20);
    	Node temp2=new Node(30);

    	head.next=temp1;
    	temp1.prev=head;

    	temp1.next=temp2;
    	temp2.prev=temp1;

        head = deleteENode(head);

        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
}
