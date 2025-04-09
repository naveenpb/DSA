package Trees.BinarySearchTree;
import java.util.*;

class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}

public class MergeTwoBst {

    // Merging two BSTs into a sorted array
    public static Node mergeTrees(Node root1, Node root2) {
        ArrayList<Integer> inorder1 = new ArrayList<>();
        ArrayList<Integer> inorder2 = new ArrayList<>();

        inorder(root1, inorder1);  // Inorder traversal for first tree
        inorder(root2, inorder2);  // Inorder traversal for second tree

        inorder1.addAll(inorder2);  // Merge lists directly
        Collections.sort(inorder1); // Sort merged list

        return buildTreeByInorder(inorder1, 0, inorder1.size() - 1);
    }

    // Inorder traversal method
    public static void inorder(Node root, ArrayList<Integer> list) {
        if (root == null) return;
        inorder(root.left, list);
        list.add(root.data);
        inorder(root.right, list);
    }

    // Builds BST from a sorted array list
    public static Node buildTreeByInorder(ArrayList<Integer> list, int start, int end) {
        if (start > end) return null;
        int mid = (start + end) / 2;
        Node root = new Node(list.get(mid));
        root.left = buildTreeByInorder(list, start, mid - 1);
        root.right = buildTreeByInorder(list, mid + 1, end);
        return root;
    }

    // Display BST using inorder traversal
    public static void inorderTraversal(Node root) {
        if (root != null) {
            inorderTraversal(root.left);
            System.out.print(root.data + " ");
            inorderTraversal(root.right);
        }
    }

    public static void main(String[] args) {
        Node root1 = new Node(100);
        root1.left = new Node(50);
        root1.right = new Node(300);
        root1.left.left = new Node(20);
        root1.left.right = new Node(70);

        Node root2 = new Node(80);
        root2.left = new Node(40);
        root2.right = new Node(120);

        Node mergedRoot = mergeTrees(root1, root2);
        System.out.println("Inorder Traversal of the Merged BST:");
        inorderTraversal(mergedRoot);
    }
}
