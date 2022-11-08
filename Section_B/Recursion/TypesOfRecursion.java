package Recursion;

public class TypesOfRecursion {

    // // Tail Recursion
    // static void show(int n) {
        // Base Case
    //     if(n == 0) {
    //         return;
    //     }
    //     Processing Logic
    //     System.out.println(n);
    //     Small Problem
    //     show(n - 1);
    // }

    // // Head Recursion
    // static void show(int n) {
    //     if(n == 0) {
    //         return;
    //     }
    //     show(n - 1);
    //     System.out.println(n);
    // }

    // Linear Recursion
    static void show(int n) {
        // Base Case / Termination Case
        if(n == 0) {
            return;
        }
        // Processing Logic
        System.out.println(n);
        // Small Problem
        show(n - 1);
        // Processing Logic
        System.out.println(n);
    }

    public static void main(String[] args) {
        show(5);
    }
}
