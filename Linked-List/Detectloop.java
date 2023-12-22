import java.util.HashSet;

/**
 * Detect loop
 */

class Node {
    int data;
    Node next;

    Node(int item) {
        data = item;
        next = null;
    }
}

public class Detectloop {

    static boolean isLoop(Node head) {
        Node newNode = new Node(0);
        Node curr = head;
        while (curr != null) {
            if (curr.next == null)
                return false;
            if (curr.next == newNode)
                return true;

            Node curr_next = curr.next;
            curr.next = newNode;
            curr = curr_next;

        }
        return false;
    }

    // mehtod 2 (Hashing)
    static boolean isLoop2(Node head){
        HashSet<Node> s=new HashSet<Node>();
        for(Node curr =head; curr!=null; curr = curr.next){
            if(s.contains(curr))
                return true;
            s.add(curr);
        }
        return false;
    }

    public static void main(String[] args) {
        Node head=new Node(15);
    	head.next=new Node(10);
    	head.next.next=new Node(12);
    	head.next.next.next=new Node(20);
    	head.next.next.next.next=head.next;

        Boolean a = isLoop(head);

        if (a)
            System.out.print("Loop found");
        else
            System.out.print("No Loop");

    }
}
