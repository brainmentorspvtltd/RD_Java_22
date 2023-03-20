package StringsQuestions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseWords {
    public static void main(String[] args) {
        String str = "the sky is blue";
        str = str.trim(); // remove leading and trailing spaces
        List<String> wordList = Arrays.asList(str.split(" "));
        Collections.reverse(wordList);
        String.join(" ", wordList);
        
    }
}
