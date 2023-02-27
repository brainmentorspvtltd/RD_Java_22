package Arrays1D;

public class BuySellStock {

    static void approach_1(int arr[]) {
        int n = arr.length;
        int first = 0;
        int last = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                int diff = arr[j] - arr[i];
                if(max < diff) {
                    max = diff;
                    first = arr[i];
                    last = arr[j];
                }
            }
        }
        System.out.println(first + "," + last);
    }

    static void approach_2(int arr[]) {
        int n = arr.length;
        int profit = 0;
        int finalProfit = 0;
        int prefixMin[] = new int[n];
        prefixMin[0] = arr[0];
        for(int i = 1; i < n; i++) {
            prefixMin[i] = Math.min(prefixMin[i-1], arr[i]);
        }
        for(int i = 1; i < n; i++) {
            finalProfit = arr[i] - prefixMin[i];
            profit = Math.max(finalProfit, profit);
        }
    }

    public static void main(String[] args) {
        int arr[] = {7,2,3,8,1,4};
        approach_1(arr);
    }
}
