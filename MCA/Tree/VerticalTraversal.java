// Iterative Solution

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;
    TreeNode(int data) {
        this.data = data;
    }
}

class VPair {
    TreeNode node = null;
    int dist = 0;
    VPair(TreeNode node, int dist) {
        this.node = node;
        this.dist = dist;
    }
}

public class VerticalTraversal {

    static void verticalTraversal(TreeNode root) {
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        LinkedList<VPair> queue = new LinkedList<>();        
        queue.addLast(new VPair(root, 0));
        while(!queue.isEmpty()) {
            int size = queue.size();
            while(size-- > 0) {
                VPair pair = queue.removeFirst();
                map.putIfAbsent(pair.dist, new ArrayList<>());
                map.get(pair.dist).add(pair.node.data);
                if(pair.node.left != null) {
                    queue.addLast(new VPair(pair.node.left, pair.dist - 1));
                }
                if(pair.node.right != null) {
                    queue.addLast(new VPair(pair.node.right, pair.dist + 1));
                }
            }
        }
        System.out.println(map);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(20);
        root.left.left = new TreeNode(40);
        root.left.right = new TreeNode(50);
        root.right = new TreeNode(30);
        verticalTraversal(root);
    }
}
