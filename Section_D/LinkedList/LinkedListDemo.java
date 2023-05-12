// class Node {
//     int data;
//     Node next;
//     Node(int data) {
//         this.data = data;
//         this.next = null;
//     }
// }

import java.util.ArrayList;

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

        // Node temp = root;
        // while(temp != null) {
        //     System.out.println(temp.data);
        //     temp = temp.next;
        // }

        // ArrayList<Integer> arr;
        
        Node<Integer> root = new Node<>(10);
        root.next = new Node<>(20);
        root.next.next = new Node<>(30);
        root.next.next.next = new Node<>(40);

        Node<Integer> temp = root;
        while(temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }


    }
}