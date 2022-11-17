package Recursion;

public class CheckPowerOf2 {

    // static boolean checkPower(int n) {
    //     while(n % 2 == 0) {
    //         n = n / 2;
    //     }
    //     return n == 1;
    // }

    static boolean checkPower(int n) {
        if(n == 1) {
            return true;
        }
        else if(n % 2 != 0 || n == 0) {
            return false;
        }
        return checkPower(n/2);
        
    }

    public static void main(String[] args) {
        boolean ans = checkPower(18);        
        System.out.println(ans);
    }
}
