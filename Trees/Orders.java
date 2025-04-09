package Trees;
import java.util.*;
public class Orders {
    // pre , in , post = o(n)
    static class Node{
        int data;
        Node right;
        Node left;

        Node(int data){
            this.data = data;
            this.right = null;
            this.left = null;
        }
    }

    static int indx = -1;

    public static Node buildtree(int nodes[]){
        indx ++;
        if (nodes[indx] == -1) {
            return null;
        }

        Node newnode = new Node(nodes[indx]);
        newnode.left = buildtree(nodes);
        newnode.right = buildtree(nodes);

        return newnode ; 

    }

    public static void preorder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data + " ");
       
        preorder(root.left);
        preorder(root.right);
    }



    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
       
        inorder(root.right);

    }

    public static void postorder(Node root){
        if(root == null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    public static void levelorder(Node root){
        
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()) {
            Node currnode = q.remove();
            if(currnode == null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null); //think you will get it , its queue bro
                }
            }

            else{
                System.out.print(currnode.data + " ");
                if(currnode.left != null){
                    q.add(currnode.left);
                }
                if(currnode.right != null){
                    q.add(currnode.right);
                }
            }


        }

    }


    public static void main(String[] args) {
        int nodes[ ] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1}; //-one means null here node data
        Node root = buildtree(nodes);
        preorder(root);
        System.out.println();
        inorder(root);
        System.out.println();
        postorder(root);
        System.out.println();
        levelorder(root);
    }
}
