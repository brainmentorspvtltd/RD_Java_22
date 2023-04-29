import java.util.ArrayList;

// class Node {
//     int data;
//     Node next;
//     Node(int data) {
//         this.data = data;
//         this.next = null;
//     }
// }

class Node<T> {
    T data;
    Node<T> next;
    Node(T data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedListDemo {
    public static void main(String[] args) {
        // Node root = new Node(10);
        // root.next = new Node(20);
        // root.next.next = new Node(30);
        // root.next.next.next = new Node(40);
        // root.next.next.next.next = new Node(50);

        Node<Integer> root = new Node<>(10);
        root.next = new Node<>(20);
        root.next.next = new Node<>(30);
        root.next.next.next = new Node<>(40);
        root.next.next.next.next = new Node<>(50);

        Node<Integer> current = root;
        while(current != null) {
            System.out.println(current.data);
            current = current.next;
        }

        Node<String> list_2 = new Node<>("ram");
        list_2.next = new Node<>("shyam");
        list_2.next.next = new Node<>("mohit");
        list_2.next.next.next = new Node<>("sumit");
        list_2.next.next.next.next = new Node<>("namit");

    }
}
