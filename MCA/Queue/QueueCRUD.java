import javafx.scene.chart.PieChart.Data;

class Queue {
    int arr[];
    int front;
    int rear;
    int size;
    public Queue(int capacity) {
        this.arr = new int[capacity];
        front = rear = -1;
        size = 0;
    }

    int getSize() {
        return size;
    }

    boolean isEmpty() {
        return size == 0;
    }

    void enqueue(int element) {
        if(size == arr.length) {
            throw new RuntimeException("Queue is Full...");
        }
        if(size == 0) {
            front = 0;
        }
        rear++;
        size++;
        if(rear == arr.length) {
            rear = 0;
        }
        arr[rear] = element;
    }

    int dequeue() {
        if(size == 0) {
            throw new RuntimeException("Queue is empty...");
        }
        int temp = arr[front];
        front++;
        if(front == arr.length) {
            front = 0;
        }
        size--;
        return temp;
    }

}

public class QueueCRUD {
    public static void main(String[] args) {
        Queue queue = new Queue(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.dequeue();
    }
}
