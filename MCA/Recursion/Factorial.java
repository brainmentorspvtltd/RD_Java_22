public class Factorial {

    static int fact(int n) {
        // Base Case / Termination Case
        if(n == 1) {
            return 1;
        }
        // Small Problem
        int smallProblem = fact(n - 1);
        // Processing Logic
        return n * smallProblem;
    }

    public static void main(String[] args) {
        fact(5);
    }
}
