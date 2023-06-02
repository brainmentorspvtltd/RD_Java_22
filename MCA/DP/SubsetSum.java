public class SubsetSum {

    static boolean subset(int arr[], int sum, int n) {
        if(n < 0 || sum < 0) {
            return false;
        }
        if(sum == 0) {
            return true;
        }
        return subset(arr, sum - arr[n], n-1) || subset(arr, sum, n-1);
    }

    public static void main(String[] args) {
        
    }
}
