package Trees.BinarySearchTree;

import java.util.ArrayList;

class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}

public class PrintAllPaths {

    // Function to print all paths from root to leaf
    public static void printRoot2Leaf(Node root, ArrayList<Integer> path) {
        if (root == null) {
            return; // Base condition for recursion
        }

        path.add(root.data); // Add the current node's data to the path

        // If it's a leaf node, print the path
        if (root.left == null && root.right == null) {
            printPath(path);
        }

        // Recursive calls for left and right subtrees
        printRoot2Leaf(root.left, path);
        printRoot2Leaf(root.right, path);

        // Backtrack: remove the last element to explore other paths
        path.remove(path.size() - 1);
    }

    // Utility function to print a path
    public static void printPath(ArrayList<Integer> path) {
        for (int val : path) {
            System.out.print(val + " ");
        }
        System.out.println();  // New line after printing a path
    }

    // Main method to test the code
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println("All Root-to-Leaf Paths:");
        printRoot2Leaf(root, new ArrayList<>());
    }
}
