import java.util.HashMap;

public class FreqCountRec {
    static HashMap<Character, Integer> getCount(String str, int len, int i) {

        if(i == len) {
            HashMap<Character, Integer> map = new HashMap<>();
            return map;
        }

        HashMap<Character, Integer> map = getCount(str, len, i + 1);
        char singleChar = str.charAt(i);
        if(map.get(singleChar) == null) {
            map.put(singleChar, 1);
        }
        else {
            int prevCount = map.get(singleChar);
            map.put(singleChar, prevCount + 1);
        }
        return map;
    }

    public static void main(String[] args) {
        String str = "ram sharma";
        int n = str.length();
        getCount(str, n, 0);
    }
}
