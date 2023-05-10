class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class MergeTwoSortedLL {
    void merge(Node start_1, Node start_2) {
        Node result;
        if(start_1.data <= start_2.data) {
            result = start_1;
            start_1 = start_1.next;
        }
        else {
            result = start_2;
            start_2 = start_2.next;
        }
        while(start_1 != null && start_2 != null) {
            if(start_1.data <= start_2.data) {
                result.next = start_1;
                result = start_1;
                start_1 = start_1.next;
            }
            else {
                result.next = start_2;
                result = start_2;
                start_2 = start_2.next;
            }
        }
        if(start_1 == null) {
            result.next = start_2;
        }
        else {
            result.next = start_1;
        }
    }
}
