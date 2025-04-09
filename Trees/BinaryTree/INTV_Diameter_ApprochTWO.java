package Trees.BinaryTree;

public class INTV_Diameter_ApprochTWO { //O(n^2) because , we afre caculating height of each node , when we caculate the height for omnce , its o(n) , but here we are caculating the height at each node , so the tc will be O(n^2)
    public static int diameter(BuildTreeByPreorder.Node root){
        if(root == null){
            return 0;
        }
// lh == left height , rh = right height 
        int lh = INTV_Height.height(root.left);
        int ld = diameter(root.left);

        int rh = INTV_Height.height(root.right);
        int rd = diameter(root.right);

        int sd = lh + rh +1 ;
        return Math.max(sd , Math.max(rd, ld));
    }

    static class Info{

        int diameter , height;

        public Info(int diameter , int height){
            this.diameter = diameter;
            this.height = height;
        }


    }

    public static Info diameter2(BuildTreeByPreorder.Node root){
        if(root == null){
            return new Info(0,0);
        }

        Info leftInfo = diameter2(root.left);
        Info rightInfo = diameter2(root.right);

        int diam = Math.max(Math.max(leftInfo.diameter , rightInfo.diameter) , leftInfo.height+rightInfo.height +1);
        int height = Math.max(leftInfo.height , rightInfo.height) +1;
        
        return new Info(diam, height);
    }

    public static void main(String[] args) {
        BuildTreeByPreorder.Node root = new BuildTreeByPreorder.Node(1);
        
        root.left = new BuildTreeByPreorder.Node(2);
        root.right = new BuildTreeByPreorder.Node(3);
        root.left.left = new BuildTreeByPreorder.Node(4);
        root.left.right = new BuildTreeByPreorder.Node(5);
        root.right.left = new BuildTreeByPreorder.Node(6);
        root.right.right = new BuildTreeByPreorder.Node(7);

        System.out.println("Diameter is " +diameter(root));
        System.out.println("Diameter is " +diameter2(root).diameter);
    }
}
