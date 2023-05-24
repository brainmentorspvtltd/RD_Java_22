public class RabinKarp {
    public static void main(String[] args) {
        String str = "BABCDBABCCD";
        String pat = "ABC";
        int n = str.length();
        int m = pat.length();
        int d = 5;
        int stringHash = 0;
        int patHash = 0;

        for(int i = 0; i < m; i++) {
            patHash = patHash * d + pat.charAt(i);
            stringHash = stringHash * d + str.charAt(i);
        }

        for(int i = 0; i <= n - m; i++) {
            if(patHash == stringHash) {
                int j;
                for(j = 0; j < m; j++) {
                    if(str.charAt(i + j) != pat.charAt(j)) {
                        break;
                    }
                }
                if(j == m) {
                    System.out.println("Pattern Found at : " + i);
                }
            }
            if(i < n - m) {
                // Remove prev char hash
                stringHash = stringHash - str.charAt(i) * d;
                // add next char hash
                stringHash = (stringHash * d + str.charAt(i + m));
                if(stringHash < 0) {

                }
            }
        }
    }
}
