package Stack;

public class StackCRUD {
    int arr[];
    int capacity;
    int top;
    
    public StackCRUD(int capacity) {
        this.capacity = capacity;
        top = -1;
        arr = new int[capacity];
    }

    void push(int data) {
        if(top == capacity - 1) {
            throw new RuntimeException("Stack is full..");
        }
        top++;
        arr[top] = data;
    }

    int pop() {
        if(isEmpty()) {
            throw new RuntimeException("Stack is empty...");
        }
        int e = arr[top];
        top--;
        return e;
    }

    int peek() {
        return arr[top];
    }

    boolean isEmpty() {
        return (top == -1);
    }

    int getSize() {
        return top + 1;
    }

    void print() {

    }

    public static void main(String[] args) {
        StackCRUD obj = new StackCRUD(6);
        obj.push(10);
        obj.push(20);
        obj.push(5);
    }
}
