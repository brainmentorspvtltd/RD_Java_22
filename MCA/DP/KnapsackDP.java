public class KnapsackDP {

    static int ks(int W, int wt[], int val[], int n) {
        int k[][] = new int[n+1][W+1];
        int i, w;
        for(i = 0; i <= n; i++) {
            for(w = 0; w <= W; w++) {
                if(i == 0 || w == 0) {
                    k[i][w] = 0;
                }
                else if(wt[i-1] <= w) {
                    k[i][w] = Math.max(val[i-1] + k[i-1][w-wt[i-1]], k[i-1][w]);
                }
                else {
                    k[i][w] = k[i-1][w];
                }
            }
        }
        return k[n][W];
    }

    public static void main(String[] args) {
        int wt[] = {1,3,4,5};
        int val[] = {1,4,5,7};
        int W = 7;
        int n= wt.length;
        int res = ks(W, wt, val, n);
        System.out.println(res);
    }
}
