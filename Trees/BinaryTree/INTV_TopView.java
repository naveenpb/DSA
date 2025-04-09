package Trees.BinaryTree;

import java.util.HashMap;
import java.util.LinkedList;
// import java.util.Queue;
import Trees.BinaryTree.BuildTreeByPreorder.Node;

public class INTV_TopView {
    static class Info {
        Node node;
        int hd;

        public Info(Node node, int hd) {
            this.node = node;
            this.hd = hd;
        }
    }

    public static void topView(Node root) {
        if (root == null) return;

        var q = new LinkedList<Info>();
        var map = new HashMap<Integer, Node>();
        int min = 0, max = 0;

        q.add(new Info(root, 0));
        q.add(null);

        while (!q.isEmpty()) {
            var curr = q.remove();

            if (curr == null) {
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                if (!map.containsKey(curr.hd)) {
                    map.put(curr.hd, curr.node);
                }

                if (curr.node.left != null) {
                    q.add(new Info(curr.node.left, curr.hd - 1));
                    min = Math.min(min, curr.hd - 1); //min and max is required to print hashmap in order wise
                }

                if (curr.node.right != null) {
                    q.add(new Info(curr.node.right, curr.hd + 1));
                    max = Math.max(max, curr.hd + 1);
                }
            }
        }

        for (int i = min; i <= max; i++) {
            System.out.print(map.get(i).data + " ");
        }
    }







    public static void bottomView(Node root) {
        if (root == null) return;

        var q = new LinkedList<Info>();
        var map = new HashMap<Integer, Node>();
        int min = 0, max = 0;

        q.add(new Info(root, 0));

        while (!q.isEmpty()) {
            var curr = q.poll(); // ✅ Changed `remove()` to `poll()` for safety , because when queue is empty it will return a null insted of exception so it is prefered onver remove

            //  ✅ In Bottom View, always update the map with the latest node at each hd
            map.put(curr.hd, curr.node); // always update to the latest value in bottom view

            // Process left child
            if (curr.node.left != null) {
                q.add(new Info(curr.node.left, curr.hd - 1));
                min = Math.min(min, curr.hd - 1);
            }

            // Process right child
            if (curr.node.right != null) {
                q.add(new Info(curr.node.right, curr.hd + 1));
                max = Math.max(max, curr.hd + 1); //min and max is needed to print hash,ap in order wise
            }
        }

        // Print nodes from min to max hd (same as Top View)
        for (int i = min; i <= max; i++) {
            System.out.print(map.get(i).data + " ");
        }
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println("Top View of the Binary Tree:");
        topView(root);
        System.out.println("\nBottom View of the Binary Tree:");
        bottomView(root);
    }
}

