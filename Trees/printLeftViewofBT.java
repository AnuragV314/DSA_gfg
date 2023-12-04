
// Print Left View of Binary Tree
import java.util.LinkedList;
import java.util.Queue;

class Node {
    int key;
    Node left, right;

    Node(int k) {
        key = k;
        left = right = null;
    }
}

public class printLeftViewofBT {

    // Method 1(Recursive)
    static int maxLevel = 0;

    static void printLeft(Node root, int level) {
        if (root == null)
            return;
        if (maxLevel < level) {
            System.out.print(root.key + " ");
            maxLevel = level;
        }
        printLeft(root.left, level + 1);
        printLeft(root.right, level + 1);
    }

    static void printLeftView(Node root) {
        printLeft(root, 1);
    }

    // Method 2(Iterative)
    static void printLeft1(Node root) {
        if (root == null)
            return;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (q.isEmpty() == false) {
            int count = q.size();

            for (int i = 0; i < count; i++) {
                Node curr = q.poll();

                if (i == 0)
                    System.out.print(curr.key + " ");
                    
                if (curr.left != null)
                    q.add(curr.left);
                if (curr.right != null)
                    q.add(curr.right);
            }
        }

    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.right.left = new Node(40);
        root.right.right = new Node(50);

        // printLeftView(root);
        printLeft1(root);
    }
}
