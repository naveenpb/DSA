package Trees.BinaryTree;

public class INTV_IsSubTree {
    public static boolean isSubTree(BuildTreeByPreorder.Node root1, BuildTreeByPreorder.Node subroot) {
        if(root1 == null){
            return false;
        }
        if(root1.data == subroot.data) {
            return isIdentical(root1, subroot);
        }

      return isSubTree(root1.left, subroot) || isSubTree(root1.right, subroot);

        
    }


public static boolean isIdentical(BuildTreeByPreorder.Node root1, BuildTreeByPreorder.Node subrootNode ) {    
    if(root1 == null && subrootNode == null){
        return true; //andre last ge eredu null adre
    }

    else if (root1 == null || subrootNode == null || root1.data != subrootNode.data){
        return false;     //andre yavudu ondu false adru false return madbeku  
    }

    if(!isIdentical(root1.left, subrootNode.left)){
        return false;
    }
    if(!isIdentical(root1.right, subrootNode.right)){    
        return false;
    }

    return true;



}

    public static void main(String[] args) {
        // main tree
        BuildTreeByPreorder.Node root = new BuildTreeByPreorder.Node(1);
        root.left = new BuildTreeByPreorder.Node(2);
        root.right = new BuildTreeByPreorder.Node(3);
        root.left.left = new BuildTreeByPreorder.Node(4);
        root.left.right = new BuildTreeByPreorder.Node(5);
        root.right.left = new BuildTreeByPreorder.Node(6);
        root.right.right = new BuildTreeByPreorder.Node(7);

        // Creating the subtree
        BuildTreeByPreorder.Node subRoot = new BuildTreeByPreorder.Node(2);
        subRoot.left = new BuildTreeByPreorder.Node(4);
        subRoot.right = new BuildTreeByPreorder.Node(5);

        System.out.println(isSubTree(root, subRoot));
    }
}
