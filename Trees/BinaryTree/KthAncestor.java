package Trees.BinaryTree;

import Trees.BinaryTree.BuildTreeByPreorder.Node;

public class KthAncestor {
    public static int Kansestor(Node root, int n1, int k) {
        if (root == null) {
            return -1;
        }
        
        if (root.data == n1) {
            return 0; // Found the target node
        }

        int leftDist = Kansestor(root.left, n1, k);
        int rightDist = Kansestor(root.right, n1, k);

        if (leftDist == -1 && rightDist == -1) {
            return -1; // Node not found in this subtree
        }

        int max = Math.max(leftDist, rightDist);

        if ((max + 1) == k) {
            System.out.println("Kth Ancestor: " + root.data);
            
        }

        return max + 1; // Continue tracking the path
    }
}
