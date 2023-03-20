package ArraysStrings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Anagrams {
    static void anagram(String arr[]) {
        HashMap<String, List<String>> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++) {
            String word = arr[i];   // cat
            char letters[] = word.toCharArray();    // {'c','a','t'}
            Arrays.sort(letters);   // {'a','c','t'}
            String newWord = new String(letters);   // "act"
            if(map.containsKey(newWord)) {
                map.get(newWord).add(word);
            }
            else {
                List<String> words = new ArrayList<>();
                words.add(word);
                map.put(newWord, words);
            }
        }
    }
    public static void main(String[] args) {
        String arr[] = {"cat", "act", "dog", "god", "boy"};
    }
}
