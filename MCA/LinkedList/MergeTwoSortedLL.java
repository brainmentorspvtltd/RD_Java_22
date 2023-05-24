public class MergeTwoSortedLL {
    void merge(Node<T> start_1, Node<T> start_2) {
        Node<T> result;
        if(start_1 == null) {
            result = start_2;
            return;
        }
        if(start_2 == null) {
            result = start_1;
            return;
        }
        if(start_1.data <= start_2.data) {
            result = start_1;
            start_1 = start_1.next;
        }
        else {
            result = start_2;
            start_2 = start_2.next;
        }
        Node<T> resultHead = result;
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
    public static void main(String[] args) {
        
    }
}
