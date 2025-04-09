package Trees.BinaryTree;

public class Preorder {
    public static void preorder(BuildTreeByPreorder.Node root){
        if(root == null){
            return;
        }
        
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }
}
