public class LoopsAnalysis {
    public static void main(String[] args) {
        int n = 100, c = 2;

        // TC : O(n)
        for(int i = 0; i < n; i++) {
            // Logic...
        }

        // TC : O(n)
        for(int i = 0; i < n; i+=c) {
            // Logic...
        }

        // TC : O(n)
        for(int i = 10; i > 0; i-=c) {
            // Logic...
        }

        // TC : O(logc)
        for(int i = 1; i < n; i*=c) {
            // Logic...
        }

        // TC : O(logc)
        for(int i = n; i > 0; i/=c) {
            // Logic...
        }
    }
}
