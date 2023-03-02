public class BuySellStock {

    static void approach_1(int arr[]) {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(max < arr[j] - arr[i]) {
                    max = arr[j] - arr[i];
                }
            }
        }
        System.out.println("Profit is : " + max);
    }

    static void approach_2(int arr[]) {
        int pmin[] = new int[arr.length];
        pmin[0] = arr[0];
        for(int i = 1; i < arr.length; i++) {
            pmin[i] = Math.min(arr[i], pmin[i-1]);
        }
        int profit = 0;
        int finalProfit = 0;
        for(int i = 0; i < arr.length; i++) {
            profit = arr[i] - pmin[i];
            finalProfit = Math.max(finalProfit, profit);
        }
    }

    static void approach_3(int arr[]) {
        int profit = 0;
        int finalProfit = 0;
        int min = arr[0];
        for(int i = 1; i < arr.length; i++) {
            profit = arr[i] - min;
            finalProfit = Math.max(finalProfit, profit);
            min = Math.min(min, arr[i]);
        }
    }

    public static void main(String[] args) {
        int arr[] = {7,1,5,3,6,4};
        approach_1(arr);
    }
}
