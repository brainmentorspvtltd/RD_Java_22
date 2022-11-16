package Recursion;

public class CheckPowerOf2 {

    static boolean checkPower(int n) {
        while(n % 2 == 0) {
            n = n / 2;
        }
        return n == 1;
    }

    public static void main(String[] args) {
        
    }
}
