package Recursion;
import java.util.ArrayList;

public class Subsequence {

    static ArrayList<String> subSeq(String str) {
        if(str.length() == 0) {
            ArrayList<String> empArrayList = new ArrayList<>();
            empArrayList.add("");
            return empArrayList;
        }
        // str = ravi
        char currentChar = str.charAt(0);
        // currentChar = 'r'
        String remString = str.substring(1);
        // remString = "avi"
        ArrayList<String> temp =  subSeq(remString);
        ArrayList<String> result = new ArrayList<>();
        for(String s : temp) {
            result.add(s);
            result.add(currentChar + s);
        }
        return result;
    }

    public static void main(String[] args) {
        String str = "ravi";
        ArrayList<String> s = subSeq(str);
        System.out.println(s);
    }
}