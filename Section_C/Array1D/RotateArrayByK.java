public class RotateArrayByK {

    static void reverse(int i, int j, int arr[]) {
        int temp;
        while(i < j) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int k = 3;
        int n = arr.length;
        // int temp[] = new int[n];
        // for(int i = 0; i < n; i++) {
        //     temp[(i+k) % n] = arr[i];
        // }
        reverse(0, n-k-1, arr);
        // {4,3,2,1,5,6,7}
        reverse(n-k, n-1, arr);
        // {4,3,2,1,7,6,5}
        reverse(0, n-1, arr);
        // {5,6,7,1,2,3,4}
    }
}
