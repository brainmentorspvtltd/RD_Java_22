public class MCP {

    static int minCostPath(int cost[][], int m, int n) {
        if(n < 0 || m < 0) {
            return Integer.MAX_VALUE;
        }
        else if(m == 0 && n == 0) {
            return cost[m][n];
        }
        else {
            return cost[m][n] + Math.min(Math.min(minCostPath(cost, m-1, n-1), 
            minCostPath(cost, m-1, n)), minCostPath(cost, m, n-1));
        }
    }

    public static void main(String[] args) {
        
    }
}
