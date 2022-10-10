public class PrimeNumberP1 {
    public static void main(String[] args) {
        int num = 25;
        boolean prime = true;
        for(int i = 2; i < num; i++) {
            if(num % i == 0) {
                prime = false;
                // System.out.println("Number is not prime...");
                break;
            }
            else {
                // System.out.println("Number is prime...");
            }
        }
        if(prime) {
            System.out.println("Number is prime...");
        }
        else {
            System.out.println("Number is not prime...");
        }
    }
}
