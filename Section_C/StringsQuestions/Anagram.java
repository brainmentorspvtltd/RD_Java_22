package StringsQuestions;

public class Anagram {

    static boolean solution(String str_1, String str_2) {
        if(str_1.length() != str_2.length()) {
            return false;
        }
        final int CHAR = 256;
        int count[] = new int[CHAR];
        for(int i = 0; i < str_1.length(); i++) {
            count[str_1.charAt(i)]++;
            count[str_2.charAt(i)]--;
        }
        for(int i = 0; i < CHAR; i++) {
            if(count[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str_1 = "listen";
        String str_2 = "silent";
    }
}
