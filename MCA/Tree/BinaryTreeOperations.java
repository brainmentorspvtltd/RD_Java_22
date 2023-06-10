import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

class BinaryTree<T> {
    T data;
    BinaryTree<T> left;
    BinaryTree<T> right;
    BinaryTree(T data) {
        this.data = data;
        left = right = null;
    }
}

public class BinaryTreeOperations {
    String msg = "root";
    BinaryTree<Integer> insert() {
        System.out.println("Enter the " + msg + " data");
        int data = new Scanner(System.in).nextInt();
        if(data == -1) {
            return null;
        }
        BinaryTree<Integer> node = new BinaryTree<>(data);
        msg = "left";
        node.left = insert();
        msg = "right";
        node.right = insert();
        msg = "root";
        return node;
    }

    public void preOrder(BinaryTree<Integer> root) {
        // Root, Left, Right
        if(root == null) {
            return;
        }
        System.out.println(root.data);
        preOrder(root.left);
        preOrder(root.right);
    }

    public void inOrder(BinaryTree<Integer> root) {
        // Left, Root, Right
        if(root == null) {
            return;
        }
        inOrder(root.left);
        System.out.println(root.data);
        inOrder(root.right);
    }

    public void postOrder(BinaryTree<Integer> root) {
        // Left, Right, Root
        if(root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.data);
    }

    void levelOrder(BinaryTree<Integer> root) {
        LinkedList<BinaryTree<Integer>> list = new LinkedList<>();
        list.add(root);
        while(!list.isEmpty()) {
            BinaryTree<Integer> currentNode = list.removeFirst();
            System.out.println(currentNode.data);
            if(currentNode.left != null) {
                list.addLast(currentNode.left);
            }
            if(currentNode.right != null) {
                list.addLast(currentNode.right);
            }
        }
    }

    void iterativePreOrder(BinaryTree<Integer> root) {
        // Root, Left, Right
        Stack<BinaryTree<Integer>> st = new Stack<>();
        BinaryTree<Integer> current = root;
        while(current != null || st.isEmpty() == false) {
            while(current != null) {
                System.out.println(current.data);
                if(current.right != null) {
                    st.push(current.right);
                }
                current = current.left;
            }
            if(st.isEmpty() == false) {
                current = st.pop();
            }
        }
    }
    

    void print(BinaryTree<Integer> root) {
        if(root == null) {
            return;
        }
        String output = "";
        output += root.data + " => ";
        if(root.left != null) {
            output += " L : " + root.left.data + ", ";
        }
        if(root.right != null) {
            output += " R : " + root.right.data + ", ";
        }
        System.out.println(output);
        print(root.left);
        print(root.right);
    }

    public static void main(String[] args) {
        BinaryTreeOperations obj = new BinaryTreeOperations();
        BinaryTree<Integer> root = obj.insert();
        obj.print(root);
    }
}