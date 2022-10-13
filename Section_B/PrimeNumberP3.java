public class PrimeNumberP3 {

    static boolean checkPrime(int num) {

        if(num % 2 == 0 || num % 3 == 0) {
            return false;
        }

        int iter = 0;
        for(int i = 5; i * i < num; i+=6) {
            iter++;
            if(num % i == 0 || num % (i+2) == 0) {
                return false;
            }
        }
        System.out.println("Took " + iter + " iterations..." );
        return true;
    }

    public static void main(String[] args) {
        int num = 997;
        boolean prime = checkPrime(num);
        if(prime) {
            System.out.println("Number is prime...");
        }
        else {
            System.out.println("Number is not prime...");
        }
    }
}
