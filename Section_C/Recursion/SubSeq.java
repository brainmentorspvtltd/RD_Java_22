package Recursion;

import java.util.ArrayList;

public class SubSeq {

    static ArrayList<String> getSubSeq(String str) {
        // Base Case
        if(str.length() == 0) {
            ArrayList<String> arr = new ArrayList<>();
            arr.add("");
            return arr;
        }
        char currentChar = str.charAt(0);
        String remString = str.substring(1);
        ArrayList<String> temp = getSubSeq(remString);

        ArrayList<String> result = new ArrayList<>();
        for(String s : temp) {
            result.add(s);
            result.add(currentChar + s);
        }

        return result;
    }

    public static void main(String[] args) {
        String str = "ravi";
        ArrayList<String> res = getSubSeq(str);
        for(String s : res) {
            System.out.print(s + ",");
        }
    }
}
