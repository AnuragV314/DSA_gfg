/**
 * Insert at Begin of Circular Linked List
 */


public class InsertBeginCLL {

    static Node insertBegin(Node head, int x){
        Node newNode = new Node(x);
        if(head==null) newNode.next = newNode;
        else{
            Node curr = head;
            while (curr.next != head) {
                curr = curr.next;
            }
            curr.next = newNode;
            newNode.next = head;
        }

        return head;
    }
    public static void main(String[] args) {
        Node head=new Node(10);
    	head.next=new Node(20);
    	head.next.next=new Node(30);
    	head.next.next.next=head;


    	head=insertBegin(head,15);
        Node r = head;
        while (r.next != head) {
            System.out.print(r.data + " ");
            r = r.next;
        }
        System.out.print(r.data + " ");
    }
}
