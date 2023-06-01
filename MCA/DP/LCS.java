public class LCS {

    static int lcs(String first, String second) {
        if(first.length() == 0 || second.length() == 0) {
            return 0;
        }
        int count = 0;
        if(first.charAt(0) == second.charAt(0)) {
            count = 1 + lcs(first.substring(1), second.substring(1));
        }
        else {
            int result_1 = lcs(first.substring(1), second);
            int result_2 = lcs(first, second.substring(1));
            count = Math.max(result_1, result_2);
        }
        return count;
    }

    static int lcs_memo(String a, String b, int m, int n, int dp[][]) {
        if(m == 0 || n == 0) {
            return 0;
        }
        if(dp[m-1][n-1] != 0) {
            return dp[m-1][n-1];
        }
        if(a.charAt(m-1) == b.charAt(n-1)) {
            dp[m-1][n-1] = 1 + lcs_memo(a.substring(1), b.substring(1), m-1, n-1, dp);
        }
        else {
            dp[m-1][n-1] = Math.max(lcs_memo(a, b, m-1, n, dp), lcs_memo(a, b, m, n-1, dp));
        }
        return dp[m-1][n-1];
    }

    static int lcs_tabulation(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();

        int matrix[][] = new int[m+1][n+1];
        for(int i = 0; i <= m; i++) {
            for(int j = 0; j <= n; j++) {
                if(i == 0 || j== 0) {
                    matrix[i][j] = 0;
                }
                else {
                    if(s1.charAt(i-1) == s2.charAt(j-1)) {
                        matrix[i][j] = matrix[i-1][j-1] + 1;
                    }
                    else {
                        matrix[i][j] = Math.max(matrix[i-1][j], matrix[i][j-1]);
                    }
                }
            }
        }
        return matrix[m][n];
    }

    public static void main(String[] args) {
        int res = lcs("ABCDGH", "AEDCHR");
        System.out.println(res);
    }
}
