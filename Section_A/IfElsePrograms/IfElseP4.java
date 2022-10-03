public class IfElseP4 {
    public static void main(String[] args) {
        int num = 15;
        // if(num % 2 == 0) {
        //     System.out.println("Even Number...");
        // }
        // else {
        //     System.out.println("Odd Number...");
        // }

        if((num & 1) == 1) {
            System.out.println("Odd Number...");
        }
        else {
            System.out.println("Even Number...");
        }
    }
}
