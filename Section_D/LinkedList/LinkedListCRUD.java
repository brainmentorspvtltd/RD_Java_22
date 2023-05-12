public class LinkedListCRUD<T> {
    Node<T> start;
    int count;
    void insertAtBeg(Node<T> node) {
        // if linked list is empty
        if(start == null) {
            start = node;
            return;
        }
        node.next = start;
        start = node;
        count++;
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
        count++;
    }

    void insertAtMid(Node<T> node, int pos) {
        // if linked list is empty
        if(pos == 0) {
            insertAtBeg(start);
        }
        if(pos == count) {
            insertAtEnd(node);
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
        Node<T> temp = start;
        int i = 1;
        while(i < pos) {
            temp = temp.next;
            i++;
        }
        temp.next = temp.next.next;
    }

    void detectLoop() {
        
    }

    void kthFromEnd(int k) {

    }

    void midPoint() {
        Node<T> slow;
        Node<T> fast;
        slow = fast = start;
        while(fast.next != null && fast != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println("Mid Point : "+ slow.data);
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
        obj.insertAtEnd(new Node<>(5));
        obj.insertAtMid(new Node<>(11), 1);
        obj.print();
        obj.midPoint();
    }
}
