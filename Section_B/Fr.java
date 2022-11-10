import java.util.HashMap;

public class Fr {
    public static void main(String[] args) {
        String str = "ram kumar";
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i  = 0; i<str.length(); i++){
            char singleChar = str.charAt(i);
            if(singleChar == ' '){
                continue;
            }
            if(map.get(singleChar)== null){
                map.put(singleChar, 1);
            }
            else{
                int count = map.get(singleChar);
                map.put(singleChar, count+1);
            }
        }
        System.out.println(map);

    }
}
