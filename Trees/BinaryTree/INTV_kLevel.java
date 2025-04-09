package Trees.BinaryTree;
import Trees.BinaryTree.BuildTreeByPreorder.Node;;

public class INTV_kLevel {
    public static void klevel(Node root , int level , int k) {
        if(root == null) {
            return ;
        }
        if(level == k ){
            System.out.println(root.data);
        }
        klevel(root.left , level+1 , k);
        klevel(root.right , level+1 , k);   
    }
}

