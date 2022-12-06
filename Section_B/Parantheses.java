package Backtracking;

import java.util.ArrayList;

public class Parantheses {

    static ArrayList<String> generate(int n) {
        ArrayList<String> result = new ArrayList<>();
        helper(result, "", 0, 0, n);
        return result;
    }

    static void helper(ArrayList<String> result, String currBracket, int open, int close, int max) {

        if(currBracket.length() == max * 2) {
            result.add(currBracket);
            return;
        }

        if(open < max) {
            helper(result, currBracket + "(", open + 1, close, max);
        }
        if(close < open) {
            helper(result, currBracket + ")", open, close + 1, max);
        }

    }

    public static void main(String[] args) {
        int n = 3;
        ArrayList<String> res = generate(n);
        System.out.println(res);
    }
}
