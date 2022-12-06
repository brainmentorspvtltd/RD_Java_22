package Backtracking;

import java.util.ArrayList;

public class LetterCombination {

    static String keypadKeys[] = {".", "@#$", "abc", "def", "ghi", "jkl", 
    "mno", "pqrs", "tuv", "wxyz"};

    static ArrayList<String> keypad(String number) {

        // Base Case
        if(number.length() == 0) {
            ArrayList<String> str =  new ArrayList<>();
            str.add("");
            return str;
        }

        char firstnum = number.charAt(0);
        String remString = number.substring(1);
        // ASCII Subtraction
        int index = firstnum - '0';
        String key = keypadKeys[index];
        ArrayList<String> result = new ArrayList<>();
        for(int i = 0; i < key.length(); i++) {
            ArrayList<String> temp = keypad(remString);
            for(String str : temp) {
                result.add(key.charAt(i) + str);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        ArrayList<String> output = keypad("23");
        System.out.println(output);
    }
}
