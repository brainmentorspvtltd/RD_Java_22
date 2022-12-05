import java.util.ArrayList;

public class Parantheses {

    static ArrayList<String> generate(int n) {
        ArrayList<String> result = new ArrayList<>();
        helper(result, "", 0, 0, n);
        return result;
    }

    static void helper(ArrayList<String> ans, String currentBracket, int open, int close, int max) {
        if(currentBracket.length() == max * 2) {
            ans.add(currentBracket);
            return;
        }

        if(open < max) {
            helper(ans, currentBracket + "(", open + 1, close, max);
        }
        if(close < open) {
            helper(ans, currentBracket + ")", open, close + 1, max);
        }

    }

    public static void main(String[] args) {
        generate(3);
    }
}
