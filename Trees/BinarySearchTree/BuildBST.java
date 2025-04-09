package Trees.BinarySearchTree;

public class BuildBST {
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static Node buildBST(Node root , int data){ // O(n) where n is the number of nodes in the tree
        if(root == null){ // base case
            root = new Node(data);
            return root;            
        }   

        if(root.data > data){ // left subtree 
            root.left = buildBST(root.left , data);
        }else{ // right subtree
            root.right = buildBST(root.right , data);
        }

        return root;
    }

    public static void main(String[] args) {
        Node root = null;
        root = buildBST(root , 5);
        root = buildBST(root , 1);
        root = buildBST(root , 3);
        root = buildBST(root , 4);
        root = buildBST(root , 2);
        root = buildBST(root , 7);

        System.out.println(root.data);
        System.out.println(root.left.data);
        System.out.println(root.right.data);    
        
    }
}
