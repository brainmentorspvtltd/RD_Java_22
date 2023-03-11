public class MaxSumOfKElements {
    public static void main(String[] args) {
        int arr[] = {1,40,30,10,20,5};
        int k = 3;
        int slideSum = 0;
        int maxSum = 0;
        for(int i = 0; i < k; i++) {
            slideSum += arr[i];
        } 
        maxSum = slideSum;
        for(int i = k; i < arr.length; i++) {
            slideSum += arr[i] - arr[i - k];
            if(slideSum > maxSum) {
                maxSum = slideSum;
            }
        }
    }
}
