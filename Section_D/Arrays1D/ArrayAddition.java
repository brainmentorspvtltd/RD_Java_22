public class ArrayAddition {
    public static void main(String[] args) {
        int first[] = {9,9,3,4,5};
        int second[] = {9,5,7,8};
        int result[] = new int[first.length > second.length ? first.length : second.length];
        int i = first.length - 1;
        int j = second.length - 1;
        int k = result.length - 1;
        int sum = 0;
        int carry = 0;
        while(k >= 0) {
            if(i >= 0 && j >= 0) {
                sum = first[i] + second[j] + carry;
            }
            else if(i >= 0 && j < 0) {
                sum = first[i] + carry;
            }
            else if(j >= 0 && i < 0) {
                sum = second[j] + carry;
            }
            
            result[k] = sum % 10;
            carry = sum / 10;
            i--;
            j--;
            k--;
        }
    }
}
