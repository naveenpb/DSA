package Trees.BinaryTree;

public class Sum {
    public static int sum(BuildTreeByPreorder.Node root){
        if(root == null){
            return 0 ; 
        }

        int ls = sum(root.left);
        int rs = sum(root.right );

        return ls+rs+root.data;
    }
}
