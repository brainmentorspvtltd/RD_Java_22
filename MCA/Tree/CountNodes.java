public class CountNodes {
    static int count(BinaryTree<Integer> root) {
        if(root == null) {
            return 0;
        }
        int counter = 1;
        counter += count(root.left);
        counter += count(root.right);
        return counter;
    }
}
