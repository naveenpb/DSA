package Trees.BinaryTree;

import java.util.ArrayList;
import Trees.BinaryTree.BuildTreeByPreorder.Node;;

public class BinaryTreePath {
    
    public static boolean findPath(Node root, int target, ArrayList<Integer> path) {
        if (root == null) return false;

        // Add the current node to the path
        path.add(root.data);

        // If the current node is the target, return true
        if (root.data == target) return true;

        // Recursively check left and right subtrees
        if (findPath(root.left, target, path) || findPath(root.right, target, path)) {
            return true;
        }

        // If not found, backtrack (remove the node from the path)
        path.remove(path.size() - 1);
        return false;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        int target = 5;
        ArrayList<Integer> path = new ArrayList<>();

        if (findPath(root, target, path)) {
            System.out.println("Path to node " + target + ": " + path);
        } else {
            System.out.println("Node " + target + " not found in the tree.");
        }
    }
}

