public class ClimbingStairs {

    static int climb(int n) {
        if(n == 1 || n == 0) {
            return 1;
        }
        else if(n == 2) {
            return 2;
        }
        return climb(n - 1) + climb(n - 2);
    }

    public static void main(String[] args) {
        
    }
}
