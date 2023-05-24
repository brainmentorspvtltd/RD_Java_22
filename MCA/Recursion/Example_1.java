public class Example_1 {

    static void print(int n) {
        if(n == 0) {
            return;
        }
        if(n % 2 != 0) {
            // Processing Logic
            System.out.println(n);
        }
        // Small Problem
        print(n - 1);
        
        if(n % 2 == 0) {
            // Processing Logic
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        
    }
}
