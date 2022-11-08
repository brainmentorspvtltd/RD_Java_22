package Recursion;

import java.util.ArrayList;

public class NArmstrong {

    static ArrayList<Integer> getNumbers(int num) {
        int temp = num;
        int sum = 0;
        ArrayList<Integer> list = getNumbers(num);
        boolean result = isArmstrong(num, temp, sum);
        if(result) {
            list.add(num);
        }
        return list;
    }

    static boolean isArmstrong(int num, int sum, int temp) {
        if(num == 0) {
            if(sum == temp) {
                return true;
            }
            return false;
        }
        int rem = num % 10;
        sum += Math.pow(rem, 3);
        num = num / 10;
        return isArmstrong(num, sum, temp);
    }

    public static void main(String[] args) {
        
    }
}
