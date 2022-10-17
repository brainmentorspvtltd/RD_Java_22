public class CountDigits {
    public static void main(String[] args) {
        int num = 12020301;
        int counter = 0;
        while(num != 0) {
            int rem = num % 10;
            if(rem == 0) {
                counter++;
            }
            num = num / 10;
            
        }
        System.out.println("Count of Zero : " + counter);
    }
}
