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
        // If Linked List is Empty
        if(start == null) {
            start = node;
            return;
        }
        // If pos is 0
        if(pos == 0) {
            insertAtBeg(node);
            return;
        }

        int i = 0;
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
        if(pos == 0) {
            start = start.next;
            return;
        }
        int i = 0;
        Node<T> temp = start;
        while(i < pos) {
            temp = temp.next;
            i++;
        }
        temp.next = temp.next.next;
    }

    void midPoint() {
        Node<T> slow;
        Node<T> fast;
        slow = fast = start;
        while(fast.next != null && fast != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println("Mid Point : " + slow.data);
    }

    void detectCycle() {

    }

    void findKthFromEnd(int k) {
        Node<T> p;
        Node<T> q;
        q = p = start;
        int i = 0;
        while(i < k) {
            q = q.next;
        }
        while(q.next != null) {
            p = p.next;
            q = q.next;
        }
        System.out.println(p.data);
    }

    void reverseIterate() {
        Node<T> current = start;
        Node<T> prev = null;
        while(current != null) {
            Node<T> next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        start = prev;
    }

    void reverseIterateRec(Node<T> current, Node<T> prev) {
        if(current == null) {
            start = prev;
            return;
        }
        Node<T> next = current.next;
        current.next = prev;
        reverseIterateRec(next, current);
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
        System.out.println("Reverse Linked List");
        obj.reverseIterateRec(obj.start, null);

        obj.print();
    }
}
