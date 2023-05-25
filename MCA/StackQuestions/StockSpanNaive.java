public class StockSpanNaive {

    static void stockSpan(int arr[], int n) {
        for(int i = 0; i < n; i++) {
            int counter = 1;
            for(int j = i - 1; j >= 0 && arr[j] <= arr[i]; j--) {
                counter++;
            }
            System.out.print(counter + ",");
        }
    }

    public static void main(String[] args) {
        int arr[] = {100,80,60,70,60,75,85};
        int n = 7;
        stockSpan(arr, n);
    }
}
