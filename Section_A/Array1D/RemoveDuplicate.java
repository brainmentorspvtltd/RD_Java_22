public class RemoveDuplicate {

    static int remove(int arr[], int n) {
        int j =0;
        for(int i = 1; i < n; i++) {
            if(arr[j] != arr[i]) {
                j++;
                arr[j] = arr[i];
            }
        }
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + ",");
        }
        return j+1;
    }

    public static void main(String[] args) {
        int arr[] = {0,0,1,1,1,2,2,3,3,4};
        int n = arr.length;
        int count = remove(arr, n);
        System.out.println("Count : " + count);
    }
}
