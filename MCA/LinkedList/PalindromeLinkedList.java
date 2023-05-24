class ListNode {
    char data;
    ListNode next;
    ListNode(char data) {
        this.data = data;
        this.next = null;
    }
}

public class PalindromeLinkedList {
    ListNode start;
    ListNode reverse(ListNode currentNode, ListNode prev) {
        if(currentNode == null) {
            return prev;
        }
        ListNode nextNode = currentNode.next;
        currentNode.next = prev;
        return reverseLinkedListRec(nextNode, currentNode);
    }

    boolean palindrome() {
        // Find Mid Point
        ListNode slow, fast;
        slow = fast = start;
        ListNode prev = null, midPoint = null;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            prev = slow;
            slow = slow.next;
        }
        // Check if list is odd or even
        // list is odd
        if(fast != null) {
            midPoint = slow;
            slow = slow.next;
        }

        // divide list into two halves
        ListNode secondHalf = slow;
        prev.next = null;
        // reverse second half
        secondHalf = reverse(secondHalf, null);

        // call compare and pass first half and second half
        boolean result = compare(start, secondHalf);

        // again reverse second half
        secondHalf = reverse(secondHalf, null);

        // join both half with midpoint
        if(midPoint != null) {
            prev.next = midPoint;
            midPoint.next = secondHalf;
        }
        return result;
    }

    // compares first half and second half
    boolean compare(ListNode a, ListNode b) {
        while(a != null && b != null) {
            if(a.data == b.data) {
                a = a.next;
                b = b.next;
            }
            else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        
    }
}
