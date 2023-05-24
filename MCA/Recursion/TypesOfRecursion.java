public class TypesOfRecursion {

    // Tail Recursion
    // static void print(int n) {
    //     if(n == 0) {
    //         return;
    //     }
    //     // Processing Logic
    //     System.out.println(n);
    //     // Small Problem
    //     print(n - 1);
    // }

    // Head Recursion
    // static void print(int n) {
    //     if(n == 0) {
    //         return;
    //     }
    //     // Small Problem
    //     print(n - 1);
    //     // Processing Logic
    //     System.out.println(n);
    // }


    // Linear Recursion
    static void print(int n) {
        if(n == 0) {
            return;
        }
        // Processing Logic
        System.out.println(n);
        // Small Problem
        print(n - 1);
        // Processing Logic
        System.out.println(n);
    }

    public static void main(String[] args) {
        print(5);
    }
}
