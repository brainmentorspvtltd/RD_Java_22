package Recursion;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class ArmStrong {

    static ArrayList<Integer> getArmStrong(int n, int i) {
        // Stack<String> st = new Stack<>();
        // LinkedList<Integer> link = new LinkedList<>();
        int temp = n;
        int sum = 0;
        ArrayList<Integer> list = getArmStrong(n, i+1);
        boolean result = isArmStrong(i, sum, i);
        if(result) {
            list.add(i);
        }
        return list;
    }

    static boolean isArmStrong(int num, int sum, int temp) {
        if(num == 0) {
            if(sum == temp) {
                return true;
            }
            return false;
        }
        int rem = num % 10;
        sum += Math.pow(rem, 3);
        num /= 10;
        return isArmStrong(num, sum, temp);
    }

    public static void main(String[] args) {
        // boolean res = isArmStrong(153, 0, 153);
        // System.out.println(res);
        getArmStrong(100, 1);
    }
}
