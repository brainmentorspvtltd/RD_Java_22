public class ReverseString {

    static String reverse(String str) {
        // Termination Case
        if(str.length() == 1) {
            return str;
        }
        return reverse(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        String str = "Hello World";
        String revStr = reverse(str);
        System.out.println(revStr);
    }
}
