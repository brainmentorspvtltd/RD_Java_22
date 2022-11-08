package Recursion;

public class CallStack {

    static void add(int x, int y) {
        int z = x + y;
    }

    static void sub(int x, int y) {
        int z = x - y;
    }

    static void div(int x, int y) {
        int z = x / y;
    }

    static void calc(int x, int y) {
        add(x, y);
        sub(x, y);
        div(x, y);
    }

    public static void main(String[] args) {
        calc(5,7);
    }
}
