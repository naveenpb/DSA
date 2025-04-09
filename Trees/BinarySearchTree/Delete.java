package Trees.BinarySearchTree;
import Trees.BinarySearchTree.BuildBST.Node;

public class Delete {
    public static Node delete(Node root , int val){

        if(val > root.data){
            delete(root.right, val);
        }

        else if(val<root.data){
            delete(root.left, val);
        }

        else{
            // single node , leaf node
            if(root.left == null && root.right == null){

                return null ;

            }
            // single node
            else if(root.left == null){
                return root.right;
            }

            else if (root.right == null){
                return root.left;
            }

            else{
                Node Is = inOrderSucessor(root.right) ;// we have to find the inorder sucessor , so we are doing this ,AND root.right is used because inorder sucessor in a bst is the minimum (leftmost) value in the right sub tree
                root.data = Is.data;
                root.right = delete(root.right, Is.data);
            }
        }

        return root;
        

    }

    public static Node inOrderSucessor(Node root){
        while(root != null){
            root = root.left;
        }
        return root;
    }
}
