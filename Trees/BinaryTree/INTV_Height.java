package Trees.BinaryTree;

public class INTV_Height {
    public static int height(BuildTreeByPreorder.Node root){
        if(root == null){
            return 0;
        }

        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh, rh) + 1; //because in computer the root height is 0
    }
}
