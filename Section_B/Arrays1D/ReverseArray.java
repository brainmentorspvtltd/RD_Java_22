package Arrays1D;

public class ReverseArray {
    public static void main(String[] args) {
        int arr[] = {2,1,4,7,8,9};
        int n = arr.length;
        int i = 0;
        int j = n-1;
        while(i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
