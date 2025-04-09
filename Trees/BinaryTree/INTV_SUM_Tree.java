package Trees.BinaryTree;
import Trees.BinaryTree.BuildTreeByPreorder.Node;
public class INTV_SUM_Tree {
    // O(n)
    public static int transform(Node root){

        if(root == null){
            return 0;
        }

        int leftchild = transform(root.left);
        int rightchild = transform(root.right);

        int data = root.data;


        int newleft = root.left == null ? 0 : root.left.data;
        int newright = root.right == null ? 0 : root.right.data;
        
        root.data = newleft + leftchild + newright + rightchild  ;
        return data;

    }
}
