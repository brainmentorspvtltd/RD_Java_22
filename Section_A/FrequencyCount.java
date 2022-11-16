import java.util.HashMap;

public class FrequencyCount {
    public static void main(String[] args) {
        String str = "ram sharma";
        // str.charAt(0)
        // str.substring(0)
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < str.length(); i++) {
            char singleChar = str.charAt(i);
            if(singleChar == ' ') {
                continue;
            }
            if(map.get(singleChar) == null) {
                map.put(singleChar, 1);
            }
            else {
                int prevCount = map.get(singleChar);
                map.put(singleChar, prevCount + 1);
            }
        }
        System.out.println(map);
    }
}
