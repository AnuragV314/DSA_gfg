// Diameter of a Binary Tree
class Node {
    int key;
    Node left, right;

    Node(int k) {
        key = k;
        left = right = null;
    }
}

public class DiameterOfBT {

    // Naive solution O(n^2)
    static int height(Node root) {
        if (root == null)
            return 0;
        else
            return 1 + Math.max(height(root.left), height(root.right));
    }

    static int diameter(Node root) {
        if (root == null)
            return 0;
        int d1 = 1 + height(root.left) + height(root.right);
        int d2 = diameter(root.left);
        int d3 = diameter(root.right);

        return Math.max(d1, Math.max(d2, d3));
    }

    // Naive solution O(n)
    static int res = 0;

    static int height1(Node root) {
        if (root == null)
            return 0;
        int lh = height(root.left);
        int rh = height(root.right);
        // res = Math.max(res, 1 + lh + rh);
        // return 1 + Math.max(lh, rh);
        return 1+lh+rh;
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.right.left = new Node(40);
        root.right.right = new Node(60);
        root.right.left.left = new Node(50);
        root.right.right.right = new Node(70);

        System.out.print(diameter(root));
        System.out.println();

        // System.out.println("Height: "+height1(root));
    	// System.out.println("Diameter: "+res);

        System.out.println("Diameter: "+height1(root));
    }
}
