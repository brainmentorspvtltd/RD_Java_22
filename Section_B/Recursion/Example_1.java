package Recursion;

public class Example_1 {
    static void show(int n) {
        // Base Case / Termination Case
        if(n == 0) {
            return;
        }
        
        if(n % 2 != 0) {
            // Processing Logic
            System.out.println(n);
        }
        // Small Problem
        show(n - 1);
        
        if(n % 2 == 0) {
            // Processing Logic
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        show(5);
    }
}
