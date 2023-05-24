import java.util.HashMap;
import java.util.Stack;

public class BalancedParentheses {

    static boolean isValid(String str) {
        Stack<Character> st = new Stack<>();
        HashMap<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');

        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == '(' || ch == '[' || ch == '{') {
                st.push(ch);
            }
            else {
                char current = st.pop();
                current = map.get(current);
                if(current != ch) {
                    System.out.println("Invalid Bracket");
                    return false;
                }
            }
        }
        if(st.isEmpty()) {
            System.out.println("Valid Brackets...");
            return true;
        }
        return false;

    }

    public static void main(String[] args) {
        
    }
}