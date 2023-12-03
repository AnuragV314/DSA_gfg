/**
 * Simple binaryTree
 */

class Node{
    int key ;
    Node left;
    Node right;
    Node(int k){
        key = k;
        left = right = null;
    }
}

public class binaryTree {

    static void printTree(Node root){

        if(root == null){
            return;
        }
        System.out.print(root.key+" ");
        printTree(root.left);
        printTree(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);

        printTree(root);
    }
}