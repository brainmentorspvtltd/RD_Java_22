public class LinkedListCRUD<T> {
    Node<T> start;

    void insertAtBeg(Node<T> node) {
        // if linked list is empty
        if(start == null) {
            start = node;
            return;
        }

        node.next = start;
        start = node;
    }

    void insertAtEnd(Node<T> node) {
        // if linked list is empty
        if(start == null) {
            start = node;
            return;
        }
        // if linked list has only one node
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
        // if linked list is empty
        if(start == null) {
            start = node;
            return;
        }
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
        if(start == null) {
            throw new RuntimeException("List is empty...");
        }

        if(start.next == null) {
            start = null;
            return;
        }

        start = start.next;
    }

    void deleteAtEnd() {
        
    }

    void deleteAtMid() {

    }

    void midPoint() {
        Node<T> slow;
        Node<T> fast;
        slow = fast = start;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println("Mid Point : " + slow.data);
    }

    void kthFromEnd(int k) {
        Node<T> p;
        Node<T> q;
        p = q = start;
        int i = 0;
        while(i < k) {
            q = q.next;
            i++;
        }  
        while(q.next != null) {
            q = q.next;
            p = p.next;
        }
        System.out.println("Kth element is : " + p.data);
    }

    void reverseIterate() {

    }

    void print() {
        Node<T> current = start;
        while(current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public static void main(String[] args) {
        LinkedListCRUD<Integer> root = new LinkedListCRUD<>();
        root.insertAtBeg(new Node<>(10));
        root.insertAtBeg(new Node<>(20));
        root.insertAtBeg(new Node<>(30));
        root.insertAtBeg(new Node<>(40));
        root.insertAtEnd(new Node<>(100));
        root.insertAtMid(new Node<>(75), 3);

        root.deleteAtBeg();

        root.print();
    }
}
