package Backtracking;

import java.util.ArrayList;

public class LetterCombination {

    static String keypadKeys[] = {
        ".", "@#", "abc", "def", "ghi", "jkl", "mno",
        "pqrs", "tuv", "wxyz"
    };

    static ArrayList<String> keypad(String number) {

        if(number.length() == 0) {
            ArrayList<String> s = new ArrayList<>();
            s.add("");
            return s;
        }

        char firstChar = number.charAt(0);
        String remString = number.substring(1);
        int index = firstChar - '0';
        String key = keypadKeys[index];
        ArrayList<String> result = new ArrayList<>();
        for(int i = 0; i < key.length(); i++) {

            ArrayList<String> temp = keypad(remString);
            for(String s : temp) {
                result.add(key.charAt(i) + s);
            }

        }

        return result;
    }

    public static void main(String[] args) {
        ArrayList<String> output = keypad("23");
        System.out.println(output);
    }
}