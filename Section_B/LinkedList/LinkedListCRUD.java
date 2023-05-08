public class LinkedListCRUD<T> {
    Node<T> start;

    void insertAtBeg(Node<T> node) {
        // If linked list is empty
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
        // If linked list has only one node
        if(start.next == null) {
            start.next = node;
            return;
        }
        Node<T> temp = start;
        while(temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
    }

    void insertAtMid(Node<T> node, int pos) {
        if(pos == 0) {
            insertAtBeg(node);
        }
        int i = 1;
        Node<T> temp = start;
        while(i < pos) {
            temp = temp.next;
            i++;
        }
        node.next = temp.next;
        temp.next = node;
    }

    void deleteAtBeg() {

    }
    void deleteAtEnd() {

    }
    void deleteAtMid(int pos) {

    }
    void reverseIterate() {
        
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
        obj.insertAtBeg(new Node<>(50));

        obj.insertAtEnd(new Node<>(100));
        obj.insertAtMid(new Node<>(5), 2);
        obj.print();


    }
}
