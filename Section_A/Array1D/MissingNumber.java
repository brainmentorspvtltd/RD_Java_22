public class MissingNumber {

    static void approach_1(int arr[]) {
        int x = 0;
        int y = 0;
        int n = arr.length;
        for(int i = 0; i < n; i++) {
            x = x ^ arr[i];
            System.out.println(x);
        }
        for(int i = 0; i <= n+1; i++) {
            y = y ^ i;
            System.out.println(y);
        }
        int missing = x ^ y;
        System.out.println("Missing Number : " + missing);

    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,5};
        // int arr[] = {3,0,1};
        approach_1(arr);
    }
}
