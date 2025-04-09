package Trees.BinaryTree;


import Trees.BinaryTree.BuildTreeByPreorder.BinaryTree;

public class MainClass {
    public static void main(String[] args) {


        System.out.println("This is the Tree");
        System.out.println("        1");
        System.out.println("       / \\");
        System.out.println("      2   3");
        System.out.println("     / \\    \\");
        System.out.println("    4   5    6");
        
        
        
        // tree building
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1}; //-one means null here node data
        BuildTreeByPreorder.Node root = BinaryTree.buildtree(nodes);
        System.out.println("This is the Root");
        System.out.println(root.data);
        
        
        // preorder
        System.out.println("This is PreOrder");
        Preorder.preorder(root);
        
        System.out.println();

        //Inorder
        System.out.println("This is InOrder");
        InOrder.inorder(root);

        System.out.println();

        // PostOrder

        System.out.println("This is PostOrder");
        PostOrder.postorder(root);

        System.out.println();



        // levelOrder

        System.out.println("this is level order traversal");
        INTV_LevelOrder.levelorder(root);

        // Height of the tree

        System.out.println("The height Of this tree is");
        System.out.println(INTV_Height.height(root));

        // Count Of Nodes

        System.out.println("This is count of nodes");
        System.out.println(Count.count(root));

        // Sum of nodes
        System.out.println("this is sum Of nodes");
        System.out.println(Sum.sum(root));
        
        // Print k level nodes
        System.out.println("this is k level nodes");
        INTV_kLevel.klevel(root , 1 , 3);

        // Minimum distance bt two nodes

        System.out.println("this is minimum distance bt two nodes");
        System.out.println(INTV_MIN_DIST.minDist(root , 4 , 6));

        // kth ansestor of a node
        System.out.println("Kth ansestor , 2nd ansestore of 5 should be 1 ");
        System.out.println(KthAncestor.Kansestor(root, 5, 2));

        // Transform function
        System.out.println("the tree is trasnsformed to sum tree");
        INTV_SUM_Tree.transform(root);
        System.out.println("This is preorder of the transformed tree");
        Preorder.preorder(root);
    
    }
}
