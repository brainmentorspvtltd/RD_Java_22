package Stack;

import java.util.Stack;

public class InfixToPostfix {

    static int precedence(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }

    static String convert(String str) {
        String result = "";
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if(Character.isLetterOrDigit(c)) {
                result += c;
            }

            else if(c == '(') {
                st.push(c);
            }
            else if(c == ')') {
                while(!st.isEmpty() && st.peek() != '(') {
                    result += st.pop();
                }
                if(!st.isEmpty() && st.peek() != '(') {
                    return "Invalid Expression";
                }
                else {
                    st.pop();
                }
            }
            else {
                // Check precendence and store
                while(!st.isEmpty() && precedence(c) <= precedence(st.peek())) {
                    if(st.peek() == '(') {
                        return "Invalid Expression";
                    }
                    result += st.pop();
                }
            }

            while(!st.isEmpty()) {
                if(st.peek() == '(') {
                    return "Invalid Expression";
                }
                result += st.pop();
            }

        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(precedence('+'));
    }
}
