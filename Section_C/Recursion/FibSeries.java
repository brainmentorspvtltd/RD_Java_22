package Recursion;

public class FibSeries {

    static int fib(int n) {
        if(n <= 1) {
            return n;
        }
        int x = fib(n - 1);
        int y = fib(n - 2);
        int z = x + y;
        return z;
    }

    public static void main(String[] args) {
        int n = fib(5);
        System.out.println(n);
    }
}
