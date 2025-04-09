package Trees.BinarySearchTree;

// Node class to define the structure of a tree node
class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}

public class INTV_MirrorBinaryTree {

    // Function to create a mirror of the binary tree
    public static Node createMirror(Node root) {
        if (root == null) {
            return null;
        }

        // Recursive calls to create mirror for left and right subtrees
        Node leftMirror = createMirror(root.left);
        Node rightMirror = createMirror(root.right);

        // Swapping the left and right pointers
        root.left = rightMirror;
        root.right = leftMirror;

        return root;
    }

    // Function to print the tree in Inorder Traversal
    public static void inorderTraversal(Node root) {
        if (root != null) {
            inorderTraversal(root.left);
            System.out.print(root.data + " ");
            inorderTraversal(root.right);
        }
    }

    // Utility function to build a sample binary tree
    public static Node createSampleTree() {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        return root;
    }

    // Main method to execute the program
    public static void main(String[] args) {
        Node root = createSampleTree();

        System.out.println("Original Tree (Inorder Traversal): ");
        inorderTraversal(root);

        createMirror(root);  // Create the mirror of the tree

        System.out.println("\nMirrored Tree (Inorder Traversal): ");
        inorderTraversal(root);
    }
}

