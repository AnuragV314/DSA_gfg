// Count nodes in a Complete Binary Tree
class Node {
    int key;
    Node left, right;

    Node(int k) {
        key = k;
        left = right = null;
    }
}

public class CountNodesBT {

    // Naive solution 
    static int countNode(Node root) {
        if (root == null)
            return 0;
        else
            return 1 + countNode(root.left) + countNode(root.right);
    }

    // effective solution

    static int countNode1(Node root){
        int lh = 0 , rh = 0;
        Node curr = root;
        while (curr != null) {
           lh++;
           curr = curr.right; 
        }
        while (curr != null) {
            rh++;
            curr = curr.left;
        }

        if(lh==rh){
            return (int)Math.pow(2, lh) -1;
        }
        else{
            return 1 + countNode1(root.left) + countNode1(root.right);
        }
    }

    public static void main(String[] args) {
        Node root=new Node(10);
    	root.left=new Node(20);
    	root.right=new Node(30);
    	root.right.left=new Node(40);
    	root.right.right=new Node(50);

        System.out.print(countNode(root));
        System.out.println();
        System.out.print(countNode1(root));
    }
}
