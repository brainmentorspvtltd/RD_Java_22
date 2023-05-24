import java.util.Arrays;
import java.util.HashMap;

public class PairSum {

    static void approach_1(int arr[], int k) {
        for(int i = 0; i < arr.length; i++) {
            for(int j = i+1; j < arr.length; j++) {
                int sum = arr[i] + arr[j];
                if(sum == k) {
                    System.out.println("Pair Found : " + arr[i] + "," + arr[j]);
                    return;
                }
            }
        }
    }

    // Using Hashing
    static void approach_2(int arr[], int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++) {
            if(map.get(arr[i]) == null) {
                map.put(k - arr[i], arr[i]);
            }
            else {
                System.out.println(map.get(arr[i]) + "," + arr[i]);
                return;
            }
        }
    }

    static void approach_3(int arr[], int k) {
        Arrays.sort(arr);
        // {1,3,5,6,7,9}

    }

    public static void main(String[] args) {
        int arr[] = {3,1,5,7,6,9};
        int k = 11;
        approach_1(arr, k);
        approach_2(arr, k);
    }
}
