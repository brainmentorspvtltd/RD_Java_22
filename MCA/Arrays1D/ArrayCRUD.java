public class ArrayCRUD {

    int arr[];
    int currentSize;
    // Parameterized Constructor
    public ArrayCRUD(int n) {
        this.arr = new int[n];
        this.currentSize = 0;
    }

    public void insert(int index, int item) {
        if(index > currentSize) {
            System.out.println("Index cannot be greater then current size");
            return;
        }
        if(index == arr.length) {
            System.out.println("Array is full...");
            return;
        }

        for(int i = currentSize; i > index; i--) {
            arr[i] = arr[i-1];
        }

        arr[index] = item;
        currentSize++;
        System.out.println("Element Added...");
    }

    public void delete(int index) {
        if(currentSize == 0) {
            System.out.println("Array is Empty...");
            return;
        }

        for(int i = index; i < currentSize-1; i++) {
            arr[i] = arr[i+1];
        }

        arr[currentSize-1] = 0;
        currentSize--;
        System.out.println("Element Removed...");
    }

    void search(int item) {

    }

    void update(int index, int item) {

    }

    void print() {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayCRUD obj = new ArrayCRUD(5);
        obj.insert(0, 10);
        obj.insert(1, 20);
        obj.insert(2, 30);
        obj.insert(3, 40);
        obj.insert(1, 11);
        obj.print();
        obj.delete(1);
        obj.print();
    }
}
