class Node {
    int data;
    Node next;

    Node(int item) {
        data = item;
        next = null;
    }
}

public class InsertAtPosition {

    static Node insertPosion(Node head, int x, int pos) {
        Node temp = new Node(x);
        if (head == null) {
            if (pos == 1)
                return temp;
            else
                return head;
        }
        if (pos == 1) {
            temp.next = head;
            return temp;
        }

        Node curr = head;
        for (int i = 1; i < pos - 1; i++) {
            curr = curr.next;
            if(curr == null){
                System.out.println("Position out of range");
                return head;
            }
        }

        temp.next = curr.next;
        curr.next = temp;
        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

    }
}
