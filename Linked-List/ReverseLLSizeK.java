/**
 * Reverse a linked list in groups of size k
 */
class Node {
    int data;
    Node next;

    Node(int item) {
        data = item;
        next = null;
    }
}

public class ReverseLLSizeK {
    // Recursive Method
    static Node reverseK(Node head, int k) {
        Node curr = head, next = null, prev = null;
        int count = 0;
        while (curr != null && count < k) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            count++;
        }
        if (next != null) {
            Node rest_head = reverseK(next, k);
            head.next = rest_head;
        }
        return prev;
    }

    // Iterative Method
    static Node reverseK2(Node head,int k){
        Node curr=head,prevFirst=null;
        boolean isFirstPass=true;
        while(curr!=null){
            Node first=curr,prev=null;
            int count=0;
            while(curr!=null&&count<k){
            Node next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
            count++;
            }
            if(isFirstPass){head=prev;isFirstPass=false;}
            else{prevFirst.next=prev;}
            prevFirst=first;
        }
        return head;
    }

    public static void printlist(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        head.next.next.next.next.next = new Node(60);
        head.next.next.next.next.next.next = new Node(70);
        printlist(head);
        head = reverseK(head, 3);
        printlist(head);
    }
}
