class Node {
    int key;
    Node left, right;

    Node(int k) {
        key = k;
        left = right = null;
    }
}

public class heightOfBT {
    static int maxDepth(Node root) {
        if (root == null) {
            return 0;
        } else {
            int lDepth = maxDepth(root.left);
            int rDepth = maxDepth(root.right);

            if (lDepth > rDepth)
                return lDepth + 1;
            else
                return rDepth + 1;
        }
    }


    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);


        System.out.println("Height of tree is: "+ maxDepth(root));
    }
}
