public class Atoi {

    static int toi(String str) {
        int n = str.length();
        int sign = 1;
        int index = 0;
        int result = 0;
        // Remove white spaces from beginning
        while(index < n && str.charAt(index) == ' ') {
            index++;
        }

        if(index < n && str.charAt(index) == '-') {
            sign = -1;
            index++;
        }

        else if(index < n && str.charAt(index) == '+') {
            sign = 1;
            index++;
        }

        while(index < n) {
            if(!Character.isDigit(str.charAt(index))) {
                continue;
            }
            int digit = str.charAt(index) - '0';

            // checking overflow and underflow condition
            if((result > Integer.MAX_VALUE / 10) || (result == Integer.MAX_VALUE / 10 && digit > Integer.MAX_VALUE % 10)) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            result = 10 * result + digit;
            index++;
        }
        return result * sign;

    }

    public static void main(String[] args) {
        
    }
}
