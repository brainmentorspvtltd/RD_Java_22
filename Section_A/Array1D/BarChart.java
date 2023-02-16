public class BarChart {
    static int getMax(int arr[], int n) {
        int max = arr[0];
        for(int i = 1; i < n; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        // System.out.println("Max Element is : " + max);
        return max;
    }
    public static void main(String[] args) {
        int arr[] = {3,1,2,0,5,7};
        int n = arr.length;
        int max = getMax(arr, n);
        for(int i = max; i >= 1; i--) {
            for(int j = 0; j < n; j++) {
                if(i <= arr[j]) {
                    System.out.print("*\t");
                }
                else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }

    }
}
