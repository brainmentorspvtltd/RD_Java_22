public class AdjacentStars {
    static String output = "";
    static void adjStar(String str, int i) {
        output = output + str.charAt(i);
        if(i == str.length() - 1) {
            return;
        }
        if(str.charAt(i) == str.charAt(i + 1)) {
            output = output + "*";
        }
        adjStar(str, i+1);
    }

    public static void main(String[] args) {
        String str = "abbaaba";
        adjStar(str, 0);
        System.out.println(output);
    }
}
