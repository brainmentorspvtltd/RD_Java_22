public class PrimeNumberP2 {
    public static void main(String[] args) {
        int num = 997;
        boolean prime = true;
        int iter = 0;
        for(int i = 2; i*i < num; i++) {
            iter++;
            if(num % i == 0) {
                prime = false;
                break;
            }
            else {
            }
        }
        System.out.println("Took : " + iter + " iterations...");
        if(prime) {
            System.out.println("Number is prime...");
        }
        else {
            System.out.println("Number is not prime...");
        }
    }
}
