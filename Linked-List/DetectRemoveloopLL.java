/**
 * Detect and remove loop in linked list.
 */

class Node {
    int data;
    Node next;

    Node(int item) {
        data = item;
        next = null;
    }
}

public class DetectRemoveloopLL {

    static void detectRemoveLoop(Node head){
        Node sNode = head;
        Node fNode = head;
        while(fNode != null && fNode.next != null){
            sNode = sNode.next;
            fNode = fNode.next.next;
            if(sNode == fNode)
                break;
        }
        if(sNode != fNode)
            return;
        sNode = head;
        while (sNode.next != fNode.next) {
            sNode = sNode.next;
            fNode = fNode.next;
        }
        fNode.next = null;
    }

    public static void main(String[] args) {
        Node head = new Node(15);
        head.next = new Node(10);
        head.next.next = new Node(12);
        head.next.next.next = new Node(20);
        head.next.next.next.next = head.next;
        detectRemoveLoop(head);
    }
}
