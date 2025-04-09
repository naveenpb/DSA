package Trees.BinarySearchTree;

// Node class to define the structure of a BST node
class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}

public class SortedArrayToBST {

    // Function to construct BST from inorder traversal
    public static Node constructBST(int[] inorder, int start, int end) {
        if (start > end) {
            return null;
        }

        // Find the middle element and make it the root
        int mid = (start + end) / 2;
        Node root = new Node(inorder[mid]);

        // Recursively construct the left and right subtrees
        root.left = constructBST(inorder, start, mid - 1);
        root.right = constructBST(inorder, mid + 1, end);

        return root;
    }

    // Function to print the BST using Inorder Traversal
    public static void inorderTraversal(Node root) {
        if (root != null) {
            inorderTraversal(root.left);
            System.out.print(root.data + " ");
            inorderTraversal(root.right);
        }
    }

    // Main method to execute the program
    public static void main(String[] args) {
        int[] inorder = {1, 2, 3, 4, 5, 6, 7};  // Sample inorder array
        Node root = constructBST(inorder, 0, inorder.length - 1);

        System.out.println("Inorder Traversal of the Constructed BST:");
        inorderTraversal(root);
    }
}

