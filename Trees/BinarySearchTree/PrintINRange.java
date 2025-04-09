package Trees.BinarySearchTree;

class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}

public class PrintINRange {
    // Function to print nodes within a given range
    public static void printInRange(Node root, int k1, int k2) {
        if (root == null) {
            return; // Base condition for recursion
        }

        // Node's data lies within the range
        if (root.data >= k1 && root.data <= k2) {
            printInRange(root.left, k1, k2);  // Continue searching on the left side
            System.out.print(root.data + " "); // Print the node's data
            printInRange(root.right, k1, k2); // Continue searching on the right side
        }

        // Node's data is less than k1 (only search in the right subtree)
        else if (root.data < k1) {
            printInRange(root.right, k1, k2);
        }

        // Node's data is greater than k2 (only search in the left subtree)
        else {
            printInRange(root.left, k1, k2);
        }
    }

    // Utility function to insert nodes in BST
    public static Node insert(Node root, int value) {
        if (root == null) {
            return new Node(value);
        }
        if (value < root.data) {
            root.left = insert(root.left, value);
        } else {
            root.right = insert(root.right, value);
        }
        return root;
    }

    // Main method to test
    public static void main(String[] args) {
        Node root = null;
        root = insert(root, 8);
        root = insert(root, 3);
        root = insert(root, 10);
        root = insert(root, 1);
        root = insert(root, 6);
        root = insert(root, 14);
        root = insert(root, 4);
        root = insert(root, 7);
        root = insert(root, 13);

        int k1 = 5, k2 = 12;
        System.out.println("Nodes in range [" + k1 + ", " + k2 + "]:");
        printInRange(root, k1, k2);  // Expected Output: 6 7 8 10
    }
}

