// package Array1D;

public class ArrayCRUD {

    int arr[];
    int currentSize;

    public ArrayCRUD(int n) {
        this.arr = new int[n];
        this.currentSize = 0;
    }

    public void insert(int index, int item) {
        if(index > currentSize) {
            System.out.println("Index cannot be greater then current size...");
            return;
        }
        // Array Shifting Logic
        arr[index] = item;
        currentSize++;
    }

    void delete(int index) {
        // Shift Logic
        currentSize--;
    }

    void update() {
        // Update Logic
    }

    void search() {
        // Search Logic
    }

    void print() {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayCRUD operations = new ArrayCRUD(5);
        operations.insert(0, 10);
        operations.insert(1, 5);
        operations.insert(2, 3);
        operations.insert(3, 19);
        operations.insert(1, 7);
        operations.print();

        operations.delete(2);

        // Based on switch case perform menu driven program
    }
}
