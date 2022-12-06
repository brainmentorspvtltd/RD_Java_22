package Backtracking;

import java.util.ArrayList;

public class Parantheses {

    static ArrayList<String> generate(int n) {
        ArrayList<String> result = new ArrayList<>();
        helper(result, "", 0, 0, n);
        return result;
    }
    static void helper(ArrayList<String> result, String str, int open, int close, int max) {
        if(str.length() == max * 2) {
            result.add(str);
            return;
        }
        if(open < max) {
            helper(result, str + '(', open + 1, close, max);
        }
        if(close < open) {
            helper(result, str + ')', open, close + 1, max);
        }
    }

    public static void main(String[] args) {
        System.out.println(generate(3));
    }
}
