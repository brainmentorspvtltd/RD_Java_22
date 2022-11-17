package Recursion;

public class AdjacentStars {
    static String output = "";
    static void adjStars(String str, int i) {
        output = output + str.charAt(i);
        if(i == str.length() - 1) {
            return;
        }
        if(str.charAt(i) == str.charAt(i + 1)) {
            output = output + "*";
        }
        adjStars(str, i+1);
    }

    public static void main(String[] args) {
        String str = "abbaabaab";        
        adjStars(str, 0);
        System.out.println(output);
    }
}
