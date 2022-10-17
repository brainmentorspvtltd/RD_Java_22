public class GCD_LCM {
    public static void main(String[] args) {
        int n1 = 18, n2 = 48;
        while(n2 % n1 != 0) {
            int rem = n2 % n1;
            n2 = n1;
            n1 = rem;
        }
        System.out.println("GCD : " + n1);
    }
}
