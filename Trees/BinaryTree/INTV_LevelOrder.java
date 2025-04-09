package Trees.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class INTV_LevelOrder {
    public static void levelorder(BuildTreeByPreorder.Node root){
        if(root == null){
            return;
        }

        Queue<BuildTreeByPreorder.Node> q = new LinkedList<>();

        q.add(root);
        q.add(null); //because we want to print new line if we remove null form the queue
        
        while(!q.isEmpty()){
            BuildTreeByPreorder.Node currnode = q.remove();
            if(currnode == null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
            }
            else{
                System.out.print(currnode.data + " ");
                if(currnode.left != null){
                    q.add(currnode.left);
                }
                if(currnode.right != null) {
                    q.add(currnode.right);
                }
            }
        }

    }
}
