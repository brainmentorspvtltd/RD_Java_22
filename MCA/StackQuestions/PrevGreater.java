import java.util.Stack;

public class PrevGreater {

    static void prevGreater(int arr[], int n) {
        Stack<Integer> st = new Stack<>();
        st.push(arr[0]);
        System.out.print(-1 + ",");
        for(int i = 1; i < n; i++) {
            while(st.isEmpty() == false && st.peek() <= arr[i]) {
                st.pop();
            }
            int elem = st.isEmpty() ? -1 : st.peek();
            System.out.print(elem + ",");
            st.push(arr[i]);
        }
    }

    public static void main(String[] args) {
        int arr[] = {10, 4, 2, 20, 40, 12, 30};
        int n = arr.length;
        prevGreater(arr, n);
    }
}
