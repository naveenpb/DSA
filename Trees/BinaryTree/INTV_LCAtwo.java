package Trees.BinaryTree;
import Trees.BinaryTree.BuildTreeByPreorder.Node;

public class INTV_LCAtwo {
    public static Node lca2(Node root, int n1, int n2) {
        if (root == null || root.data == n1 || root.data == n2) {  // ✅ Base case first , always we have to chekc the root node first, if ot then the root.data may cause null pointer exception
            return root;
        }

        Node leftLCA = lca2(root.left, n1, n2);
        Node rightLCA = lca2(root.right, n1, n2);

        if (leftLCA != null && rightLCA != null) {  // ✅ If both nodes are found, return root
            return root;
        }

        return (leftLCA != null) ? leftLCA : rightLCA;  // ✅ Return non-null child
    }
}
