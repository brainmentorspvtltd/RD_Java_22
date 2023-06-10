import java.util.LinkedList;

public class LeftView {

    static void view(BinaryTree<Integer> root) {
        if(root == null) {
            return;
        }
        LinkedList<BinaryTree<Integer>> list = new LinkedList<>();
        list.add(root);
        while(list.isEmpty() == false) {
            int count = list.size();
            for(int i = 0; i < count; i++) {
                // poll - retrieve and remove first element
                BinaryTree<Integer> current = list.poll();
                if(i == 0) {
                    System.out.println(current.data);
                }
                if(current.left != null) {
                    list.add(current.left);
                }
                if(current.right != null) {
                    list.add(current.right);
                }
            }
        }
    }

    public static void main(String[] args) {
        
    }
}
