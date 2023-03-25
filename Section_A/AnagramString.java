public class AnagramString {
    static boolean solution(String s1, String s2) {
        if(s1.length() != s1.length()) {
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
        String s1 = "silent";
        String s2 = "listen";

    }
}
