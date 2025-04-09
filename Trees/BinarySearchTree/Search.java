package Trees.BinarySearchTree;
import Trees.BinarySearchTree.BuildBST.Node;

public class Search {
    public static boolean Searchnode(Node root , int key){ // O(h) where h is the height of the tree
        if(root == null){ // base case
            return false;
        }

        if(root.data == key){ // base case
            return true;
        }

        if(root.data > key){
            return Searchnode(root.left , key);
        }else{            
            return Searchnode(root.right , key);            
        }
    }
}
