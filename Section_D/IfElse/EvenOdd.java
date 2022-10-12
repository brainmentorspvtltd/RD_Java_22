public class EvenOdd {
    public static void main(String[] args) {
        int x = 12;
        if(x % 2 == 0) {
            System.out.println("Number is even..");
        }
        else {
            System.out.println("Number is odd..");
        }

        if((x & 1) == 1) {
            System.out.println("Odd Number...");
        }
        else {
            System.out.println("Even Number...");
        }
    }
}
