package LinkedListQuestions;

public class Palindrome {

    Node<T> start;

    Node<T> reverseIterateRec(Node<T> currentNode, Node<T> prevNode) {
        if(currentNode == null) {
            return prevNode;
        }
        Node<T> nextNode = currentNode.next;
        currentNode.next = prevNode;
        return reverseIterateRec(nextNode, currentNode);
    }

    boolean checkPalindrome() {
        Node<T> slow;
        Node<T> fast;
        slow = fast = start;
        Node<T> prev =  null, midNode = null;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            prev = slow;
            slow = slow.next;
        }
        // for odd cases
        // if fast points to last node
        if(fast != null) {
            midNode = slow;
            slow = slow.next;
        }
        Node<T> secondHalf = slow;
        prev.next = null;
        secondHalf = reverseIterateRec(secondHalf, null);
        boolean result = compare(start, secondHalf);
        secondHalf = reverseIterateRec(secondHalf, null);
        if(midNode != null) {
            prev.next = midNode;
            midNode.next = secondHalf;
        }
        return result;
    }

    boolean compare(Node<T> a, Node<T> b) {
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
