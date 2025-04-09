package Trees.BinaryTree;

import java.util.ArrayList;
// O(N)
import Trees.BinaryTree.BuildTreeByPreorder.Node;;

public class LowestCommonAncestorPathMethod {

    // ✅ Function to find the path from root to a target node and store it in the list
    public static boolean findPath(Node root, int target, ArrayList<Node> path) {
        if (root == null) return false;

        // 🔹 Add the current node to the path
        path.add(root);

        // ✅ If this node is the target node, return true
        if (root.data == target) return true;

        // 🔹 Recursively check left and right subtrees
        if (findPath(root.left, target, path) || findPath(root.right, target, path)) {
            return true;
        }

        // ❌ If target is not found in this path, backtrack (remove last added node)
        path.remove(path.size() - 1);
        return false;
    }

    // ✅ Function to find LCA using the path method
    public static Node findLCA(Node root, int n1, int n2) {
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();

        // 🔹 Find the path from root to n1 and n2
        boolean foundN1 = findPath(root, n1, path1);
        boolean foundN2 = findPath(root, n2, path2);

        // ❌ If either node is missing, return null
        if (!foundN1 || !foundN2) {
            return null;
        }

        // ✅ Compare both paths to find the last common node
        int i;
        Node lca = null; // Store the last common ancestor

        for (i = 0; i < Math.min(path1.size(), path2.size()); i++) {
            if (path1.get(i) != path2.get(i)) {
                break;
            }
            lca = path1.get(i); // Update LCA
        } ///this works , if check notes for example


        // 🔹 The last common node before paths diverge is the LCA
        return lca;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        int n1 = 4, n2 = 5;
        Node lca = findLCA(root, n1, n2);

        if (lca != null) {
            System.out.println("Lowest Common Ancestor of " + n1 + " and " + n2 + " is: " + lca.data);
        } else {
            System.out.println("One or both nodes are not present in the tree.");
        }

        Node lca1 = INTV_LCAtwo.lca2(root, n1, n2);
        System.out.println(lca1.data);

        int n3 = 4, n4 = 6;
        System.out.println("Minimum distance between " + n3 + " and " + n4 + " is: " + INTV_MIN_DIST.minDist(root, n3, n4));
    }
}

