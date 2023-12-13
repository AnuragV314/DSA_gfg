// Serialize and Deserialize a Binary Tree

import java.util.ArrayList;

class Node {
    int key;
    Node left, right;

    Node(int k) {
        key = k;
        left = right = null;
    }
}

public class SerializeAndDeserializeBT {
    static final int EMPTY = -1;

    // Serialize
    static void serialize(Node root, ArrayList<Integer> arr) {
        if (root == null) {
            arr.add(EMPTY);
            return;
        }

        arr.add(root.key);
        serialize(root.left, arr);
        serialize(root.right, arr);
    }

    // Deserialize
    static int index = 0;

    static Node deserialize(ArrayList<Integer> arr) {
        if (index == arr.size())
            return null;
        int val = arr.get(index);
        index++;
        if (val == EMPTY)
            return null;

        Node root = new Node(val);
        root.left = deserialize(arr);
        root.right = deserialize(arr);

        return root;
    }

    static void inorder(Node root){
        if (root!= null){
            inorder(root.left);
            System.out.print(root.key+" ");
            inorder(root.right);
        }
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);

        ArrayList<Integer> arr = new ArrayList<>();
        serialize(root, arr);
        for (int x : arr) {
            System.out.print(x + " ");
        }

        Node root_new = deserialize(arr);
        System.out.println();
        inorder(root_new);
    }   
}
