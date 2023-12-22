/**
 * Detect loop using floyd cycle detection.
 */

class Node {
    int data;
    Node next;

    Node(int item) {
        data = item;
        next = null;
    }
}

public class DetectLoopFloydCycledetection {
    static boolean isLoop(Node head) {
        Node sNode = head;
        Node fNode = head;

        while (sNode != null && fNode != null) {
            
            sNode = sNode.next;
            fNode = fNode.next.next;
            if (sNode == fNode) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Node head = new Node(15);
        head.next = new Node(10);
        head.next.next = new Node(12);
        head.next.next.next = new Node(20);
        head.next.next.next.next = head.next;

        Boolean a = isLoop(head);

        if (a)
            System.out.print("Loop found");
        else
            System.out.print("No Loop");

    }
}
