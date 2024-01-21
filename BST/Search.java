// Search in BST 

class Node {
    int key;
    Node left, right;

    Node(int k) {
        key = k;
        left = right = null;

    }
}

public class Search {
    // Iterative Code
    static boolean search(Node root, int x) {
        while (root != null) {
            if (root.key == x) {
                return true;
            } else if (root.key < x) {
                root = root.right;
            } else
                root = root.left;
        }
        return false;
    }

    // Recursive Code
    static boolean searchR(Node root, int x) {
        if (root == null) {
            return false;
        }
        if (root.key == x) {
            return true;
        } else if (root.key > x) {
            return searchR(root.left, x);
        } else
            return searchR(root.right, x);

    }

    public static void main(String[] args) {
        Node root = new Node(15);
        root.left = new Node(5);
        root.left.left = new Node(3);
        root.right = new Node(20);
        root.right.left = new Node(18);
        root.right.left.left = new Node(16);
        root.right.right = new Node(80);
        int x = 16;

        if (search(root, x)) {
            System.out.println("Found");
        } else {
            System.out.println("Not found");
        }

        if (searchR(root, x)) {
            System.out.println("Found");
        } else {
            System.out.println("Not found");
        }
    }
}
