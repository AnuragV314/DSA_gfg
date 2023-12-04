// Convert Binary Tree to Doubly Linked List
class Node {
    int key;
    Node left, right;

    Node(int k) {
        key = k;
        left = right = null;
    }
}

public class ConvertBTtoDLL {
    static Node prev = null;

    static Node BTToDLL(Node root) {
        if (root == null)
            return root;
            
        Node head = BTToDLL(root.left);
        if (prev == null) {
            head = root;
        } else {
            root.left = prev;
            prev.right = root;
        }
        prev = root;
        BTToDLL(root.right);
        return head;
    }

    static void printlist(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.println(curr.key + " ");
            curr = curr.right;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(20);
        root.right.left = new Node(30);
        root.right.right = new Node(35);

        Node head = BTToDLL(root);
        printlist(head);
    }
}
