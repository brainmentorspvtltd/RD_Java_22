public class LinkedListCRUD<T> {
    Node<T> start;

    void insertAtBeg(Node<T> node) {
        // Linked List is empty
        if(start == null) {
            start = node;
            return;
        }
        node.next = start;
        start = node;
    }

    void insertAtEnd(Node<T> node) {
        // If linked list is empty
        if(start == null) {
            start = node;
            return;
        }
        // if linked list has only one node
        if(start.next == null) {
            start.next = node;
            return;
        }
        Node<T> current = start;
        while(current.next != null) {
            current = current.next;
        }
        current.next = node;

    }

    void insertAtMid(Node<T> node, int pos) {
        
    }

    void print() {
        Node<T> temp = start;
        while(temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        LinkedListCRUD<Integer> obj = new LinkedListCRUD<>();
        obj.insertAtBeg(new Node<>(10));
        obj.insertAtBeg(new Node<>(20));
        obj.insertAtBeg(new Node<>(30));
        obj.insertAtBeg(new Node<>(40));

        obj.insertAtEnd(new Node<>(100));
        obj.insertAtMid(new Node<>(50), 3);

        obj.print();
    }
}
