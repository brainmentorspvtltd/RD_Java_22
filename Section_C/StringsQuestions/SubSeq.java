package StringsQuestions;

import java.util.ArrayList;

public class SubSeq {
    static void solution(String str) {
        ArrayList<String> list = new ArrayList<>();
        for(int i = 0; i < str.length(); i++) {
            char singleChar = str.charAt(i);
            if(list.size() == 0) {
                list.add("");
                list.add("" + singleChar);
                continue;
            }
            int n = list.size();
            for(int j = 0; j < n; j++) {
                String temp = list.get(j) + singleChar;
                if(!list.contains(temp)) {
                    list.add(temp);
                }
            }
        }
        System.out.println(list);
    }
    public static void main(String[] args) {
        String str = "ravi";
        solution(str);
    }
}
