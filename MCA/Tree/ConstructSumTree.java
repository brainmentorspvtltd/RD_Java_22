package Tree;

public class ConstructSumTree {

    public int sumTree(BinaryTree<Integer> root) {
        if(root == null) {
            return 0;
        }
        int leftValue = sumTree(root.leftChild);
        int rightValue = sumTree(root.rightChild);
        int currentValue = root.data;
        root.data = leftValue + rightValue;
        return leftValue + rightValue + currentValue;
    }

    public static void main(String[] args) {
        
    }
}
