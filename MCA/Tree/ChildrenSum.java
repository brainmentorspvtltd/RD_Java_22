public class ChildrenSum {

    boolean isSum(TreeNode root) {
        if(root == null) {
            return true;
        }
        if(root.left == null && root.right == null) {
            return true;
        }
        int sum = 0;
        if(root.left != null) {
            sum += root.left.data;
        }
        if(root.right != null) {
            sum += root.right.data;
        }
        return (root.data == sum && isSum(root.left) && isSum(root.right));

    }

    public static void main(String[] args) {
        
    }
}
