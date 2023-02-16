package Array1D;

public class ArrayIntroduction {
    public static void main(String[] args) {
        // int arr_1[] = {1,2,3,4};
        // int []arr_2 = {1,2,3,4};
        // int[] arr_3 = {1,2,3,4};
        // int arr_4[] = new int[4];
        int arr[] = new int[]{3,12,5,6};
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        for(int i : arr) {
            System.out.println(i);
        }
    }
}
