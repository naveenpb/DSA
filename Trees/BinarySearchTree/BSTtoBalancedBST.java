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

public class BSTtoBalancedBST {

    // Perform inorder traversal and store elements in an array
    public static void storeInorder(Node root, ArrayList<Integer> inorder) {
        if (root == null) {
            return;
        }
        storeInorder(root.left, inorder);
        inorder.add(root.data);
        storeInorder(root.right, inorder);
    }

    // Construct a balanced BST using sorted array
    public static Node constructBalancedBST(ArrayList<Integer> inorder, int start, int end) {
        if (start > end) {
            return null;
        }

        int mid = (start + end) / 2;
        Node root = new Node(inorder.get(mid));

        root.left = constructBalancedBST(inorder, start, mid - 1);
        root.right = constructBalancedBST(inorder, mid + 1, end);

        return root;
    }

    // Function to convert BST to balanced BST
    public static Node convertToBalancedBST(Node root) {
        ArrayList<Integer> inorder = new ArrayList<>();
        storeInorder(root, inorder);
        return constructBalancedBST(inorder, 0, inorder.size() - 1);
    }

    // Utility function to print inorder traversal
    public static void inorderTraversal(Node root) {
        if (root != null) {
            inorderTraversal(root.left);
            System.out.print(root.data + " ");
            inorderTraversal(root.right);
        }
    }

    // Main method to execute the code
    public static void main(String[] args) {
        // Creating an unbalanced BST
        Node root = new Node(10);
        root.left = new Node(5);
        root.left.left = new Node(3);
        root.left.left.left = new Node(1);

        System.out.println("Inorder Traversal of Original Unbalanced BST:");
        inorderTraversal(root);

        // Convert the BST to a balanced BST
        root = convertToBalancedBST(root);

        System.out.println("\nInorder Traversal of Balanced BST:");
        inorderTraversal(root);
    }
}

