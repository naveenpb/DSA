package Trees.BinaryTree;

public class Count {
    public static int count (BuildTreeByPreorder.Node root){
        if(root == null){
            return 0;
        }

        int lh = count(root.left);
        int rh = count(root.right);
        return (lh+ rh +1);

    }
}
