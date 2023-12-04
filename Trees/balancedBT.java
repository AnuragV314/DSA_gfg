// Check for Balanced Binary Tree
class Node {
    int key;
    Node left, right;

    Node(int k) {
        key = k;
        left = right = null;
    }
}

public class balancedBT {

    // Naive approach O(n^2)
    static int height(Node root) {
        if (root == null)
            return 0;
        else
            return (1 + Math.max(height(root.left), height(root.right)));
    }

    static boolean isBalanced(Node root) {
        if (root == null)
            return true;
        int lh = height(root.left);
        int rh = height(root.right);

        return (Math.abs(lh - rh) <= 1 && isBalanced(root.left) && isBalanced(root.right));
    }

    // Efficient approach O(n)
    static int isBalanced1(Node root) {
        if (root == null)
            return 0;
        int lh = isBalanced1(root.left);
        if (lh == -1)
            return -1;
        int rh = isBalanced1(root.right);
        if (rh == -1)
            return -1;

        if (Math.abs(lh - rh) > 1)
            return -1;
        else
            return Math.max(lh, rh) + 1;
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(30);
        root.right.left = new Node(15);
        root.right.right = new Node(20);

        System.out.println(isBalanced(root));
        if(isBalanced1(root)>0)
    	    System.out.print("Balanced");
    	else
    	    System.out.print("Not Balanced");
    }
}
