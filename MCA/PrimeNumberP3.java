public class PrimeNumberP3 {
    public static void main(String[] args) {

        int num = 99776547;
        int count = 0;
        boolean prime = true;

        if(num % 2 == 0 || num % 3 == 0) {
            prime = false;
        }

        for(int i = 5; i * i < num; i+=6) {
            count++;
            if(num % i == 0 || num % (i+2) == 0) {
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
