public class TimeSpace {

    void approach_1(int n) {
        int sum = 0;
        for(int i = 0; i < n; i++) {
            sum += i;
        }
        System.out.println("Sum is : " + sum);
    }

    int approach_2(int n) {
        return n * (n + 1) / 2;
    }

    void approach_3(int n) {
        int sum = 0;
        for(int i = 0; i <= n; i++) {
            for(int j = 0; j < i; j++) {
                sum++;
            }
        }
    }

    public static void main(String[] args) {
        
    }
}
