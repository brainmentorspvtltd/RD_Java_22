public class ArmStrongNumber {
    public static void main(String[] args) {
        int num = 153;
        int temp = num;
        int sum = 0;
        while(num != 0) {
            int rem = num % 10;
            sum += Math.pow(rem, 3);
            num /= 10;
        }

        if(temp == sum) {
            System.out.println("Armstrong number...");
        }
        else {
            System.out.println("Not armstrong...");
        }
    }
}
