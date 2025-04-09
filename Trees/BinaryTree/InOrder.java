package Trees.BinaryTree;

public class InOrder {
    public static void inorder(BuildTreeByPreorder.Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
}
