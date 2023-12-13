import java.util.Stack;

class Node {
    int key;
    Node left, right;

    Node(int k) {
        key = k;
        left = right = null;
    }
}

public class IterativeInorderTraversal {
    static void iterativeInorder(Node root) {
        Stack<Node> st = new Stack<>();
        Node curr = root;
        while (curr != null || st.isEmpty() == false) {
            while (curr != null) {
                st.push(curr);
                curr = root.left;
            }
            curr = st.pop();
            System.out.println(curr.key + " ");
            curr = root.right;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.right.left = new Node(8);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.right.right.left = new Node(9);
        root.right.right.right = new Node(10);

        iterativeInorder(root);
    }
}
