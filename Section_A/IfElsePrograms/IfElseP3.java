public class IfElseP3 {
    public static void main(String[] args) {
        int x = 12, y = 20, z = 40;
        // If Else Ladder
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
