package Tree;

import java.util.Stack;

public class SpiralTree {
    void printSpiral(BinaryTree<Integer> root) {
        // Create two stacks
        // One for even and one for odd
        Stack<BinaryTree<Integer>> oddStack = new Stack<>();
        Stack<BinaryTree<Integer>> evenStack = new Stack<>();
        oddStack.push(root);
        while(!oddStack.isEmpty() || !evenStack.isEmpty()) {
            while(!oddStack.isEmpty()) {
                BinaryTree<Integer> node = oddStack.pop();
                System.out.println(node.data);
                if(node.rightChild != null) {
                    oddStack.push(node.rightChild);
                }
                if(node.leftChild != null) {
                    oddStack.push(node.leftChild);
                }
            }

            while(!evenStack.isEmpty()) {
                BinaryTree<Integer> node = evenStack.pop();
                System.out.println(node.data);
                if(node.leftChild != null) {
                    evenStack.push(node.leftChild);
                }
                if(node.rightChild != null) {
                    evenStack.push(node.rightChild);
                }
            }
        }

    }
}
