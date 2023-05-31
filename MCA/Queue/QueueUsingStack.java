import java.util.Stack;

public class QueueUsingStack {
    Stack<Integer> st_1;
    Stack<Integer> st_2;
    public QueueUsingStack() {
        st_1 = new Stack<>();
        st_2 = new Stack<>();
    }
    
    public void push(int x) {
        if(st_1.isEmpty()) {
            front = x;
        }
        st_1.push(x);
    }
    
    public int pop() {
        if(st_2.isEmpty()) {
            while(!st_1.isEmpty()) {
                st_2.push(st_1.pop());
            }
        }
        return st_2.pop();
    }
    
    // public int peek() {
        
    // }
    
    // public boolean empty() {
        
    // }

    public static void main(String[] args) {
        
    }
}
