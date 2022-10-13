public class IfElse {
    public static void main(String[] args) {
        int x = 13;
        // if(x % 2 == 0) {
        //     System.out.println("Even Number...");
        // }
        // else {
        //     System.out.println("Odd number...");
        // }

        if((x & 1) == 0) {
            System.out.println("Even Number...");
        }
        else {
            System.out.println("Odd number...");
        }
    }
}
