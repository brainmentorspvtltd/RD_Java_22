public class NArmStrong {

    static int countDigit(int n) {
        
    }

    static boolean isArmStrong(int num, int copy, int count) {
        if(num == 0) {
            if(arm == copy) {
                return true;
            }
            return false;
        }
        int rem = num % 10;
        arm += Math.pow(rem, 3);
        num = num / 10;
        return isArmStrong(num, copy, count);
    }

    static void getArmstrong(int n) {
        if(n == 1) {
            return;
        }
        int count = countDigit(n);
        boolean armStrong = isArmStrong(n, n, count);
        if(armStrong) {
            System.out.println(n," is armstrong");
        }
        
        getArmstrong(n - 1);
    }

    public static void main(String[] args) {
        
    }
}
