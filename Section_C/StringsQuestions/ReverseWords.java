package ArraysStrings;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseWords {

    static void reverse(String str) {
        str = str.trim();   // remove leading and trailing spaces
        String[] words = str.split(" ");    // {"hello", "world"}
        List<String> wordList = Arrays.asList(words);   // ["hello", "world"]
        Collections.reverse(wordList);  // {"world", "hello"}
        String result = String.join(" ", wordList);     // "world hello"
        System.out.println(result);
    }
    public static void main(String[] args) {
        String str = "hello world";
        reverse(str);
    }
}
