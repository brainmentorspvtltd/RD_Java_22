public class MaxNode {

    static int getMax(BinaryTree<Integer> root) {
        if(root == null) {
            return Integer.MIN_VALUE;
        }
        return Math.max(root.data, Math.max(getMax(root.left), getMax(root.right)));
    }

    public static void main(String[] args) {
        
    }
}
