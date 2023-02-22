public class RotateArray {

    static void approach_1(int arr[], int n, int k) {
        // Extra Space
        int temp[] = new int[n];
        for(int i = 0; i < n; i++) {
            temp[(k+i) % n] = arr[i];
        }
        for(int i = 0; i < n; i++) {
            System.out.print(temp[i] + ",");
        }
    }

    static void reverse(int i, int j, int arr[]) {
        while(i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int n = arr.length;
        int k = 3;
        reverse(0, n-k-1, arr);
        reverse(n-k, n-1, arr);
        reverse(0, n-1, arr);
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
    }
}
