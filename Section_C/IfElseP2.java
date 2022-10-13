public class IfElseP2 {
    public static void main(String[] args) {
        int x = 12, y = 32, z = 34;
        if(x > y && x > z) {
            System.out.println("X is greatest...");
        }
        else if(y > x && y > z) {
            System.out.println("Y is greatest...");
        }
        else {
            System.out.println("Z is greatest...");
        }
    }
}
