class DLLNode {
    int data;
    DLLNode next;
    DLLNode prev;
    DLLNode(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class DoublyLinkedList {
    public static void main(String[] args) {
        DLLNode start = new DLLNode(10);
        start.next = new DLLNode(20);
        start.next.prev = start;
    }
}
