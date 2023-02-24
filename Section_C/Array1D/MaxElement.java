import java.util.Arrays;

public class MaxElement {

    static void approach_1(int arr[], int n) {
        boolean isMax;
        for(int i = 0; i < arr.length; i++) {
            isMax = true;
            for(int j = 0; j < arr.length; j++) {
                if(arr[j] > arr[i]) {
                    isMax = false;
                    break;
                }
            }
            if(isMax) {
                System.out.println("Max Element : " + arr[i]);
                return;
            }
        }
    }

    static void approach_2(int arr[], int n) {
        Arrays.sort(arr);
    }

    static void approach_3(int arr[], int n) {
        int max = arr[0];
        for(int i = 1; i < n; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Max Element : " + max);
    }

    public static void main(String[] args) {
        int arr[] = {2,1,5,6,11,4};
        int n = arr.length;
        approach_1(arr, n);
    }
}
