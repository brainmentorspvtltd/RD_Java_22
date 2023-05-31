public class FibSeries {

    static int recCount = 0;
    static int memoCount = 0;

    static int fib(int n) {
        recCount++;
        if(n == 0 || n == 1) {
            return n;
        }
        int first = fib(n - 1);
        int second = fib(n - 2);
        int result = first + second;
        return result;
    }

    static int memoization(int n, int cache[]) {
        memoCount++;
        if(n == 0 || n == 1) {
            return n;
        }
        if(cache[n] != 0) {
            return cache[n];
        }
        int first = memoization(n - 1, cache);
        int second = memoization(n - 2, cache);
        int result = first + second;
        cache[n] = result;
        return cache[n];
    }

    static int tabulation(int n) {
        int cache[] = new int[n+1];
        cache[0] = 0;
        cache[1] = 1;
        for(int i = 2; i <= n; i++) {
            cache[i] = cache[i - 1] + cache[i - 2];
        }
        return cache[n];
    }

    public static void main(String[] args) {
        int n = 10;
        int cache[] = new int[n+1];
        int res = fib(n);
        System.out.println("Fib Rec Result : " + res);
        res = memoization(n, cache);
        System.out.println("Fib Memo Result : " + res);

        System.out.println("Fib Rec count : " + recCount);
        System.out.println("Memo Count : " + memoCount);
    }
}
