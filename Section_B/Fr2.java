import java.util.HashMap;

public class Fr2 {
    static HashMap<Character, Integer> getFr(String str, int len , int index){
        if(index == len){
            HashMap<Character, Integer> map = new HashMap<>();
            return map;
        }
        HashMap<Character, Integer> map = getFr(str, len, index + 1);
        char singleChar = str.charAt(index);
        if(map.get(singleChar)==null){
            map.put(singleChar, 1);
        }
        else{
            int count  = map.get(singleChar);
            map.put(singleChar , count + 1);
        }
        return map;
    }
    public static void main(String[] args) {
        String str = "ram kumar";
        HashMap<Character, Integer> map = getFr(str, str.length(), 0);
        System.out.println(map);
    }
}
