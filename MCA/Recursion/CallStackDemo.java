package Recursion;

public class CallStackDemo {
    static int add(int x, int y) {
        int z = x + y;
        return z;
    }

    static int sub(int x, int y) {
        add(x, y);
        int z = x - y;
        return z;
    }

    static int mul(int x, int y) {
        sub(x, y);
        int z = x * y;
        return z;
    }
    public static void main(String[] args) {
        mul(4, 7);
    }
}
