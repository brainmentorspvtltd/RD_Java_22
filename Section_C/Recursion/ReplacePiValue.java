package Recursion;

public class ReplacePiValue {

    static String replace(String str, int i) {
        // Termination Case
        if(i == str.length()) {
            return "";
        }
        if(str.charAt(i) == 'p' && str.charAt(i + 1) == 'i') {
            return "3.14" + replace(str, i+2);
        }
        else {
            return str.charAt(i) + replace(str, i+1);
        }
    }

    public static void main(String[] args) {
        String str = "pi4+6*pi+8";
        String str_2 = replace(str, 0);
        System.out.println(str_2);
    }
}
