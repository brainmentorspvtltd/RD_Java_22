import java.util.Stack;

public class StockSpanUsingStack {

    static void stockSpan(int arr[], int n) {
        Stack<Integer> st = new Stack<>();
        st.push(0);
        System.out.print(1 + ",");
        int span = 0;
        for(int i = 1; i < n; i++) {
            while(st.isEmpty() == false && arr[st.peek()] <= arr[i]) {
                st.pop();
            }
            span = st.isEmpty() ? i + 1 : i - st.peek();
            System.out.print(span + ",");
            st.push(i);
        }
    }

    public static void main(String[] args) {
        int arr[] = {100,80,60,70,60,75,85};
        int n = 7;
        stockSpan(arr, n);
    }
}
