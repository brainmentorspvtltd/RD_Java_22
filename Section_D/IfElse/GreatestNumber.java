public class GreatestNumber {
    public static void main(String[] args) {
        int x = 12, y = 14;
        if(x > y) {
            System.out.println("X is greater...");
        }
        else {
            System.out.println("Y is greater...");
        }

        int z = 23;
        if(x > y && x > z) {
            System.out.println("X is greater...");
        }
        else if(y > x && y > z) {
            System.out.println("Y is greater...");
        }
        else {
            System.out.println("Z is greater...");
        }
    }
}