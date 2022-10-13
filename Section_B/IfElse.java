public class IfElse {
    public static void main(String[] args) {
        int num = 24;
        if(num % 2 == 0) {
            System.out.println("Even Number...");
        }
        else {
            System.out.println("Odd Number...");
        }

        if((num & 1) == 0) {
            System.out.println("Even Number...");
        }
        else {
            System.out.println("Odd Number...");
        }
    }
}
