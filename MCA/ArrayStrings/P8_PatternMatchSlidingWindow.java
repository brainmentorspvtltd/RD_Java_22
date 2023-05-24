package ArrayStrings;

public class P8_PatternMatchSlidingWindow {
    static void patternMatch(String s1, String pattern) {
        for(int i = 0; i < s1.length() - pattern.length(); i++) {
            int j;
            for(j = 0; j < pattern.length(); j++) {
                if(pattern.charAt(j) != s1.charAt(i+j)) {
                    break;
                }
            }
            if(j == pattern.length()) {
                System.out.println("Pattern Found at : " + i);
            }
        }
        System.out.println("No Pattern Found...");
    }   
    
    public static void main(String[] args) {
        String s1 = "ABABABCD";
        String pattern = "ABAB";
        patternMatch(s1, pattern);
    }
}
