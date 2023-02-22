public class ArrayAddition {
    public static void main(String[] args) {
        int first[] = {9,2,3,4,5};
        int second[] = {4,5,2,7,9};
        int result[] = new int[first.length > second.length ? first.length : second.length];
        int i = first.length - 1;
        int j = second.length - 1;
        int k = result.length - 1;
        int carry = 0;
        int sum = 0;
        while(k >= 0) {
            if(i >= 0 && j >= 0) {
                sum = first[i] + second[j] + carry;
            }
            else if(i >= 0 && j < 0) {
                sum = first[i] + carry;
            }
            else if(i < 0 && j >= 0) {
                sum = second[j] + carry;
            }
            
            carry = sum/10;
            sum = sum % 10;
            result[k] = sum;
            i--;
            j--;
            k--;
        }
        if(carry != 0) {
            System.out.print(carry);
        }
        for(int e : result) {
            System.out.print(e);
        }
    }
}
