public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50,60,70,80,90};
        int n = arr.length;
        int low = 0;
        int high = n - 1;
        int mid = 0;
        int search = 70;
        while(low < high) {
            mid = (low + high) / 2;
            if(search == arr[mid]) {
                System.out.println("Element Found...");
                return;
            }
            if(search > arr[mid]) {
                low = mid + 1;
            }
            else if(search < arr[mid]) {
                high = mid - 1;
            }
        }
        System.out.println("Element not found...");
    }
}
