public class PrimeNumber {
    public static void main(String[] args) {
        int num = 997;
        boolean prime = true;
        int count = 0;
        for(int i = 2; i < num; i++) {
            count++;
            if(num % i == 0) {
                prime = false;
                break;
            }
        }
        System.out.println("Took " + count + " iterations...");
        if(prime) {
            System.out.println("Number is prime...");
        }
        else {
            System.out.println("Number is not prime...");
        }
    }
}
