public class FibSeries {

    static int fib(int n) {
        if(n <= 1) {
            return n;
        }
        int first = fib(n - 1);
        int second = fib(n - 2);
        int result = first + second;
        return result;
    }

    public static void main(String[] args) {
        int n = fib(5);
        System.out.println(n);
    }
}
