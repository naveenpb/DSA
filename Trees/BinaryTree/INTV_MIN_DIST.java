package Trees.BinaryTree;
import Trees.BinaryTree.BuildTreeByPreorder.Node;


public class INTV_MIN_DIST {
    // misnimum distance bt two nodes
    public static int minDist(Node root , int n1 , int n2){
        Node lca = INTV_LCAtwo.lca2(root , n1 , n2);
        int dist = lcaDist(lca , n1);
        int dist2 = lcaDist(lca,n2);

        return dist + dist2;
    }

    public static int lcaDist(Node root , int n1){
        
        if(root == null){
            return -1 ;
        }
        if(root.data == n1){
            return 0 ;
        }   
       

        int left = lcaDist(root.left , n1);     
        int right = lcaDist(root.right , n1);

        if(left == -1 && right == -1){  
            return -1 ;
        }

        else if(left == -1){
            return right + 1 ;
        }

        else{
            return left + 1 ;
        }
    }

}
