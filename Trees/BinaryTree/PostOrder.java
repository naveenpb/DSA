package Trees.BinaryTree;

public class PostOrder {
    public static void postorder(BuildTreeByPreorder.Node root){
        if(root == null){
            return;
        }
    
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }
}
