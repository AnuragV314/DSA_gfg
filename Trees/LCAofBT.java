// LCA of Binary Tree
// LCA (Lowest Common Ancestor)

import java.util.ArrayList;

class Node {
    int key;
    Node left, right;

    Node(int k) {
        key = k;
        left = right = null;
    }
}

public class LCAofBT {

    // Native solution
    static boolean findPath(Node root, ArrayList<Node> p, int n) {
        if (root == null)
            return false;
        p.add(root);
        if (root.key == n)
            return true;
        if (findPath(root.left, p, n) || findPath(root.right, p, n))
            return true;

        p.remove(p.size() - 1);
        return false;
    }

    static Node lca(Node root, int n1, int n2) {
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();
        if (findPath(root, path1, n1) == false || findPath(root, path2, n2) == false)
            return null;
        for (int i = 0; i < path1.size() - 1 && i < path2.size() - 1; i++)
            if (path1.get(i + 1) != path2.get(i + 1))
                return path1.get(i);
        return null;
    }


    // efficient solution
    public static Node lca1(Node root, int n1, int n2){
        if(root==null)return null;
        if(root.key==n1||root.key==n2)
            return root;
        
        Node lca1=lca(root.left,n1,n2);
        Node lca2=lca(root.right,n1,n2);
        
        if(lca1!=null && lca2!=null)
            return root;
        if(lca1!=null)
            return lca1;
        else
            return lca2;
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.right.left = new Node(40);
        root.right.right = new Node(50);
        int n1 = 20, n2 = 50;

        // Node ans = lca(root, n1, n2);
        Node ans1 = lca1(root, n1, n2);
        System.out.println("LCA: " + ans1.key);
    }
}
