/**
 * Insert in BST
 **/

class Node {
    int key;
    Node left, right;

    Node(int k) {
        key = k;
        left = right = null;
    }
}

public class Insert {
    // Recursive Code
    static Node insert(Node root, int x) {
        if (root == null) {
            return new Node(x);
        } else if (root.key < x) {
            root.right = insert(root.right, x);
        } else if (root.key > x) {
            root.left = insert(root.left, x);
        }
        return root;
    }

    // Iterative Code
    static Node insertI(Node root, int x) {
        Node temp = new Node(x);
        Node parent = null, curr = root;
        while (curr != null) {
            parent = curr;
            if (curr.key > x)
                curr = curr.left;
            else if (curr.key < x)
                curr = curr.right;
            else
                return root;
        }
        if (parent == null)
            return temp;
        if (parent.key > x)
            parent.left = temp;
        else
            parent.right = temp;
        return root;
    }

    static void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.key + " ");
            inorder(root.right);
        }
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(15);
        root.right.left = new Node(12);
        root.right.right = new Node(18);
        int x = 20;

        root = insert(root, x);
        // root = insert(root, x);
        inorder(root);
    }
}
