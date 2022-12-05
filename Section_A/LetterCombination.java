import java.util.ArrayList;

public class LetterCombination {

    static String keyPadKeys[] = {"","+@$","abc","def","ghi","jkl","mno","pqrs", "tuv", "wxyz"};
    
    static ArrayList<String> keypad(String number) {
        if(number.length() == 0) {
            ArrayList<String> str = new ArrayList<>();
            str.add("");
            return str;
        }
        char firstNum = number.charAt(0);
        String remString = number.substring(1);
        int index = firstNum - '0';
        String key = keyPadKeys[index];
        ArrayList<String> result = new ArrayList<>();
        for(int i = 0; i < key.length(); i++) {
            ArrayList<String> temp = keypad(remString);
            for(String str : temp) {
                result.add(key.charAt(i) + str);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String number = "23";
        keypad(number);
    }
}
