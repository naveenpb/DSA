package Trees.BinarySearchTree;
import Trees.BinarySearchTree.BuildBST.Node;

public class BSTinBT {
        // Class to hold information about the subtree
    static class Info {
        boolean isBST; // Indicates if the subtree is a BST
        int size;      // Size of the subtree
        int min;       // Minimum value in the subtree
        int max;       // Maximum value in the subtree

    // Constructor to initialize Info object
    public Info(boolean isBST, int size, int min, int max) {
        this.isBST = isBST;
        this.size = size;
        this.min = min;
        this.max = max;
    }
}

// Variable to track the maximum size of a BST in the tree
public static int maxBST = 0;

// Function to find the largest BST in a binary tree
public static Info largestBST(Node root) {
    // Base case: If node is null, treat it as a BST of size 0
    if (root == null) {
        return new Info(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
    }

    // Recursively get information about left and right subtrees
    Info leftInfo = largestBST(root.left);
    Info rightInfo = largestBST(root.right);

    // Calculate the size, min, and max for the current subtree
    int size = leftInfo.size + rightInfo.size + 1;
    int min = Math.min(root.data, Math.min(leftInfo.min, rightInfo.min));
    int max = Math.max(root.data, Math.max(leftInfo.max, rightInfo.max));

    // Check if the current subtree is a BST
    if (root.data <= leftInfo.max || root.data >= rightInfo.min) {
        return new Info(false, size, min, max); // Not a BST
    }

    // If both left and right subtrees are BSTs, update maxBST
    if (leftInfo.isBST && rightInfo.isBST) {
        maxBST = Math.max(maxBST, size); // Track the largest BST size found
        return new Info(true, size, min, max); // Return info for valid BST
    }

    // If not a BST, return false with relevant size info
    return new Info(false, size, min, max);
}

// Main method to run the code
public static void main(String args[]) {
    // Sample tree can be constructed here for testing
    Node root = new Node(50);
    root.left = new Node(30);
    root.right = new Node(60);
    root.left.left = new Node(5);
    root.left.right = new Node(20);
    root.right.left = new Node(45);
    root.right.right = new Node(70);

    // Calculate the maximum size of BST in the tree
    largestBST(root);
    System.out.println("Size of the largest BST is: " + maxBST);
}

}
