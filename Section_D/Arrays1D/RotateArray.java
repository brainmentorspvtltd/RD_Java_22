public class RotateArray {

    static void rotate(int arr[], int n) {
        int temp = arr[0];
        int i;
        for(i = 0; i < n-1; i++) {
            arr[i] = arr[i+1];
        }
        arr[i] = temp;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int n = arr.length;
        rotate(arr, n);
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + ",");
        }
    }
}
