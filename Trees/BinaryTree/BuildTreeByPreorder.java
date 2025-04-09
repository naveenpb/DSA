package Trees.BinaryTree;
// build tree using preorder sequence
public class BuildTreeByPreorder {

    static class Node {
        int data ;
        Node left ;
        Node right;

        Node(int data ){
            this.data = data;
            this.left = null ; 
            this.right = null;
        }
    }

    static class BinaryTree{
        static int idx = -1;
        public static Node buildtree(int nodes[]){
            idx++;

            if(nodes[idx] == -1){
                return null;
            }

            Node newNode  =  new Node(nodes[idx]);
            newNode.left = buildtree(nodes);
            newNode.right = buildtree(nodes);
            return newNode;
        }
    }
    
}
