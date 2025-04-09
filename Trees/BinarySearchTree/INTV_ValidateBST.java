package Trees.BinarySearchTree;

class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}

// Approch 1 : If we take the inOrder traversal of the tree and store it in an array, then if that is sorted then the tree is a valid BST
// Approch 2 : take the min value of the left subtree and max value of the right subtree and check if the current node is in between those values
// here the minvalue in right subtree is the inorder sucessor , and the maxvalue in left subtree is the inorder predecessor.

public class INTV_ValidateBST {

    // Function to check if a binary tree is a valid BST
    public static boolean isValidBST(Node root, Node min, Node max) {
        if (root == null) {
            return true;  // An empty tree is a valid BST
        }

        // Check if the current node violates the BST properties
        if (min != null && root.data <= min.data) {
            return false;
        }

        if (max != null && root.data >= max.data) {
            return false;
        }

        // Recursively check left and right subtrees
        return isValidBST(root.left, min, root) &&
               isValidBST(root.right, root, max);
    }

    // Utility function to build a sample tree
    public static Node createTree() {
        Node root = new Node(5);
        root.left = new Node(3);
        root.right = new Node(7);
        root.left.left = new Node(2);
        root.left.right = new Node(4);
        root.right.left = new Node(6);
        root.right.right = new Node(8);

        return root;
    }

    // Main method to test the code
    public static void main(String[] args) {
        Node root = createTree();

        if (isValidBST(root, null, null)) {
            System.out.println("The tree is a valid BST.");
        } else {
            System.out.println("The tree is NOT a valid BST.");
        }
    }
}

