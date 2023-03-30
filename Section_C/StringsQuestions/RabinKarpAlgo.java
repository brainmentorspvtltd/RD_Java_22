package StringsQuestions;

public class RabinKarpAlgo {
    public static void main(String[] args) {
        String str = "BABCDBCABC";
        String pat = "ABC";
        int n = str.length();
        int m = pat.length();
        int w = pat.length();
        int patHash = 0;
        int stringHash = 0;
        int q = 13;
        int x = 1;

        // pow(w, p-1)
        for(int i = 0; i < m-1; i++) {
            x = (x * w) % q;
        }

        for(int i = 0; i < m; i++) {
            patHash = (patHash * w + pat.charAt(i)) % q;
            stringHash = (stringHash * w + str.charAt(i)) % q;
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
                // Remove first char hash
                stringHash = stringHash - str.charAt(i) * x;
                // Add next char hash
                stringHash = (stringHash * w + str.charAt(i + m)) % q;
                if(stringHash < 0) {
                    stringHash = stringHash + q;
                }
            }
        }

    }
}